package com.grysz.matchers;

class TestObjectBuilder {
    private String stringProp;
    private int numericProp;
    private Object objectProp;
    private Object[] anyArray;

    TestObjectBuilder withStringProp(String stringProp) {
        this.stringProp = stringProp;
        return this;
    }

    TestObjectBuilder withNumericProp(int numericProp) {
        this.numericProp = numericProp;
        return this;
    }

    TestObjectBuilder withObjectProp(Object objectProp) {
        this.objectProp = objectProp;
        return this;
    }

    TestObjectBuilder withAnyArray(Object[] anyArray) {
        this.anyArray = anyArray;
        return this;
    }

    TestObject build() {
        return new TestObject(stringProp, numericProp, objectProp, anyArray);
    }
}
