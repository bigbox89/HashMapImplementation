package com.github.bigbox89;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntryIteratorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testConstructor() {
        Entry[] entryArray = new Entry[]{new Entry("Key", "Value")};
        assertTrue((new EntryIterator(entryArray)).hasNext());
        assertEquals(1, entryArray.length);
    }

    @Test
    public void testHasNext() {
        assertTrue((new EntryIterator(new Entry[]{new Entry("Key", "Value")})).hasNext());
        assertFalse((new EntryIterator(new Entry[]{null})).hasNext());
    }

    @Test
    public void testNext() {
        Entry entry = new Entry("Key", "Value");

        EntryIterator entryIterator = new EntryIterator(new Entry[]{entry});
        assertSame(entry, entryIterator.next());
        assertFalse(entryIterator.hasNext());
    }

    @Test
    public void testNext2() {
        EntryIterator entryIterator = new EntryIterator(new Entry[]{null});
        assertNull(entryIterator.next());
        assertFalse(entryIterator.hasNext());
    }


    @Test
    public void testRemove2() {
        thrown.expect(NegativeArraySizeException.class);
        (new EntryIterator(new Entry[]{})).remove();
    }
}

