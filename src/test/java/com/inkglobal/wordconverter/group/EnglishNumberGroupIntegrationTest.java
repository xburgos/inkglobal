package com.inkglobal.wordconverter.group;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by xabier on 13/06/2015.
 */
public class EnglishNumberGroupIntegrationTest {

    @Test
    public void GivenGroupInTheThousandsColumn_WhenToWords_ThenWeGetTheRightWords() {
        Group group = new EnglishNumberGroup("001", 2, 1);
        assertThat(group.toWords(), is(equalTo(" one thousand")));

        group = new EnglishNumberGroup("021", 2, 1);
        assertThat(group.toWords(), is(equalTo(" twenty one thousand")));

        group = new EnglishNumberGroup("321", 2, 1);
        assertThat(group.toWords(), is(equalTo(" three hundred and twenty one thousand")));
    }

    @Test
    public void GivenGroupOfZeroInTheOnesColumn_AndItIsTheOnlyGroup_WhenToWords_ThenWeGetTheRightWords() {
        Group group = new EnglishNumberGroup("000", 1, 0);
        assertThat(group.toWords(), is(equalTo("zero")));
    }

    @Test
    public void GivenGroupInTheOnesColumn_AndNotBeingTheOnlyGroup_WhenToWords_ThenWeGetTheRightWords() {
        Group group = new EnglishNumberGroup("001", 2, 0);
        assertThat(group.toWords(), is(equalTo(" and one")));

        group = new EnglishNumberGroup("021", 2, 0);
        assertThat(group.toWords(), is(equalTo(" and twenty one")));

        group = new EnglishNumberGroup("321", 2, 0);
        assertThat(group.toWords(), is(equalTo(" three hundred and twenty one")));
    }

    @Test
    public void GivenGroupInTheOnesColumn_AndItIsTheOnlyGroup_WhenToWords_ThenWeGetTheRightWords() {
        Group group = new EnglishNumberGroup("001", 1, 0);
        assertThat(group.toWords(), is(equalTo("one")));

        group = new EnglishNumberGroup("021", 1, 0);
        assertThat(group.toWords(), is(equalTo("twenty one")));

        group = new EnglishNumberGroup("321", 1, 0);
        assertThat(group.toWords(), is(equalTo("three hundred and twenty one")));
    }

    @Test
    public void GivenGroupInTheMillionsColumn_WhenToWords_ThenWeGetTheRightWords() {
        Group group = new EnglishNumberGroup("001", 1, 2);
        assertThat(group.toWords(), is(equalTo("one million")));

        group = new EnglishNumberGroup("021", 1, 2);
        assertThat(group.toWords(), is(equalTo("twenty one million")));

        group = new EnglishNumberGroup("321", 1, 2);
        assertThat(group.toWords(), is(equalTo("three hundred and twenty one million")));
    }

}