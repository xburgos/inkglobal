package com.inkglobal.wordconverter.intepreter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by xabier on 13/06/2015.
 */
public class ScaleUnitTest {

    @Test
    public void GivenAScaleAsInteger_WhenFromInteger_ThenWeGetTheRightScale() {
        assertThat(Scale.fromInteger(0), is(equalTo(Scale.ONES)));
        assertThat(Scale.fromInteger(1), is(equalTo(Scale.THOUSANDS)));
        assertThat(Scale.fromInteger(2), is(equalTo(Scale.MILLIONS)));
        assertThat(Scale.fromInteger(3), is(equalTo(Scale.BILLIONS)));
        assertThat(Scale.fromInteger(4), is(equalTo(Scale.TRILLIONS)));
    }

    @Test
    public void GivenAScale_WhenAsString_ThenWeGetTheCorrectName() {
        assertThat(Scale.ONES.asWord(), is(equalTo("")));
        assertThat(Scale.THOUSANDS.asWord(), is(equalTo("thousand")));
        assertThat(Scale.MILLIONS.asWord(), is(equalTo("million")));
        assertThat(Scale.BILLIONS.asWord(), is(equalTo("billion")));
        assertThat(Scale.TRILLIONS.asWord(), is(equalTo("trillion")));
    }

}