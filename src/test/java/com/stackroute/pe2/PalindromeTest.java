package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setup()
    {
//        arrange
        palindrome= new Palindrome();
    }

    @After
    public void teardown()
    {
        palindrome= null;
    }

    @Test
    public void givenNumberShouldReturnAReverseNumber()
    {
        //        act
        String actualresult = this.palindrome.reverseNumberString("2567");
//        assert

        assertEquals("7652", actualresult);
    }
    @Test
    public void givenNumberShouldReturnAStringMessage()
    {
        //        act
        String actualresult = this.palindrome.reverseNumberString("2567");
//        assert

        assertEquals("not palindrome", actualresult);
    }
    @Test
    public void givenStringShouldReturnAReverseString()
    {
//        act
        String actualresult = this.palindrome.reverseNumberString("hello");
//        assert

        assertEquals("olloh", actualresult);
    }
    @Test
    public void givenStringShouldReturnAStringMessage()
    {
        //        act
        String actualresult = this.palindrome.reverseNumberString("");
//        assert

        assertEquals("not palindrome", actualresult);
    }

}
