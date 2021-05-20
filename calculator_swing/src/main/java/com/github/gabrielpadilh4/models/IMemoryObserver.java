package com.github.gabrielpadilh4.models;

@FunctionalInterface
public interface IMemoryObserver {

    void updatedValue(String newValue);
}
