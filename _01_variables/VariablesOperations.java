package com.bptn.course._01_variables;

public class VariablesOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 4;
		int secondNumber = 2;
		
		int resultAdd = firstNumber+secondNumber;
		int resultSub = firstNumber-secondNumber;
		int multiply = firstNumber*secondNumber;
		double division = firstNumber/secondNumber;
		
		System.out.println("First Number: " + firstNumber);
		System.out.println("Second Number: " + secondNumber);
		System.out.println("Result addition: " + resultAdd);
		System.out.println("Result subtraction: " + resultSub);
		System.out.println("Result multiplication: " + multiply);
		System.out.println("Result division: " + division);
		
		firstNumber = 6;
		secondNumber = 7;
		System.out.println("New integer1: " + firstNumber);
		System.out.println("New integer2: " + secondNumber);
		
		char characterA = 'A';
		String tryString = new String ("This is a string");
		
		System.out.println("String: " + tryString);
		System.out.println("Character: " + characterA);
		
		int a = 5;
		a++;
		a = a - 2;
		System.out.println("Character: " + a);
		
		int num1 = 2;
		int num2 = 4;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		
		
		System.out.println(num1);
		
		
				
	}

}
