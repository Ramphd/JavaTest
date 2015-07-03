package test.chapter18.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFile extends ArrayList<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3013619745683339307L;

	public static String read(String fileName) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return sb.toString();
	}

	// Write a single file in one method call:
	public static void write(String fileName, String text) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				new File(fileName).getAbsoluteFile())));
		try {
			out.print(text);
		} finally {
			out.close();
		}
	}

	// Read a file, split by any regular expression:
	public TextFile(String fileName, String splitter) throws IOException {
		super(Arrays.asList(read(fileName).split(splitter)));
		// Regular expression split() often leaves an empty
		// String at the first position:
		if (get(0).equals(""))
			remove(0);
	}

	// Normally read by lines:
	public TextFile(String fileName) throws IOException {
		this(fileName, "\n");
	}

	public void write(String fileName) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				new File(fileName).getAbsoluteFile())));
		try {
			for (String item : this)
				out.println(item);
		} finally {
			out.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
