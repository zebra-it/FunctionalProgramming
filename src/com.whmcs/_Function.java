package com.whmcs;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        Integer increment2 = incrementByOneFunction.apply(2);
        System.out.println(increment2);
        int multiply = multipleByTenFunction.apply(increment2);
        System.out.println(multiply);
    }

    // functional style
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number++;
    //Chaining function
    static Function<Integer, Integer> multipleByTenFunction =
            number -> number * 10;

    // not functional style
    static int increment(int number) {
        return number + 1;
    }
}
