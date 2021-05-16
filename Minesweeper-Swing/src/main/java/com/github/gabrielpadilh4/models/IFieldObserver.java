package com.github.gabrielpadilh4.models;

@FunctionalInterface
public interface IFieldObserver {

    void eventOccur(Field f, FieldEvent event);
}
