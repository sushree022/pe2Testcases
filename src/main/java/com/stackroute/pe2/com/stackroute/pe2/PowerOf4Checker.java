package com.stackroute.pe2;

public class PowerOf4Checker {
    public String isPowerof4(int number){
        if(number>0) {
            while (number != 1) {
                if (number % 4 != 0) {
                    return "It is not Power of 4";
                }
                number = number / 4;
            }
            return "It is Power of 4";

        }
        else return "Enter positive numbers only";

    }


}
