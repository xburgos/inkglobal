package com.inkglobal.wordconverter.intepreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xabier on 12/06/2015.
 */
public enum Scale {
    ONES(0, ""),
    THOUSANDS(1, "thousand"),
    MILLIONS(2, "million"),
    BILLIONS(3, "billion"),
    TRILLIONS(4, "trillion"),;

    private final int order;
    private final String word;
    private static final Map<Integer,Scale> lookupTable = new HashMap<>(4);

    static {
        for(Scale order : Scale.values()) {
            lookupTable.put(order.getOrder(), order);
        }
    }

    Scale(int order, String word) {
        this.order = order;
        this.word = word;
    }

    public int getOrder() {
        return order;
    }

    public String asWord() {
        return word;
    }

    public static Scale fromInteger(int scale) {
        return lookupTable.get(scale);
    }
}
