package com.glqdlt.utiils;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * @author Jhun
 * 2019-02-18
 */
public class MapperTest {

    @Test
    public void TestReplication() {
        TestTargetObject testTargetObject = new TestTargetObject();
        testTargetObject.setBooleanField(true);
        testTargetObject.setStringField("hello");
        testTargetObject.setIntegerField(999);
        testTargetObject.setSimpleInnerClass(new TestTargetObject.SimpleInnerClass("haha"));

        Field[] feilds = TestTargetObject.class.getDeclaredFields();
        Method[] methods = TestTargetObject.class.getDeclaredMethods();
        Stream.of(feilds).forEach(x -> {
            System.out.println(x.getName());
        });

        final String regex = "^(is|get)\\w+";

        Stream.of(methods).forEach(x -> {
            String m = x.getName();
            boolean matched = m.matches(regex);
            if(matched){
                System.out.println(m);
                try {
                    Object aaa = x.invoke(testTargetObject);
                    System.out.println(aaa.toString());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}