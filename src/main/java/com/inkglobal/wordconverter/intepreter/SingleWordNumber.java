package com.inkglobal.wordconverter.intepreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xabier on 12/06/2015.
 */
public enum SingleWordNumber {
    ZERO(0, "zero"),
    ONE(1, "one"),
    TWO(2, "two"),
    THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"),
    SIX(6, "six"),
    SEVEN(7, "seven"),
    EIGHT(8, "eight"),
    NINE(9, "nine"),
    TEN(10, "ten"),
    ELEVEN(11, "eleven"),
    TWELVE(12, "twelve"),
    THIRTEEN(13, "thirteen"),
    FOURTEEN(14, "fourteen"),
    FIFTEEN(15, "fifteen"),
    SIXTEEN(16, "sixteen"),
    SEVENTEEN(17, "seventeen"),
    EIGHTEEN(18, "eighteen"),
    NINETEEN(19, "nineteen"),
    TWENTY(20, "twenty"),
    THIRTY(30, "thirty"),
    FORTY(40, "forty"),
    FIFTY(50, "fifty"),
    SIXTY(60, "sixty"),
    SEVENTY(70, "seventy"),
    EIGHTY(80, "eighty"),
    NINETY(90, "ninety");

    private final int digit;
    private final String string;

    private static final Map<Integer, SingleWordNumber> lookupTable = new HashMap<Integer, SingleWordNumber>(20);

    static {
        for(SingleWordNumber value : SingleWordNumber.values()) {
            lookupTable.put(value.asInt(), value);
        }
    }

    SingleWordNumber(int digit, String spelledDigit) {
        this.digit = digit;
        this.string = spelledDigit;
    }

    public static boolean isSingleWordNumber(int number) {
        return !(number < 0 || (number > 19 && number % 10 != 0) || number > 99);
    }

    public static SingleWordNumber fromInteger(int number) {
        if(isSingleWordNumber(number)) {
            return lookupTable.get(number);
        }
        throw new IllegalArgumentException("number must be a value between 0 and 19 or be a multiple of 10 less than 100");
    }

    public int asInt() {
        return digit;
    }

    public String asString() {
        return string;
    }
}
