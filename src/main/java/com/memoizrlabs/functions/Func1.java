package com.memoizrlabs.functions;

public interface Func1<T1, R> extends Function<R> {
    R call(T1 t1);
}
