package com.test;

public class StringCount {

	public static void main(String[] args) {
		
		String s = "java";
		
		int count=0;
		
			char[] cs = s.toCharArray();
			
			for (int i = 0; i < cs.length; i++) {
				
				count++;
				
			}
			
			System.out.println(count);
	}
	}

