package com.grysz.matchers;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import static org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;

public final class ReflectionEqualsMatcher<T> extends BaseMatcher<T> {
    public static <T> Matcher<T> reflectionEqualTo(T operand) {
        return new ReflectionEqualsMatcher<T>(operand);
    }

    private T expected;

    private ReflectionEqualsMatcher(T expected) {
        this.expected = expected;
    }

    @Override
    public boolean matches(Object item) {
        return EqualsBuilder.reflectionEquals(item, expected);
    }

    @Override
    public void describeMismatch(Object item, Description description) {
        description.appendText("was ").appendText(ReflectionToStringBuilder.toString(item, MULTI_LINE_STYLE));
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(ReflectionToStringBuilder.toString(expected, MULTI_LINE_STYLE));
    }
}
