package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest evenNumTest;

    @Before
/* This methods runs, before running any one of the test case .
   It is used to initialize the required variables
 */
    public void setup()
    {
//        arrange
        evenNumTest= new EvenNumTest();
    }
    @After
/* This method runs, after running all the test cases
   It is used to clear the initialized variables
 */
    public void teardown()
    {
        evenNumTest= null;
    }

    @Test
    public void givenNumberShouldReturnBooleanTrue()
    {
//        act
        boolean actualresult= this.evenNumTest.isEven(54);
//        assert
        assertEquals(true, actualresult);
    }
    @Test
    public void givenNumberShouldReturnBooleanFalse()
    {
//        act
        boolean actualresult= this.evenNumTest.isEven(83);
//        assert
        assertEquals(false, actualresult);
    }
}