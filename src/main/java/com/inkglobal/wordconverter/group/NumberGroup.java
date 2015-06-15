package com.inkglobal.wordconverter.group;

import com.inkglobal.wordconverter.intepreter.*;

/**
 * Created by xabier on 13/06/2015.
 */
public abstract class NumberGroup extends BasicGroup {

    public NumberGroup(String group, int totalGroups, int groupPosition) {
        super(group, totalGroups, groupPosition);
    }

    @Override
    public String toWords() {
        StringBuilder tupleInWords = new StringBuilder();
        int groupValue = Integer.parseInt(group);

        if(groupValue > 0) {

            tupleInWords.append(getGroupJoiningWord(totalGroups, groupPosition, groupValue));
            tupleInWords.append(getNumberInWords(groupValue));
            tupleInWords.append(getScaleInWords(groupPosition));

        } else if(groupValue == 0 && totalGroups == 1) {

            tupleInWords.append(SingleWordNumber.ZERO.asString());
        }
        return tupleInWords.toString();
    }

    protected abstract String getGroupJoiningWord(int totalGroups, int scale, int tupleValue);

    protected abstract String getScaleInWords(int scale);

    protected abstract String getNumberInWords(int number);
}
