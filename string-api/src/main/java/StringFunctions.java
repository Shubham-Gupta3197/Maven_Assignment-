package com.application;

/* A class with two methods - Reverse of the string and Find the length of the string*/
public class StringFunctions {

    /* Returns the reverse string by storing all the string elements in the charArr by the inbuilt
     * method "toCharArray" and then using for loop to print the reverse string */
    public static String stringReverse(String stringInput) {
        char charArr[] = stringInput.toCharArray();

        String  ReverseString = "";
        for (int i = charArr.length - 1; i >= 0; i--) {
            ReverseString += charArr[i];
        }
        return  ReverseString;
    }

    /* Returns the length of the string by the inbuilt function length */
    public int stringLength(String stringInput) {
        return stringInput.length();
    }
}
