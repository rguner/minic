package com.guner.datastructure.colllection;

import java.util.Collection;
import java.util.List;

public class CollectionRunner {

    public static void main(String[] args) {
        CollectionRunner collectionRunner = new CollectionRunner();
        collectionRunner.createCollection();
    }

    private void createCollection() {
        Room room1 = Room.builder().name("Oda1").price(100).build();
        Room room2 = Room.builder().name("Oda2").price(200).build();
        Room room3 = Room.builder().name("Oda3").price(300).build();

        Collection<Room> roomCollection = List.of(room1, room2, room3); // ImmutableCollection
        int totalPrice = getTotalPrices(roomCollection);
        System.out.printf("Total price : %d\n", totalPrice);
    }

    private int getTotalPrices(Collection<Room> roomCollection) {
        return roomCollection.stream()
                .mapToInt(r -> r.getPrice())
                .sum();


    }
}
