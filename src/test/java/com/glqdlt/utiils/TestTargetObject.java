package com.glqdlt.utiils;

/**
 * @author Jhun
 * 2019-02-18
 */
public class TestTargetObject {
    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public Integer getIntegerField() {
        return integerField;
    }

    public void setIntegerField(Integer integerField) {
        this.integerField = integerField;
    }

    public boolean isBooleanField() {
        return booleanField;
    }

    public void setBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
    }

    private String stringField;
    private Integer integerField;
    private boolean booleanField;

    public SimpleInnerClass getSimpleInnerClass() {
        return simpleInnerClass;
    }

    public void setSimpleInnerClass(SimpleInnerClass simpleInnerClass) {
        this.simpleInnerClass = simpleInnerClass;
    }

    private SimpleInnerClass simpleInnerClass;

    public static class SimpleInnerClass{
        public String getSimple() {
            return simple;
        }

        public void setSimple(String simple) {
            this.simple = simple;
        }

        public SimpleInnerClass(String simple) {
            this.simple = simple;
        }

        @Override
        public String toString() {
            return "SimpleInnerClass{" +
                    "simple='" + simple + '\'' +
                    '}';
        }

        private String simple;
    }
}
