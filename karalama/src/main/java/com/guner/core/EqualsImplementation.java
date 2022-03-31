package com.guner.core;

import java.util.Objects;


class ComplexObject {
    private int a;
    private int b;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexObject that = (ComplexObject) obj;
        return a==that.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
public class EqualsImplementation {
    public static void main(String[] args) {
        EqualsImplementation equalsImplementation = new EqualsImplementation();
        equalsImplementation.deneme();
    }

    private void deneme() {
        ComplexObject c1= new ComplexObject();
        c1.setA(100);
        c1.setB(200);

        ComplexObject c2= new ComplexObject();
        c2.setA(100);
        c2.setB(300);


        ComplexObject c3= new ComplexObject();
        c3.setA(800);
        c3.setB(900);


        System.out.println("c1 c2 Eşit -->" + c1.equals(c2));
        System.out.println("c1 c3 Eşit -->" + c1.equals(c3));
    }
}
