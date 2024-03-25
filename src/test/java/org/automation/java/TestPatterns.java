package org.automation.java;

import org.junit.jupiter.api.Test;

public class TestPatterns {
    @Test
    public void testPatternNumber1(){
        StarPatterns p1 = new StarPatterns();
        p1.PatternNumber1();
        System.out.println("----------------------------------------------");
    }

    @Test
    public void testPatternAlphabet2()
    {
        StarPatterns p2 = new StarPatterns();
        p2.PatternAlphabet2();
        System.out.println("----------------------------------------------");
    }
    @Test
    public void testStarPattern3()
    {
        StarPatterns p3 = new StarPatterns();
        p3.starPattern3();
        System.out.println("-----------------------------------------------");
    }
}
