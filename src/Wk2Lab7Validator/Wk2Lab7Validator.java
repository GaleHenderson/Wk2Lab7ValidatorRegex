package Wk2Lab7Validator;

import java.util.Scanner;



public class Wk2Lab7Validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		System.out.println(Validator.matchRegex(scan, "Enter your name: ", "[A-Z][a-z]{2,30}"));
		
		System.out.println(Validator.matchRegex(scan, "Enter your email: ", "\\w+{5,30}@\\w+{5,10}\\.\\w{2,3}"));
		
		System.out.println(Validator.matchRegex(scan, "Enter your phone number: ", "\\d{3}-\\d{3}-\\d{4}"));
		
		System.out.println(Validator.matchRegex(scan, "Enter your birthdate in the format dd/mm/yyyy: ", "\\d{2}/\\d{2}/\\d{4}"));

		System.out.println(Validator.matchRegex(scan, "Enter your HTML code: ", "<\\w+>\\w+</\\w+>"));

		
scan.close();		
	}
		
	}





