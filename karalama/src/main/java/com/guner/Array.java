package com.guner;

public class Array {

    public static void main(String[] args) {
        Integer[][] integerArray= {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        Integer first = integerArray[0][0];
        Integer last = integerArray[3][3];
        System.out.println(first + " " + last);

    }
}
