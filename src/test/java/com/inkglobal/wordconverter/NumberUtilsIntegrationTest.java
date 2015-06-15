package com.inkglobal.wordconverter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xabier on 12/06/2015.
 */
public class NumberUtilsIntegrationTest {

    @Test
    public void GivenSingleDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(1);
        assertThat(words, is(equalTo("one")));

        words = NumberUtils.toWords(0);
        assertThat(words, is(equalTo("zero")));
    }

    @Test
    public void GivenDoubleDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(21);
        assertThat(words, is(equalTo("twenty one")));
    }

    @Test
    public void GivenThreeDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(105);
        assertThat(words, is(equalTo("one hundred and five")));

        words = NumberUtils.toWords(155);
        assertThat(words, is(equalTo("one hundred and fifty five")));

        words = NumberUtils.toWords(211);
        assertThat(words, is(equalTo("two hundred and eleven")));

        words = NumberUtils.toWords(470);
        assertThat(words, is(equalTo("four hundred and seventy")));

        words = NumberUtils.toWords(999);
        assertThat(words, is(equalTo("nine hundred and ninety nine")));
    }

    @Test
    public void GivenFourDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(1005);
        assertThat(words, is(equalTo("one thousand and five")));

        words = NumberUtils.toWords(1055);
        assertThat(words, is(equalTo("one thousand and fifty five")));

        words = NumberUtils.toWords(5211);
        assertThat(words, is(equalTo("five thousand two hundred and eleven")));

        words = NumberUtils.toWords(2470);
        assertThat(words, is(equalTo("two thousand four hundred and seventy")));

        words = NumberUtils.toWords(9999);
        assertThat(words, is(equalTo("nine thousand nine hundred and ninety nine")));
    }

    @Test
    public void GivenFiveDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(10005);
        assertThat(words, is(equalTo("ten thousand and five")));

        words = NumberUtils.toWords(10055);
        assertThat(words, is(equalTo("ten thousand and fifty five")));

        words = NumberUtils.toWords(50211);
        assertThat(words, is(equalTo("fifty thousand two hundred and eleven")));

        words = NumberUtils.toWords(21470);
        assertThat(words, is(equalTo("twenty one thousand four hundred and seventy")));

        words = NumberUtils.toWords(99999);
        assertThat(words, is(equalTo("ninety nine thousand nine hundred and ninety nine")));
    }

    @Test
    public void GivenSixDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(111005);
        assertThat(words, is(equalTo("one hundred and eleven thousand and five")));

        words = NumberUtils.toWords(100055);
        assertThat(words, is(equalTo("one hundred thousand and fifty five")));

        words = NumberUtils.toWords(501211);
        assertThat(words, is(equalTo("five hundred and one thousand two hundred and eleven")));

        words = NumberUtils.toWords(215470);
        assertThat(words, is(equalTo("two hundred and fifteen thousand four hundred and seventy")));

        words = NumberUtils.toWords(999999);
        assertThat(words, is(equalTo("nine hundred and ninety nine thousand nine hundred and ninety nine")));
    }

    @Test
    public void GivenSevenDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(1112005);
        assertThat(words, is(equalTo("one million one hundred and twelve thousand and five")));

        words = NumberUtils.toWords(1000055);
        assertThat(words, is(equalTo("one million and fifty five")));

        words = NumberUtils.toWords(5013211);
        assertThat(words, is(equalTo("five million thirteen thousand two hundred and eleven")));

        words = NumberUtils.toWords(2156470);
        assertThat(words, is(equalTo("two million one hundred and fifty six thousand four hundred and seventy")));

        words = NumberUtils.toWords(9999999);
        assertThat(words, is(equalTo("nine million nine hundred and ninety nine thousand nine hundred and ninety nine")));
    }

    @Test
    public void GivenEightDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(13112005);
        assertThat(words, is(equalTo("thirteen million one hundred and twelve thousand and five")));

        words = NumberUtils.toWords(10000055);
        assertThat(words, is(equalTo("ten million and fifty five")));

        words = NumberUtils.toWords(56013211);
        assertThat(words, is(equalTo("fifty six million thirteen thousand two hundred and eleven")));

        words = NumberUtils.toWords(56945781);
        assertThat(words, is(equalTo("fifty six million nine hundred and forty five thousand seven hundred and eighty one")));

        words = NumberUtils.toWords(99999999);
        assertThat(words, is(equalTo("ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine")));
    }

    @Test
    public void GivenNineDigitNumber_WhenToWords_ThenWeGetTheNumberInWords() {
        String words = NumberUtils.toWords(130112005);
        assertThat(words, is(equalTo("one hundred and thirty million one hundred and twelve thousand and five")));

        words = NumberUtils.toWords(100000055);
        assertThat(words, is(equalTo("one hundred million and fifty five")));

        words = NumberUtils.toWords(560013211);
        assertThat(words, is(equalTo("five hundred and sixty million thirteen thousand two hundred and eleven")));

        words = NumberUtils.toWords(563945781);
        assertThat(words, is(equalTo("five hundred and sixty three million nine hundred and forty five thousand seven hundred and eighty one")));

        words = NumberUtils.toWords(999999999);
        assertThat(words, is(equalTo("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine")));
    }

}
