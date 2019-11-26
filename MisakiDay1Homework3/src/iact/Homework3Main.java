package iact;

import java.util.Scanner;

public class Homework3Main {

	public static void main(String[] args) {
		// Q3. write a program to get the vat (23%) and total on a price
		//declare the variables
		double x, vat, result;
		//create the Scanner object for a input
		Scanner input = new Scanner(System.in);
		//ask the user to enter the price
		System.out.println("Please enter the price: ");
		//read into x
		x = input.nextDouble();
		//calculate the vat
		vat = x*0.23;
		//calculate x + the vat
		result = x + vat;
		//output the vat and total on a price
		System.out.println("The vat: " + vat + "euro" +"\r\n" + "Total price: " + result + "euro");
	}

}
