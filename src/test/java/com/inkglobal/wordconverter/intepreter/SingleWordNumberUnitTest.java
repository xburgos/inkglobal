package com.inkglobal.wordconverter.intepreter;


import com.inkglobal.wordconverter.intepreter.SingleWordNumber;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xabier on 12/06/2015.
 */
public class SingleWordNumberUnitTest {

    @Test
    public void GivenSingleWordDigits_WhenFromInteger_ThenWeGetTheRightSpelledDigit() {
        assertThat(SingleWordNumber.fromInteger(0), is(equalTo(SingleWordNumber.ZERO)));
        assertThat(SingleWordNumber.fromInteger(1), is(equalTo(SingleWordNumber.ONE)));
        assertThat(SingleWordNumber.fromInteger(2), is(equalTo(SingleWordNumber.TWO)));
        assertThat(SingleWordNumber.fromInteger(3), is(equalTo(SingleWordNumber.THREE)));
        assertThat(SingleWordNumber.fromInteger(4), is(equalTo(SingleWordNumber.FOUR)));
        assertThat(SingleWordNumber.fromInteger(5), is(equalTo(SingleWordNumber.FIVE)));
        assertThat(SingleWordNumber.fromInteger(6), is(equalTo(SingleWordNumber.SIX)));
        assertThat(SingleWordNumber.fromInteger(7), is(equalTo(SingleWordNumber.SEVEN)));
        assertThat(SingleWordNumber.fromInteger(8), is(equalTo(SingleWordNumber.EIGHT)));
        assertThat(SingleWordNumber.fromInteger(9), is(equalTo(SingleWordNumber.NINE)));
        assertThat(SingleWordNumber.fromInteger(10), is(equalTo(SingleWordNumber.TEN)));
        assertThat(SingleWordNumber.fromInteger(11), is(equalTo(SingleWordNumber.ELEVEN)));
        assertThat(SingleWordNumber.fromInteger(12), is(equalTo(SingleWordNumber.TWELVE)));
        assertThat(SingleWordNumber.fromInteger(13), is(equalTo(SingleWordNumber.THIRTEEN)));
        assertThat(SingleWordNumber.fromInteger(14), is(equalTo(SingleWordNumber.FOURTEEN)));
        assertThat(SingleWordNumber.fromInteger(15), is(equalTo(SingleWordNumber.FIFTEEN)));
        assertThat(SingleWordNumber.fromInteger(16), is(equalTo(SingleWordNumber.SIXTEEN)));
        assertThat(SingleWordNumber.fromInteger(17), is(equalTo(SingleWordNumber.SEVENTEEN)));
        assertThat(SingleWordNumber.fromInteger(18), is(equalTo(SingleWordNumber.EIGHTEEN)));
        assertThat(SingleWordNumber.fromInteger(19), is(equalTo(SingleWordNumber.NINETEEN)));
        assertThat(SingleWordNumber.fromInteger(20), is(equalTo(SingleWordNumber.TWENTY)));
        assertThat(SingleWordNumber.fromInteger(30), is(equalTo(SingleWordNumber.THIRTY)));
        assertThat(SingleWordNumber.fromInteger(40), is(equalTo(SingleWordNumber.FORTY)));
        assertThat(SingleWordNumber.fromInteger(50), is(equalTo(SingleWordNumber.FIFTY)));
        assertThat(SingleWordNumber.fromInteger(60), is(equalTo(SingleWordNumber.SIXTY)));
        assertThat(SingleWordNumber.fromInteger(70), is(equalTo(SingleWordNumber.SEVENTY)));
        assertThat(SingleWordNumber.fromInteger(80), is(equalTo(SingleWordNumber.EIGHTY)));
        assertThat(SingleWordNumber.fromInteger(90), is(equalTo(SingleWordNumber.NINETY)));
    }

    @Test
    public void GivenAllSpelledDigits_ThenGetStringReturnsCorrectString() {
        assertThat(SingleWordNumber.ZERO.asString(), is(equalTo("zero")));
        assertThat(SingleWordNumber.ONE.asString(), is(equalTo("one")));
        assertThat(SingleWordNumber.TWO.asString(), is(equalTo("two")));
        assertThat(SingleWordNumber.THREE.asString(), is(equalTo("three")));
        assertThat(SingleWordNumber.FOUR.asString(), is(equalTo("four")));
        assertThat(SingleWordNumber.FIVE.asString(), is(equalTo("five")));
        assertThat(SingleWordNumber.SIX.asString(), is(equalTo("six")));
        assertThat(SingleWordNumber.SEVEN.asString(), is(equalTo("seven")));
        assertThat(SingleWordNumber.EIGHT.asString(), is(equalTo("eight")));
        assertThat(SingleWordNumber.NINE.asString(), is(equalTo("nine")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenDigitGreaterThan19_WhenFromInteger_ThenExceptionIsThrown() {
        SingleWordNumber.fromInteger(99);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenDigitLessThan0_WhenFromInteger_ThenExceptionIsThrown() {
        SingleWordNumber.fromInteger(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenNumberGreaterThan19_AndNotMultipleOf10_WhenFromInteger_ThenExceptionIsThrown() {
        SingleWordNumber.fromInteger(21);
    }

}