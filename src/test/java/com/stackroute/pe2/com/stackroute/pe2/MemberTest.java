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
        String actualresult= this.memberDetails.memberName("Harry Potter");
//        assert
        assertEquals("Member's Name: Harry Potter", actualresult);
    }

    @Test
    public void givenInputShouldReturnAnInteger()
    {
//        act
        String actualresult= this.memberDetails.memberAge(30);
//        assert
        assertEquals("Member's Age: 30", actualresult);
    }

    @Test
    public void givenInputShouldReturnAfloat()
    {
//        act
        String actualresult= this.memberDetails.memberSalary(2500.3);
//        assert
        assertEquals("Member's Salary: 2500.3", actualresult);
    }
//
//    @Test
//    public void givenNullShouldReturnNullPointerException()
//
//    {   String expectedresult=memberDetails.member.name.NullPointerException();
//        actualresult=memberDetails.memberName(null);
//    }
//
//    @Test(expected = NullPointerException.class)
//    public void givenStringShouldReturnNullPointerException()
//
//    {
//        this.memberDetails.memberAge(0);
//    }
//    @Test(expected = NullPointerException.class)
//    public void givenStringShouldReturnNullPointerException()
//
//    {
//        this.memberDetails.memberSalary(null);
//    }
}