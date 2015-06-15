package com.inkglobal.wordconverter.strategy;

import org.junit.Test;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by xabier on 13/06/2015.
 */
public class WordConversionStrategyUnitTest {

    @Test
    public void GivenLocale_WhenForLocale_ThenWeGetTheRightStrategy() {
        ConversionStrategy conversionStrategy = WordConversionStrategy.forLocale(Locale.UK);
        assertThat(conversionStrategy, is(equalTo(WordConversionStrategy.ENGLISH_UK)));

        conversionStrategy = WordConversionStrategy.forLocale(Locale.US);
        assertThat(conversionStrategy, is(equalTo(WordConversionStrategy.ENGLISH_US)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenLocaleWithoutStrategy_WhenForLocale_ThenExceptionIsThrown() {
        WordConversionStrategy.forLocale(Locale.CANADA);
    }
}