package com.whmcs.FunctionalInterfc;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07-900-900-96"));
        System.out.println(isPhoneNumberValid("09-800-400-45"));
        System.out.println(isPhoneNumberValidPredicate.test("09-234-124-23"));
        System.out.println(isPhoneNumberValidPredicate.test("07-234-124-23"));
        boolean test = isPhoneNumberValidPredicate.and(containsNumber3).test("07-300-900-00");
        System.out.println(test);
        System.out.println(equalsStrings.test("a", "a"));

    }

    // fake validation
    static boolean isPhoneNumberValid(String phoneNumber) {
        Pattern pattern = Pattern.compile("^07-\\d{3}-\\d{3}-\\d{2}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            Pattern.compile("^07-\\d{3}-\\d{3}-\\d{2}")
                    .matcher(phoneNumber)
                    .find();

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
    static BiPredicate<String, String> equalsStrings = (str1, str2) ->
            str1.equals(str2);


}
