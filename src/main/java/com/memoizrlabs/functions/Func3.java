package com.memoizrlabs.functions;

public interface Func3<T1, T2, T3, R> extends Function<R> {
    R call(T1 t1, T2 t2, T3 t3);
}
