package com.guner.java8calisma;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateAndFunctionCreate {

    public static void main(String[] args) {
        PredicateAndFunctionCreate predicateAndFunctionCreate = new PredicateAndFunctionCreate();
        predicateAndFunctionCreate.execute();
    }

    private Predicate<String> checkPrefix(String prefix) {
        Predicate<String> checkPrefixPredicate = s -> s.startsWith(prefix);
        return checkPrefixPredicate;
    }

    private Function<String, Integer> getSize() {
        Function<String, Integer> functionGetSize = s-> s.length();
        return functionGetSize;
    }

    private void execute() {

        Optional<String> optionalString= Optional.of("ramazan");
        System.out.println("Prefix check ram : " + optionalString.filter(checkPrefix("ram")).isPresent());
        System.out.println("Prefix check abc : " + optionalString.filter(checkPrefix("abc")).isPresent());

        System.out.println("Size : " + optionalString.map(getSize()).get());

    }
}
