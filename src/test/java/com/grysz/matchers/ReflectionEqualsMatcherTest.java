package com.grysz.matchers;

import org.junit.jupiter.api.Test;

import static com.grysz.matchers.ReflectionEqualsMatcher.reflectionEqualTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

class ReflectionEqualsMatcherTest {
    private String anyString = "::string::";
    private int anyPrimitive = 99;
    private int anyOtherPrimitive = 11;
    private Object anyObject = new Object();
    private Object[] anyArray = { anyObject };

    @Test
    void matches() {
        assertThat(createTestObject(), reflectionEqualTo(createTestObject()));
    }

    @Test
    void doesntMatch() {
        TestObject other = newTestObject().withNumericProp(anyOtherPrimitive).build();
        assertThat(createTestObject(), not(reflectionEqualTo(other)));
    }

    private TestObjectBuilder newTestObject() {
        return new TestObjectBuilder()
            .withStringProp(anyString)
            .withNumericProp(anyPrimitive)
            .withObjectProp(anyObject)
            .withAnyArray(anyArray);
    }

    private TestObject createTestObject() {
        return newTestObject().build();
    }
}
