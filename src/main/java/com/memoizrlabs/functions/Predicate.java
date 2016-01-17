package com.memoizrlabs.functions;

public interface Predicate<T> {
    boolean verify(T value);
}
