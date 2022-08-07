package com.company;

public class Car implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Maschina jabylyp jatat");
    }
}
