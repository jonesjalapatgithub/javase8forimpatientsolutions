package com.jones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;

public class Chapter1Exercises {
	
	 static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		getSubdirectory();
		tryWithResourc();
		
		
	}

	private static void tryWithResourc() {
		new Thread(() -> {
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
	}

	private static void getSubdirectory() {
		System.out.println("Enter the full path of the "
				+ "directory which you want to get all the subdirectories");
		String path=scanner.nextLine();
		Path directory=Paths.get(path);
		try {
			Files.list(directory)
					.sorted((Path o1, Path o2) ->{
							return o1.toFile().isFile()?1
									:o2.toFile().isFile()?-1
											:0;
						}
					)
						
						.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}

}
