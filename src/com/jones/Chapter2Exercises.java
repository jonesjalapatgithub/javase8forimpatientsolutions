package com.jones;

import java.util.Arrays;
import java.util.List;

public class Chapter2Exercises {

	public static void main(String[] args) {
		calculateLength();
		exercise4();
	}

	private static void exercise4() {
		int[] values = { 1, 4, 9, 16 };
		/*stream.o*/
		
	}

	private static void calculateLength() {
		List<String> words = Arrays.asList("jones alapat","Gauranga Rathod","Swati Magar","Parmanand Dhuri");
		
		long count = words.stream().filter(w -> w.length() > 12).count();
		System.out.println(count);
	}
	
	
}
