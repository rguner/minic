package com.guner.java8calisma;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackCalisma {

    public static void main(String[] args) {
        StackCalisma st= new StackCalisma();
        st.execute1();
    }

    private void execute1() {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        System.out.println("Stack size: " + intStack.size());

        List<Integer> intList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        boolean result = intStack.addAll(intList);
        System.out.println("Sonuç: " + result);
        System.out.println("Stack size: " + intStack.size());

        System.out.println("Search 3 : " + intStack.search(3));
        System.out.println("Search 2 : " + intStack.search(2));
        System.out.println("Search 1 : " + intStack.search(1));

        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());

        System.out.println("Peek: " + intStack.peek());
        System.out.println("Peek: " + intStack.peek());

        System.out.println("Search 3 : " + intStack.search(3));
        System.out.println("Search 2 : " + intStack.search(2));
        System.out.println("Search 1 : " + intStack.search(1));

        System.out.println("IndexOf 3 : " + intStack.indexOf(3));
        System.out.println("IndexOf 2 : " + intStack.indexOf(2));
        System.out.println("IndexOf 1 : " + intStack.indexOf(1));

        System.out.println("Stack size "+ intStack.size() );
        System.out.println("RemoveElement: " + intStack.removeElement(2) + " After removeElement, size "+ intStack.size() );
        System.out.println("RemoveElement: " + intStack.removeElement(40) + " After removeElement, size "+ intStack.size() );

        intStack.removeIf(element -> element < 6);
        System.out.println("Stack size, after remove < 6 process "+ intStack.size() );

        intStack.push(1);
        intStack.addAll(intList);
        intStack.forEach(System.out::print);
    }
}
