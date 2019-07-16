package com.stackroute.pe2;

public class Palindrome {

    String reversedstring = "";

//    Reversing the string
    public String getReverseString(String string){
        reversedstring = "";
//        Taking character by character from input using loop
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedstring = reversedstring + string.charAt(i);
        }
        return reversedstring;
    }

//    Checking whether it is palindrome or not
    public String isPalindrome(String string){
        reversedstring = "";
//        Taking character by character from input using loop
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedstring = reversedstring + string.charAt(i);
        }
//        Condition using ternary operators
        String ispalindrome=(string.equals(reversedstring)) ? "Is palindrome" : "Not palindrome";
        return ispalindrome;
    }
}
