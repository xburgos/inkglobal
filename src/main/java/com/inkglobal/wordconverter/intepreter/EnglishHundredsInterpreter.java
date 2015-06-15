package com.inkglobal.wordconverter.intepreter;

/**
 * Created by xabier on 13/06/2015.
 */
public class EnglishHundredsInterpreter implements NumberInterpreter {

    private static final String HUNDRED = "hundred";
    private static final String AND = " and ";
    private final NumberInterpreter tensInterpreter;

    public EnglishHundredsInterpreter(NumberInterpreter tensInterpreter) {
        this.tensInterpreter = tensInterpreter;
    }

    public String interpretAsWords(int number) {
        StringBuilder numberInWords = new StringBuilder();
        numberInWords.append(SingleWordNumber.fromInteger(number / 100).asString());
        numberInWords.append(" ");
        numberInWords.append(HUNDRED);
        if(number % 100 != 0) {
            numberInWords.append(AND);
            numberInWords.append(tensInterpreter.interpretAsWords(number % 100));
        }
        return numberInWords.toString();
    }
}
