package com.fundamenals;

import java.util.Scanner;

public class ExtractFile {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String path = console.nextLine();
		String[] pathParts = path.split("\\\\");
		String fullFileName = pathParts[pathParts.length - 1];
		String fileName = fullFileName.split("\\.")[0];
		String extension = fullFileName.split("\\.")[1];
		System.out.println("File name: " + fileName);
		System.out.println("File extension: " + extension);
	}
}
