package com.stayready.assessment.week2.part04;

import org.junit.Assert;
import org.junit.Test;

public class JumperTest {

    @Test
    public void solution0(){
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(3,1);
        Integer actual = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution1(){
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(3,2);
        Integer actual = 2;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution2(){
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(3,3);
        Integer actual = 1;
        Assert.assertEquals(expected, actual);

    }
   
}
