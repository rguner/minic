package com.guner;

import java.util.Objects;
import java.util.Optional;

public class OptionalKaralama {

    public void stringDeneme() {
        Optional<String> opt = Optional.of("null değilim ben!");
        System.out.println(opt.get());
        opt.ifPresent(name -> System.out.println("opt " +name));

        Optional<String> opt2 = Optional.ofNullable(null);
        opt2.ifPresent(name -> System.out.println("opt2 " + name));

        Optional<String> opt3 = Optional.empty();
        opt3.ifPresent(name -> System.out.println("opt3 " + name));

        String name = (String) Optional.ofNullable(null).orElse("john");
        System.out.println(name);


        String ad = Optional.ofNullable("ramazan").orElse("");
        System.out.println(ad);

        User user= new User();
        user.setName("ramazangüner");
        // user=null;

        String ad2 = Optional.ofNullable(user.getName()).orElse("");
        System.out.println(ad2);




    }
}
