package iact;

import java.util.Scanner;

public class Homework5Main {

	public static void main(String[] args) {
		// Q5. write a program that takes in a temperature
		//if the temp is greather than 100 output - system shutdown too hot
		//otherwise output - temperature good
		//declare the variables
		double x, maxtem = 100;
		//create Scanner object for a input
		Scanner input = new Scanner(System.in); 
		//ask user to enter the temperature
		System.out.println("Please enter the temperature: ");
		//read into x
		x = input.nextDouble();
		//if
		if ( x > maxtem ){
			System.out.println("System shutdown too hot");
		}
		else{
			System.out.println("Temperature good");
		
		}

	}

}
