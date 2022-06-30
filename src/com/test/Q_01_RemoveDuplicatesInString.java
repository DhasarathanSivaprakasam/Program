package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q_01_RemoveDuplicatesInString {
	
	public static void main(String[] args) {
		
		String s = "Dhasarathan S";
		
		Set<Character> st = new LinkedHashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			st.add(s.charAt(i));
			
		}
		
		for (Character character : st) {
			
			System.out.print(character);
			
		}
		
	}

}
