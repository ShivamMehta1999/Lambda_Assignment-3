package com.UpperCaseConcatenation;

// public class initiated as to implement upperCaseConcatenation
public class UpperCaseConcatenationImplementation {

    // main class called here
    public static void main(String[] args) {

        UpperCaseConcatenate lambda=(string1, string2, string3, string4, string5, string6, string7)->{
            StringBuilder result=new StringBuilder("");
            result.append(string1.toUpperCase());
            result.append(string2.toUpperCase());
            result.append(string3.toUpperCase());
            result.append(string4.toUpperCase());
            result.append(string5.toUpperCase());
            result.append(string6.toUpperCase());
            result.append(string7.toUpperCase());
            return new String(result);
        };
        // output came from here
        System.out.println(lambda.concatenate("The", "lambda", "has", "too", "many", "string" ,"arguments."));
    }
}
