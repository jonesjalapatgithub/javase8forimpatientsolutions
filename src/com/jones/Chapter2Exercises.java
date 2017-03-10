package com.jones;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chapter2Exercises {

	public static void main(String[] args) {
		System.out.println("Execise 1");
		calculateLength();
		System.out.println("Execise 4");
		exercise4();
	}

	private static void exercise4() {
		int[] values = { 1, 4, 9, 16 };
		IntStream.of(values).forEach(System.out::println);
	}

	private static void calculateLength() {
		List<String> words = Arrays.asList("jones alapat","Gauranga Rathod","Swati Magar","Parmanand Dhuri");
		
		long count = words.stream().filter(w -> w.length() > 12).count();
		System.out.println(count);
	}
	
	
}
