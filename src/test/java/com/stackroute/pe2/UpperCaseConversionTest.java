package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseConversionTest {
    private UpperCaseConversion upperCaseConversion;

    @Before
/* This methods runs, before running any one of the test case .
   It is used to initialize the required variables
 */
    public void setup()
    {
//        arrange
        this.upperCaseConversion= new UpperCaseConversion();
    }

    @After
/* This methods runs, before running any one of the test case .
   It is used to initialize the required variables
 */
    public void teardown()
    {
        upperCaseConversion= null;
    }

@Test
    public void givenFileShouldReturnAString()
{
//    act
    String filename= "name.txt";
    String actualresult= this.upperCaseConversion.readFileContent(filename);
//    assert
    assertEquals("11 HELLO WORLD",actualresult);
}

@Test (expected = NullPointerException.class)
    public void givenFileShouldReturnNullPointerException()
{
    this.upperCaseConversion.readFileContent(null);
}
}