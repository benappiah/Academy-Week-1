package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		
		scan.close();
		
	}

}
