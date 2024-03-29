package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    private static EvenNum evenNumTest;

/* This methods runs, before running any one of the test case .
   It is used to initialize the required variables
 */
    @Before
    public void setup()
    {
//        arrange
        evenNumTest= new com.stackroute.pe2.EvenNum();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
     */
    @After
    public void teardown()
    {
        evenNumTest= null;
    }

    @Test
    public void givenEvenNumberShouldReturnString()
    {
//        act
        String actualresult= this.evenNumTest.isEven(54);
//        assert
        assertEquals("true", actualresult);
    }

    @Test
    public void givenOddNumberShouldReturnString()
    {
//        act
        String actualresult= this.evenNumTest.isEven(83);
//        assert
        assertEquals("false", actualresult);
    }

    @Test
    public void givenNegativeNumberShouldReturnAString()
    {
//        act
        String actualresult= this.evenNumTest.isEven(-5);
//        assert
        assertEquals("Enter positive number only", actualresult);
    }

    @Test
    public void givenStringShouldReturnAStringMessage()
    {
//        act
        String actualresult= this.evenNumTest.isInputString("hello");
//        assert
        assertEquals("Only numbers allowed", actualresult);
    }

    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()

    {
        this.evenNumTest.isInputString(null);
    }

}