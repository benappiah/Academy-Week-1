package com.bptn.course._03_flow_control_01_while;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		
		while (count < 10) {
			System.out.println(count);
			count++;
		}
		
		int i = 0;
		do{
			System.out.println(i);
			i++;
		}while (i<5);
		
		for(int cnt = 1; cnt < 10; cnt++) {
			System.out.println(cnt);
		}
		
	}
	
	
}
