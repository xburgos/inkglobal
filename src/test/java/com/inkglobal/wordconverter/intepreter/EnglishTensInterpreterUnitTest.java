package com.inkglobal.wordconverter.intepreter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by xabier on 13/06/2015.
 */
public class EnglishTensInterpreterUnitTest {

    private static final NumberInterpreter interpreter = new EnglishTensInterpreter();

    private static final String[] singleWordNumbers = new String[]{ "zero",
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety"
    };

    @Test
    public void GivenSingleWordNumber_WhenInterpretAsWords_ThenWeGetCorrectWords() {

        for(int i = 0; i < 20; i++) {
            assertThat(interpreter.interpretAsWords(i), is(equalTo(singleWordNumbers[i])));
        }

        assertThat(interpreter.interpretAsWords(30), is(equalTo(singleWordNumbers[21])));
        assertThat(interpreter.interpretAsWords(40), is(equalTo(singleWordNumbers[22])));
        assertThat(interpreter.interpretAsWords(50), is(equalTo(singleWordNumbers[23])));
        assertThat(interpreter.interpretAsWords(60), is(equalTo(singleWordNumbers[24])));
        assertThat(interpreter.interpretAsWords(70), is(equalTo(singleWordNumbers[25])));
        assertThat(interpreter.interpretAsWords(80), is(equalTo(singleWordNumbers[26])));
        assertThat(interpreter.interpretAsWords(90), is(equalTo(singleWordNumbers[27])));
    }

    @Test
    public void GivenDoubleWordNumber_WhenInterpretAsWords_ThenWeGetCorrectWords() {
        assertThat(interpreter.interpretAsWords(21), is(equalTo("twenty one")));
        assertThat(interpreter.interpretAsWords(32), is(equalTo("thirty two")));
        assertThat(interpreter.interpretAsWords(43), is(equalTo("forty three")));
        assertThat(interpreter.interpretAsWords(54), is(equalTo("fifty four")));
        assertThat(interpreter.interpretAsWords(65), is(equalTo("sixty five")));
        assertThat(interpreter.interpretAsWords(76), is(equalTo("seventy six")));
        assertThat(interpreter.interpretAsWords(87), is(equalTo("eighty seven")));
        assertThat(interpreter.interpretAsWords(98), is(equalTo("ninety eight")));
    }
}