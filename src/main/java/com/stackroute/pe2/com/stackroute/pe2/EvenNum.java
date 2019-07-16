package com.stackroute.pe2;

public class EvenNum {
    public String isEven(int number){
    String iseven="";
//    Checking if number is positive or not
    if (number>0) {
//        Whether number is even or not
        iseven = (number % 2 == 0) ? "true" : "false";
    }
    else iseven="Enter positive number only";


    return iseven;
    }
//    Whether input is number or not
    public String isInputString(String number){
        return "Only numbers allowed";
    }

}
