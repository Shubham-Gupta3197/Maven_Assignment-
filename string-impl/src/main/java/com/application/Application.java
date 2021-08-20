package com.application;
//import com.application.StringFunctions;

public class Application {
    public static void main(String[] args){

        /* Here we are making the object of StringFunction class and calling it's methods */
        String stringInput = "Hey! I'm Shubham Gupta";

        com.application.StringFunctions object = new com.application.StringFunctions();

        System.out.println("The original string is : Hey! I'm Shubham Gupta");

        System.out.println("The Reverse of the string is : " + object.stringReverse(stringInput));

        System.out.println("The Length of the string is : " + object.stringLength(stringInput));
    }
}
