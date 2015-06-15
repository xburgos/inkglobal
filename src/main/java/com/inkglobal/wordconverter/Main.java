package com.inkglobal.wordconverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xabier on 13/06/2015.
 */
public class Main {

    private static final String MESSAGE = "Please introduce a number from 0 to 999,999,999:";

    public static void main(String[] args) throws IOException {
        System.out.println(MESSAGE);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = in.readLine()) != null && s.length() != 0) {
            try {
                int number = Integer.parseInt(s);

                if(number < 0) handleInputError(s);

                System.out.println(String.format("The number you introduced was: %s",NumberUtils.toWords(number)));
                System.out.println(MESSAGE);

            } catch (NumberFormatException e) {
                handleInputError(s);
            }
        }
    }

    private static void handleInputError(String input) {
        System.out.println(String.format("%s is not a valid number", input));
        System.out.println(MESSAGE);
    }
}
