package com.stackroute.pe2;

public class Palindrome {

    String reversedstring = "";
    public String getReverseString(String string){
        reversedstring = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedstring = reversedstring + string.charAt(i);
        }
        return reversedstring;
    }
    public String isPalindrome(String string){
        reversedstring = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedstring = reversedstring + string.charAt(i);
        }

        String ispalindrome=(string.equals(reversedstring)) ? "Is palindrome" : "Not palindrome";
        return ispalindrome;
    }
}
