package com.hackbulgaria.qa.week2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SomeClass {

	public static void main(String[] args) {
		Path path = Paths.get("/home/radorado/code/Loki/R.md");

		try {
			List<String> lines = Files.readAllLines(path);
			System.out.println(lines);
		} catch (NoSuchFileException fnfe) {
			System.out.println("File not found: " + fnfe.getMessage());
			System.out
					.println("Please ensure that you have created the file, before running again.");
			fnfe.printStackTrace();

		} catch (IOException e) {
			System.out.println(e.toString());
			System.out.println("Here");
		} catch(final Exception e) {
			throw e;
		}
	}
}
