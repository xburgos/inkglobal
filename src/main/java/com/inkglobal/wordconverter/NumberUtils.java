package com.inkglobal.wordconverter;

import com.inkglobal.wordconverter.strategy.ConversionStrategy;
import com.inkglobal.wordconverter.strategy.WordConversionStrategy;

import java.util.Locale;

/**
 * Created by xabier on 12/06/2015.
 */
public class NumberUtils {

    public static String toWords(int positiveInteger) {
        ConversionStrategy strategy = WordConversionStrategy.forLocale(Locale.getDefault());
        return strategy.apply(positiveInteger);
    }

    public static String toWords(int positiveInteger, Locale locale) {
        ConversionStrategy strategy = WordConversionStrategy.forLocale(locale);
        return strategy.apply(positiveInteger);
    }
}
