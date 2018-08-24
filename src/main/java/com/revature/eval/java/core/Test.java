package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		double l = 20;
		List<Integer> primes = new ArrayList<Integer>();
		
		for(int i = 1; i <= l; i++) {
			boolean pbool = true;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0 & i != 1 & j != 1 & i != j) {
					pbool = false;
					//System.out.println(i);
				}
			}
			if(pbool == true & i != 1) {
				//System.out.println(i);
				primes.add(i);
			}
		}
		
		System.out.println(primes);
	}
	


}
