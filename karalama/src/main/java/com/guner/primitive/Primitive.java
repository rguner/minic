package com.guner.primitive;

public class Primitive {

    public static void main(String[] args) {
        Primitive p = new Primitive();
        p.execute();
    }

    private void execute() {
        boolean bool;
        byte b;
        short s;
        char c1 = 'a';
        char c2 = 65;
        int i;
        long l;
        float f = 3.13f;
        double d = 9.15;

        System.out.println("selam");
        System.out.println(f + " " + d);
        System.out.println(c1 + " " + c2);
        // build failed java: variable i might not have been initialized
        // System.out.println(i);

        int i1 = Integer.MAX_VALUE;
        int j = i1 + 1;
        // j will roll over to -2_147_483_648 Integer.MIN_VALUE

        double d1 = Double.MAX_VALUE;
        double o = d1 + 1;
        // o will be Infinity

        System.out.println(j + " " + d1 + " " + o);

    }
}
