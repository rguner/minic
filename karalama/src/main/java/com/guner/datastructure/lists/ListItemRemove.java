package com.guner.datastructure.lists;

import java.util.ArrayList;
import java.util.List;

public class ListItemRemove {

    public static void main(String[] args) {
        ListItemRemove listItemRemove = new ListItemRemove();
        listItemRemove.execute1();
    }

    private void execute1() {

        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");
        listOfBooks.add("C++");

        listOfBooks.removeIf(s -> s.contains("Code"));

        System.out.println(listOfBooks);
    }
}
