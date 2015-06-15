package com.inkglobal.wordconverter.strategy;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by xabier on 13/06/2015.
 */
public enum WordConversionStrategy implements ConversionStrategy {
    ENGLISH_UK(Locale.UK, new EnglishConversionStrategy()),
    ENGLISH_US(Locale.US, new EnglishConversionStrategy());

    private final ConversionStrategy conversionStrategy;
    private final Locale locale;

    private static final Map<Locale, WordConversionStrategy> lookupTable = new HashMap<Locale, WordConversionStrategy>();

    static {
        for(WordConversionStrategy strategy : WordConversionStrategy.values()) {
            lookupTable.put(strategy.locale, strategy);
        }
    }

    WordConversionStrategy(Locale locale, ConversionStrategy conversionStrategy) {
        this.locale = locale;
        this.conversionStrategy = conversionStrategy;
    }

    public static WordConversionStrategy forLocale(Locale locale) {
        if(lookupTable.containsKey(locale)) {
            return lookupTable.get(locale);
        }
        throw new IllegalArgumentException("conversion strategy for locale not registered.");
    }

    public String apply(int number) {
        return conversionStrategy.apply(number);
    }
}
