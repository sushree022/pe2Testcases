package com.stackroute.pe2;

public class PowerOf4Checker {

//    Method for checking given input is power of 4 or not
    public String isPowerof4(int number){
//        Whether number is positive or not
        if(number>0) {
            while (number != 1) {
                if (number % 4 != 0) {
//                    Comes directly out of every loop and control flow statements and return
                    return "It is not Power of 4";
                }
                number = number / 4;
            }
            return "It is Power of 4";

        }
        else return "Enter positive numbers only";

    }


}
