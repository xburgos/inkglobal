package com.inkglobal.wordconverter.strategy;

import com.inkglobal.wordconverter.group.EnglishNumberGroup;
import com.inkglobal.wordconverter.group.Group;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xabier on 13/06/2015.
 */
public class EnglishConversionStrategy implements ConversionStrategy {

    private static final int GROUP_SIZE = 3;

    public String apply(int positiveInteger) {
        List<Group> groups = new LinkedList<>();

        String number = Integer.toString(positiveInteger);
        int numberOfGroups = getNumberOfGroups(number);

        for(int lastDigitIndex = number.length(), groupNumber = 0; lastDigitIndex > 0; lastDigitIndex -= GROUP_SIZE, groupNumber++) {

            String group = getGroupToProcess(number, lastDigitIndex);
            groups.add(0, new EnglishNumberGroup(group, numberOfGroups, groupNumber));
        }

        return groups.stream()
                .map(Group::toWords)
                .collect(Collectors.joining("")).trim();
    }

    private static int getNumberOfGroups(String number) {
        return number.length() / GROUP_SIZE + (number.length() % GROUP_SIZE == 0 ? 0 : 1);
    }


    private static String getGroupToProcess(String number, int lastDigitIndex) {
        int firstDigitIndex = lastDigitIndex - GROUP_SIZE < 0 ? 0 : lastDigitIndex - GROUP_SIZE;
        return number.substring(firstDigitIndex, lastDigitIndex);
    }
}
