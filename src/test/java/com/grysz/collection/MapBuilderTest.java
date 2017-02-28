package com.grysz.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class MapBuilderTest {
    @Test
    void buildsMap() {
        Map<String, String> built = MapBuilder.<String, String>newMap()
            .put("key1", "value1")
            .put("key2", "value2")
            .build();
        Map<String, String> expected = new HashMap<String, String>() {{
            put("key1", "value1");
            put("key2", "value2");
        }};

        assertThat(built, equalTo(expected));
    }

    @Test
    void builtMapIsImmutable() {
        Assertions.assertThrows(UnsupportedOperationException.class,
            () -> MapBuilder.newMap().build().put("::key::", "::value::"));
    }
}
