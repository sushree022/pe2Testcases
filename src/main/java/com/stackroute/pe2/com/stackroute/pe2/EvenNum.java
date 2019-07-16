package com.stackroute.pe2;

public class EvenNum {
    public String isEven(int number){
    String iseven="";
    if (number>0) {
        iseven = (number % 2 == 0) ? "true" : "false";
    }
    else iseven="Enter positive number only";


    return iseven;
    }
    public String isInputString(String number){
        return "Only numbers allowed";
    }

}
