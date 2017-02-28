package com.grysz.matchers;

class TestObject {
    private final String stringProp;
    private final int numericProp;
    private final Object objectProp;
    private final Object[] anyArray;

    TestObject(String stringProp, int numericProp, Object objectProp, Object[] anyArray) {
        this.stringProp = stringProp;
        this.numericProp = numericProp;
        this.objectProp = objectProp;
        this.anyArray = anyArray;
    }
}
