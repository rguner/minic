package com.guner.primitive;


public class Unsigned {

    public static void main(String[] args) {
        Unsigned unsigned = new Unsigned();
        unsigned.execute();
    }

    private void execute() {
        int positive = Integer.MAX_VALUE;
        int negative = Integer.MIN_VALUE;
        // If we compare these numbers as signed values, positive is obviously greater than negative:

        int signedComparison = Integer.compare(positive, negative);
        int unsignedComparison = Integer.compareUnsigned(positive, negative);
        System.out.println(signedComparison + " " +  unsignedComparison);

        //When comparing numbers as unsigned values, the left-most bit is considered the most significant bit instead of the sign bit. Thus, the result is different, with positive being smaller than negative:

        // It should be clearer if we take a look at the binary representation of those numbers:

        //MAX_VALUE -> 0111_1111_…_1111
        // MIN_VALUE -> 1000_0000_…_0000
        // When the left-most bit is a regular value bit, MIN_VALUE is one unit larger than MAX_VALUE in the binary system. This test confirms that:
    }
}
