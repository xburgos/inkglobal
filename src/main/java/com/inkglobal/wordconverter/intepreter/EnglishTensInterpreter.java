package com.inkglobal.wordconverter.intepreter;

/**
 * Created by xabier on 13/06/2015.
 */
public class EnglishTensInterpreter implements NumberInterpreter {

    public String interpretAsWords(int number) {
        StringBuilder numberInWords = new StringBuilder();
        if (SingleWordNumber.isSingleWordNumber(number)) {
            numberInWords.append(SingleWordNumber.fromInteger(number).asString());
        } else {
            numberInWords.append(SingleWordNumber.fromInteger((number / 10) * 10).asString());
            numberInWords.append(" ");
            numberInWords.append(SingleWordNumber.fromInteger(number % 10).asString());
        }
        return numberInWords.toString();
    }
}
