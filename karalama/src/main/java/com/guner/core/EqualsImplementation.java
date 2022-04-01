package com.guner.core;

import java.util.Objects;


class ComplexObject {
    private int a;
    private int b;

    ComplexObject(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexObject that = (ComplexObject) obj;
        return a == that.a;
    }

    /*
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
     */

    /*
    public int hashCode() {
        return 100;
    }
     */

    public int hashCodeModified() {
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
        equalsImplementation.equalsDeneme();
        equalsImplementation.hashCodeDeneme();
    }

    private void hashCodeDeneme() {
        ComplexObject c1 = new ComplexObject(100, 200);
        ComplexObject c2 = new ComplexObject(100, 300);
        ComplexObject c3 = new ComplexObject(100, 200);
        System.out.println("c1 " + c1.toString() + " hashCode : " + c1.hashCode());
        System.out.println("c2 " + c2.toString() + " hashCode : " + c2.hashCode());
        System.out.println("c3 " + c3.toString() + " hashCode : " + c3.hashCode());
        System.out.println("c1 hashCodeModified : " + c1.hashCodeModified());
        System.out.println("c1 hashCodeModified : " + c2.hashCodeModified());
        System.out.println("c3 hashCodeModified : " + c3.hashCodeModified());
    }

    private void equalsDeneme() {
        ComplexObject c1 = new ComplexObject(100, 200);
        ComplexObject c2 = new ComplexObject(100, 300);
        ComplexObject c3 = new ComplexObject(100, 200);
        ComplexObject c4 = new ComplexObject(400, 600);

        System.out.println("c1 c2 Eşit --> " + c1.equals(c2));
        System.out.println("c1 c3 Eşit --> " + c1.equals(c3));
        System.out.println("c1 c4 Eşit --> " + c1.equals(c3));
    }
}
