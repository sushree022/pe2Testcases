package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfNumberTest
{
    PowerOfNumber powerOfNumber;

    @Before
/* This methods runs, before running any one of the test case .
   It is used to initialize the required variables
 */
    public void setup()
    {
//        arrange
        powerOfNumber= new PowerOfNumber();
    }

    @After
/* This method runs, after running all the test cases
   It is used to clear the initialized variables
 */
    public void teardown()
    {
        powerOfNumber= null;
    }

    @Test
    public void givenNumberAndItsExponentShouldReturnAnInteger()
    {
//        act
        int actualresult= powerOfNumber.exponentAndNumber(4,3);
//        assert
        assertEquals(64,actualresult);
    }
}