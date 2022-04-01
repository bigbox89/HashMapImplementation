package com.github.bigbox89;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntryTest {
    @Test
    public void testConstructor() {
        Entry<Object, Object> actualEntry = new Entry<>("Key", "Value");

        assertEquals("Key", actualEntry.getKey());
        assertEquals("Value", actualEntry.getValue());
    }
}

