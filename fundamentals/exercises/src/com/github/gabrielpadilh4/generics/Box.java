package com.github.gabrielpadilh4.generics;

public class Box<T> {
    private T stuff;

    public T getStuff() {
        return stuff;
    }

    public void setStuff(T stuff) {
        this.stuff = stuff;
    }
}
