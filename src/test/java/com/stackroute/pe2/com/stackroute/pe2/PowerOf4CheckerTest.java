package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4CheckerTest
{
    PowerOf4Checker powerof4Checker;

/* This methods runs, before running any one of the test case .
   It is used to initialize the required variables
 */

    @Before
    public void setup()
    {
//        arrange
        powerof4Checker = new PowerOf4Checker();
    }

/* This method runs, after running all the test cases
   It is used to clear the initialized variables
 */
    @After
    public void teardown()
    {
        powerof4Checker = null;
    }

    @Test
    public void givenNumberShouldReturnIsPowerOf4()
    {
//        act
        String actualresult= powerof4Checker.isPowerof4(64);
//        assert
        assertEquals("It is Power of 4",actualresult);
    }

    @Test
    public void givenNumberShouldReturnIsNotPowerOf4()
    {
//        act
        String actualresult= powerof4Checker.isPowerof4(56);
//        assert
        assertEquals("It is not Power of 4",actualresult);
    }

    @Test
    public void givenNegativeNumberShouldReturnAdviceString()
    {
//        act
        String actualresult= powerof4Checker.isPowerof4(-45);
//        assert
        assertEquals("Enter positive numbers only",actualresult);
    }
}