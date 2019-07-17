package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class UpperCaseConversionTest {
    private UpperCaseConversion upperCaseConversion;

    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
     */
    @Before
    public void setup() {
//        arrange
        this.upperCaseConversion = new UpperCaseConversion();
    }

    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
     */
    @After
    public void teardown() {
        upperCaseConversion = null;
    }

    @Test
    public void givenFileShouldReturnAString() throws FileNotFoundException, IOException {
//    act
        String filename ="/home/test/Desktop/name.txt";
        String actualresult = this.upperCaseConversion.readfileContentAndConvertToUpperCase(filename);
//    assert
        assertEquals("11 HELLO WORLD", actualresult);
    }

    @Test
    public void givenFileContainingNoTextShouldReturnAStringMessage() throws FileNotFoundException, IOException{
//    act
        String filename = "/home/test/Desktop/name.txt";
        String actualresult = this.upperCaseConversion.readfileContentAndConvertToUpperCase(filename);
//    assert
        assertEquals("No text in the file", actualresult);
    }

}