package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
     */
    @Before
    public void setup()
    {
//        arrange
        palindrome= new Palindrome();
    }

/* This methods runs, before running any one of the test case .
   It is used to initialize the required variables
 */

    @After
    public void teardown()
    {
        palindrome= null;
    }

    @Test
    public void givenNumberShouldReturnAReverseNumber()
    {
//        act
        String actualresult = this.palindrome.getReverseString("2567");
//        assert

        assertEquals("7652", actualresult);
    }
    @Test
    public void givenNumberShouldReturnAStringMessage()
    {
        //        act
        String actualresult = this.palindrome.isPalindrome("2567");
//        assert

        assertEquals("Not palindrome", actualresult);
    }
    @Test
    public void givenStringShouldReturnAReverseString()
    {
//        act
        String actualresult = this.palindrome.getReverseString("hello");
//        assert

        assertEquals("olleh", actualresult);
    }
    @Test
    public void givenStringShouldReturnAStringMessage()
    {
//        act
        String actualresult = this.palindrome.isPalindrome("helleh");
//        assert

        assertEquals("Is palindrome", actualresult);
    }
//    @Test(expected = NullPointerException.class)
//    public void givenStringShouldReturnNullPointerException()
//    {
//        this.palindrome.reverseNumberString(null);
//    }

}
