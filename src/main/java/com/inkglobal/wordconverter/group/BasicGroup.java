package com.inkglobal.wordconverter.group;

/**
 * Created by xabier on 13/06/2015.
 */
public abstract class BasicGroup implements Group {

    protected final String group;
    protected final int totalGroups;
    protected final int groupPosition;

    public BasicGroup(String group, int totalGroups, int groupPosition) {
        this.group = group;
        this.totalGroups = totalGroups;
        this.groupPosition = groupPosition;
    }

}
