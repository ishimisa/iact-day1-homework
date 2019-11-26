package iact;

import java.util.Scanner;

public class Homework1Main {

	public static void main(String[] args) {
		// Q1. write a program which gets the average of 3 numbers
		
		// declare variables
		double x, y, z, result;
		//create a Scanner object for input
		Scanner input = new Scanner(System.in);
		//ask user to enter the first number
		System.out.println("Please enter the first number: ");
		//read into x
		x = input.nextDouble();
		//ask user to enter the second number
		System.out.println("Please enter the second number: ");
		//read into y
		y = input.nextDouble();
		//ask user to enter the third number
		System.out.println("Please enter the third number: ");
		//read into z
		z = input.nextDouble();
		//get the avarage of 3 numbers that user entered
		result = (x + y + z)/3;
		//output the result
		System.out.println("The avarage number is " + result);
	}

}
