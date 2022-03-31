package com.github.bigbox89;

public class EntrySet {
    private final int key;
    private final double value;
    private boolean empty;

    public EntrySet(int key, double value) {
        this.key = key;
        this.value = value;
        this.empty = true;
    }

    public int getKey() {
        return key;
    }

    public double getValue() {
        return value;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean becomeFull() {
        return empty = false;
    }

    @Override
    public String toString() {
        return "key" + key + "value" + value + "empty" + empty;
    }
}