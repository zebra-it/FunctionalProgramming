package com.whmcs.FunctionalInterfc;

public interface Printable {
    static void printResultTable(String[] funcNames, String... results) {
        String[] columnNames = {
                "functionName",
                "result"
        };
        String leftAlignFormat = "| %-40s | %-3s |%n";
        String[] data = funcNames;
        System.out.format("+------------------------------------------+-----+%n");
        System.out.format("| functionName                             | res |%n");
        System.out.format("+------------------------------------------+-----+%n");
        for (int i = 0; i < data.length; i++) {
            System.out.format(leftAlignFormat, data[i], results[i]);
        }
        System.out.format("+------------------------------------------+-----+%n");


    }
}
