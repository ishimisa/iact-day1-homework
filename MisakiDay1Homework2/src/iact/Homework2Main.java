package iact;

import java.util.Scanner;

public class Homework2Main {

	public static void main(String[] args) {
		// Q2. write a program to convert from euro to dollars
		//declare the variables
		double euro, dollars;
		//Create a Scanner abject for input
		Scanner input = new Scanner(System.in);
		//Ask user to enter euro
		System.out.println("Please enter the price in euro: ");
		//read into euro
		euro = input.nextDouble();
		//convert in dollars
		dollars = euro*1.11;
		//output the dollars
		System.out.println(euro +" euro is " + dollars + " dollars");
	}

}
