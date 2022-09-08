package com.guner.primitive;

public class Primitive {

    public static void main(String[] args) {
        Primitive p = new Primitive();
        p.execute();
    }

    private void execute() {
        int i;
        short s;
        long l;

        System.out.println("selam");
        // build failed java: variable i might not have been initialized
        // System.out.println(i);

    }
}
