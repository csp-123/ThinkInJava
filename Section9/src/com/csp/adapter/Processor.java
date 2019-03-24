package com.csp.adapter;

public interface Processor {
    String name();
    Object process(Object input);
}
