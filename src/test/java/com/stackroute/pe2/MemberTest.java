package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    MemberDetails memberDetails;

    /* This methods runs, before running any one of the test case .
       It is used to initialize the required variables
     */
    @Before
    public void setup()
    {
//        arrange
        memberDetails= new MemberDetails();
    }

    /* This method runs, after running all the test cases
       It is used to clear the initialized variables
     */
    @After
    public void teardown()
    {
        memberDetails= null;
    }

    @Test
    public void givenInputShouldReturnAString()
    {
//        act
        String actualresult= this.memberDetails.membername("Harry Potter");
//        assert
        assertEquals("Member's Name: Harry Potter", actualresult);
    }

    @Test
    public void givenInputShouldReturnAnInteger()
    {
//        act
        String actualresult= this.memberDetails.memberage(30);
//        assert
        assertEquals("Member's age: 30", actualresult);
    }

    @Test
    public void givenInputShouldReturnAfloat()
    {
//        act
        String actualresult= this.memberDetails.membersalary(2500.3);
//        assert
        assertEquals("Member's salary: 2500.3", actualresult);
    }

    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()

    {
        this.memberDetails.membername(null);
    }

    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()

    {
        this.memberDetails.memberage(null);
    }
    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()

    {
        this.memberDetails.membersalary(null);
    }
}