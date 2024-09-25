package com.bptn.course._04_arrays;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,6,7};
		
		System.out.println(Arrays.toString(nums));
		
		for(int num: nums) {
			System.out.println(num);
		}
		
		String name = "Benjmain";
		
		char[] str4 = {'H', 'e', 'l','l', 'o'};
		
		String str5 = new String(str4);
		
		System.out.println(str5);
		
	}

}
