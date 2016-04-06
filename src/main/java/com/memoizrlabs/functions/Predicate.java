package com.memoizrlabs.functions;

import java.io.Serializable;

public interface Predicate<T> extends Serializable {
    boolean verify(T value);
}
