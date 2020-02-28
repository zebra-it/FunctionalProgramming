package com.whmcs.FunctionalInterfc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

public class _Suppler {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());

    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:4683:/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () ->
            "jdbc://localhost:4683:/users";
}
