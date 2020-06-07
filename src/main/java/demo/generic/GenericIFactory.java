package com.imooc.demo.generic;

public interface GenericIFactory<T,N> {
    T nextObject();
    N nextNumber();
}
