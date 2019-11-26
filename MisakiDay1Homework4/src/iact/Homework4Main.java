package iact;

import java.util.Scanner;

public class Homework4Main {

	public static void main(String[] args) {
		// Q4. write a program to convert from degree celcius to fahrenheit
		//declare the variable
		double c, f;
		//Create the Scanner object for a input
		Scanner input = new Scanner(System.in);
		//ask the user to enter the degree celcius
		System.out.println("Please enter the degree celcius: ");
		//read into c
		c = input.nextDouble();
		//convert from degree celcius to fahrenheit
		f = (c* 9/5) + 32;
		//output the result
		System.out.println("The fahrenheit is: " + f);

	}

}
