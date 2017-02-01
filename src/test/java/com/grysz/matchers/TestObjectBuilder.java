package com.grysz.matchers;

public class TestObjectBuilder {
    private String stringProp;
    private int numericProp;
    private Object objectProp;
    private Object[] anyArray;

    public TestObjectBuilder withStringProp(String stringProp) {
        this.stringProp = stringProp;
        return this;
    }

    public TestObjectBuilder withNumericProp(int numericProp) {
        this.numericProp = numericProp;
        return this;
    }

    public TestObjectBuilder withObjectProp(Object objectProp) {
        this.objectProp = objectProp;
        return this;
    }

    public TestObjectBuilder withAnyArray(Object[] anyArray) {
        this.anyArray = anyArray;
        return this;
    }

    public TestObject build() {
        return new TestObject(stringProp, numericProp, objectProp, anyArray);
    }
}
