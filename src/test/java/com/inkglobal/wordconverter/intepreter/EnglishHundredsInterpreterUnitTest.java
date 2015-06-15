package com.inkglobal.wordconverter.intepreter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by xabier on 13/06/2015.
 */
public class EnglishHundredsInterpreterUnitTest {

    private static final NumberInterpreter interpreter = new EnglishHundredsInterpreter(new EnglishTensInterpreter());

    private static final String[] disjointNumbers = new String[]{
            "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
            "six hundred", "seven hundred", "eight hundred", "nine hundred"
    };

    @Test
    public void GivenDisjointNumber_WhenInterpretAsWords_ThenWeGetCorrectWords() {

        for(int i = 1; i < 10; i++) {
            assertThat(interpreter.interpretAsWords(i*100), is(equalTo(disjointNumbers[i-1])));
        }
    }

    @Test
    public void GivenJointNumber_WhenInterpretAsWords_ThenWeGetCorrectWords() {
        assertThat(interpreter.interpretAsWords(121), is(equalTo("one hundred and twenty one")));
        assertThat(interpreter.interpretAsWords(232), is(equalTo("two hundred and thirty two")));
        assertThat(interpreter.interpretAsWords(343), is(equalTo("three hundred and forty three")));
        assertThat(interpreter.interpretAsWords(454), is(equalTo("four hundred and fifty four")));
        assertThat(interpreter.interpretAsWords(565), is(equalTo("five hundred and sixty five")));
        assertThat(interpreter.interpretAsWords(676), is(equalTo("six hundred and seventy six")));
        assertThat(interpreter.interpretAsWords(787), is(equalTo("seven hundred and eighty seven")));
        assertThat(interpreter.interpretAsWords(898), is(equalTo("eight hundred and ninety eight")));
        assertThat(interpreter.interpretAsWords(999), is(equalTo("nine hundred and ninety nine")));
    }

}