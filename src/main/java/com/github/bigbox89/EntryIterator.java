package com.github.bigbox89;

import java.util.Iterator;

class EntryIterator implements Iterator {

    private Entry[] entryArray;
    private int currentIndex = -1;

    EntryIterator(Entry[] entry) {
        entryArray = entry;
    }

    @Override
    public boolean hasNext() {
        for (int i = currentIndex + 1; i < entryArray.length; i++) {
            if (entryArray[i] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        for (currentIndex++; currentIndex < entryArray.length; currentIndex++) {
            if (entryArray[currentIndex] != null) {
                return entryArray[currentIndex];
            }
        }
        return null;
    }

    @Override
    public void remove() {
        Entry[] tmpArray = new Entry[entryArray.length - 1];
        for (int i = 0; i < currentIndex - 1; i++) {
            tmpArray[i] = entryArray[i];
        }
        for (int j = currentIndex + 1; j < tmpArray.length; j++) {
            if (j > 0) {
                tmpArray[j - 1] = entryArray[j];
            } else {
                break;
            }
        }
        entryArray = tmpArray;
        currentIndex--;
    }
}
