package com.github.bigbox89;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Ignore;

import org.junit.Test;

public class HashMapImplementationTest {
    @Test
    public void testGet() {
        assertNull((new HashMapImplementation<>()).get("Key"));
    }

    @Test
    public void testGet2() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.put("Key", "Value");
        assertEquals("Value", hashMapImplementation.get("Key"));
    }

    @Test
    public void testGet3() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.put(Short.SIZE, "Value");
        assertNull(hashMapImplementation.get("Key"));
    }

    @Test
    public void testPut() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.put("Key", "Value");
        assertEquals(1, hashMapImplementation.size());
        assertTrue(hashMapImplementation.iterator().hasNext());
    }

    @Test
    public void testPut2() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.put("Key", "Value");
        hashMapImplementation.put("Key", "Value");
        assertTrue(hashMapImplementation.iterator().hasNext());
    }

    @Test
    public void testPut3() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.put(1, "Value");
        hashMapImplementation.put("Key", "Value");
        assertEquals(2, hashMapImplementation.size());
    }

    @Test
    public void testArrayIncreasingTwice() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.arrayIncreasingTwice();
        assertTrue(hashMapImplementation.iterator() instanceof EntryIterator);
        assertEquals(0, hashMapImplementation.size());
    }

    @Test
    public void testArrayIncreasingTwice2() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.put("Key", "Value");
        hashMapImplementation.arrayIncreasingTwice();
        Iterator iteratorResult = hashMapImplementation.iterator();
        assertTrue(iteratorResult instanceof EntryIterator);
        assertEquals(1, hashMapImplementation.size());
        assertTrue(iteratorResult.hasNext());
    }

    @Test
    public void testArrayIncreasingTwice3() {
        HashMapImplementation<Object, Object> hashMapImplementation = new HashMapImplementation<>();
        hashMapImplementation.put(42, "Value");
        hashMapImplementation.put("Key", "Value");
        hashMapImplementation.arrayIncreasingTwice();
        Iterator iteratorResult = hashMapImplementation.iterator();
        assertTrue(iteratorResult instanceof EntryIterator);
        assertEquals(2, hashMapImplementation.size());
        assertTrue(iteratorResult.hasNext());
    }

    @Test
    public void testIterator() {
        assertFalse((new HashMapImplementation<>()).iterator().hasNext());
    }

    @Test
    public void testConstructor() {
        assertEquals(0, (new HashMapImplementation<>()).size());
        assertTrue((new HashMapImplementation<>()).iterator() instanceof EntryIterator);
    }
}

