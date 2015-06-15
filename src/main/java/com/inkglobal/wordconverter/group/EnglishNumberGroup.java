package com.inkglobal.wordconverter.group;

import com.inkglobal.wordconverter.intepreter.EnglishHundredsInterpreter;
import com.inkglobal.wordconverter.intepreter.EnglishTensInterpreter;
import com.inkglobal.wordconverter.intepreter.NumberInterpreter;
import com.inkglobal.wordconverter.intepreter.Scale;

/**
 * Created by xabier on 13/06/2015.
 */
public class EnglishNumberGroup extends NumberGroup {

    private static final NumberInterpreter englishTensInterpreter = new EnglishTensInterpreter();
    private static final NumberInterpreter englishHundredsInterpreter = new EnglishHundredsInterpreter(englishTensInterpreter);

    public EnglishNumberGroup(String group, int totalGroups, int groupPosition) {
        super(group, totalGroups, groupPosition);
    }

    protected String getGroupJoiningWord(int totalGroups, int scale, int tupleValue) {
        StringBuilder joiningWord = new StringBuilder();
        if (totalGroups > 1) {
            joiningWord.append(" ");
            if (scale == 0 && tupleValue < 100) {
                joiningWord.append("and ");
            }
        }
        return joiningWord.toString();
    }

    protected String getScaleInWords(int scale) {
        String scaleInWords = Scale.fromInteger(scale).asWord();

        if (!scaleInWords.isEmpty()) {
            return " " + scaleInWords;
        }
        return scaleInWords;
    }

    protected String getNumberInWords(int number) {
        if(number < 100) {
            return englishTensInterpreter.interpretAsWords(number);
        }
        return englishHundredsInterpreter.interpretAsWords(number);
    }
}
