package com.guner.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Hello world!
 */
public class HashCodeApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        HashCode hashCode = new HashCode();
        hashCode.contains();
        hashCode.getHashCode();

        HashCode hashCode2 = new HashCode();
        hashCode2.getHashCode();

        HashCodeApp app = new HashCodeApp();
        app.equalsKaralama();

        app.optionalKaralama();
    }

    private void optionalKaralama() {
        OptionalKaralama optionalKaralama = new OptionalKaralama();
        optionalKaralama.stringDeneme();
    }

    private void equalsKaralama() {
        User user1 = new User();
        user1.setId(10L);
        user1.setName("Ramazan");
        user1.setEmail("rguner");

        User user2 = new User();
        user2.setId(10L);
        user2.setName("Ramazan");
        user2.setEmail("rguner");

        System.out.println("HashCode1:" + user1.hashCode() + " HashCode2:" + user2.hashCode() + " " + user1.equals(user2));

        Map<User, User> users = new HashMap<>();
        users.put(user1, user1);
        users.put(user2, user2);
        if (users.containsKey(user1)) {
            System.out.print("User found in the collection");
            User user = users.get(user1);
        }


        System.out.println("Objects Hash1 " + Objects.hash(user1));
        System.out.println("Objects Hash2 " + Objects.hash(user2));
        System.out.println("Objects Hash1_2 " + Objects.hash(user1, user2));

    }
}
