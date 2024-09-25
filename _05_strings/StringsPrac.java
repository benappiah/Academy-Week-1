package com.bptn.course._05_strings;

public class StringsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		
		int stringLength = s.length();
		
		System.out.println("Length: " + stringLength);
		
		//String Slicing.
		String sub = s.substring(0, 7); //upper bound excluded.
		
		System.out.println("Substring " + sub );
		
		//toLower toUpper.
		String lowerCase = s.toLowerCase();
		System.out.println("Lower case" + lowerCase);
		
		
		//String indexing with charAt.
		int index = s.indexOf("o"); //first occurence of character in string.
		
		char c = s.charAt(4);
		
		
		
	}

}
