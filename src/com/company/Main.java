package com.company;

import java.net.URL;

public class Main {

    public static void main(String[] args) {
		//Section 1: Primitive Operations
		//create a int variable, byte/short/int/long
		int aInt = 5;
		//create a float variable, float/double
		float aFloat = 5.9f;
		//print them out the variables
		System.out.println(aInt);
		System.out.println(aFloat);

		//multiply the variables and assign them to new variable,no lose data
		float aMultiply = aInt * aFloat;
		System.out.println(aMultiply);

		//use casting to convert int from 1st step to floating point value,store in a new variable and print it out
		float toFloat = aInt;
		System.out.println(toFloat);

		//use casting to convert float to int and store in a new variable and print it out
		int toInt = (int)aFloat;
		System.out.println(toInt);

		//shifting focus, declare char variable assign a upper case to it and print it out
		char aUpper = 'C';
		System.out.println(aUpper);

		//using numerical operation, lowercase a letter,do not resign the variable. ASCII.print out new char value. tips casting
		char toLow = Character.toLowerCase(aUpper);
		System.out.println(toLow);
		int numUpper = aUpper;
		System.out.println(numUpper);
		int numLower = numUpper + 32;
		char charToLower = (char)numLower;
		System.out.println(charToLower);
		//Section 2 - String Methods
		//create a new string object, assign it to my name and print it out
		String myName = "Gin";
		System.out.println(myName);
		//pick the first letter and replace it with 'A', replace last letter with 'Z', print out
		int n = myName.length();
		String newName1 = myName.replace(myName.charAt(n-1),'z');
		String newName = newName1.replace(myName.charAt(0),'A');
		System.out.println(newName);

		//new string with url,print it out
		String myUrl = "www.gatech.edu";
		System.out.println(myUrl);

		//www.gatech.edu would become gatech1331
		//find index of h
		System.out.println(myUrl.indexOf("h"));

		//add 1331 after the index
		StringBuffer buffer = new StringBuffer(myUrl);
		buffer.insert(myUrl.indexOf("h") + 1, 1331);
		String newString = buffer.toString();
		System.out.println(newString);

		//Section 3 - Learning to debug




    }
}
