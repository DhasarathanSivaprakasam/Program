package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q_03_RemoveDuplicateArray {
	
	public static void main(String[] args) {
		
		int[] a = {100,20,75,30,40,20,45,50,10};
		
		Set<Integer> s = new LinkedHashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			
			s.add(a[i]);
			
		}
		System.out.println(s);
	}

}
