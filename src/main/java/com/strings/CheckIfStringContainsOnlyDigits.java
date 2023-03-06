package com.strings;

public class CheckIfStringContainsOnlyDigits {

    public static void main(String[] args) {
        String s = "343211";

        checkIfStringContainsOnlyDigits(s);
    }

    private static void checkIfStringContainsOnlyDigits(String s) {

        try{
            Integer a = Integer.parseInt(s);

            System.out.println(a);
        }catch (NumberFormatException ex){
            System.out.println("Exception "+ ex.getMessage());
        }

    }
}
