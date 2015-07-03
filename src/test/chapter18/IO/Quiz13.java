package test.chapter18.IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class Quiz13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "./src/test/chapter18/IO/name1.txt";
		String outName = "./src/test/chapter18/IO/out.txt";
		LineNumberReader in = new LineNumberReader(new FileReader(fileName));
		PrintWriter out = new PrintWriter(outName);
		String s;
		while((s = in.readLine())!= null)
			out.println(in.getLineNumber() + " " + s);//lineNum starts from 1
		out.close();
		in.close();
		
	}

}
