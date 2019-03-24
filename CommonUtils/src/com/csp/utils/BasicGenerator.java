package com.csp.utils;

public class BasicGenerator<T> implements Generators<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try{
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static <T> Generators<T> create(Class<T> type){
        return new BasicGenerator<>(type);
    }
}
