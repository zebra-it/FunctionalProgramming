package com.whmcs;

import javax.swing.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Integer increment = increment(0);

        Integer increment2 = incrementByOneFunction.apply(0);

        Integer multiply = multipleByTenFunction.apply(increment2);

        //Chaining function
        Function<Integer, Integer> addByOneAndThemMultiplyBy10
                = incrementByOneFunction.andThen(multipleByTenFunction);
        Integer apply = addByOneAndThemMultiplyBy10.apply(1);

        Integer incrementByOneAndMultiply = incrementByOneAndMultiply(4, 100);

        Integer incrementBiFunction = incrementByOneAndMultiplyBiFunction.apply(4, 100);

        String[] funcNames = {
                "not functional style",
                "incrementByOneFunction",
                "multipleByTenFunction",
                "incrementByOneAndMultiply",
                "multipleByTenFunction",
                "incrementByOneAndMultiplyBiFunction"
        };
        Printable.printResultTable(funcNames, increment.toString(), increment2.toString(), multiply.toString(),
                apply.toString(), incrementByOneAndMultiply.toString(), incrementBiFunction.toString());

    }


    // functional style
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multipleByTenFunction =
            number -> number * 10;
    // BiFunction takes 2 argument and produce 1 result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction
            = (numToIncrementByOne, numToMultiplyBy)
            -> (numToIncrementByOne + 1) * numToMultiplyBy;

    // not functional style
    static Integer increment(Integer number) {
        return number + 1;
    }

    static Integer incrementByOneAndMultiply(Integer number, Integer numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}
