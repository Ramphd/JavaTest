package test.chapter18.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class Quiz9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(
				"./src/test/chapter18/IO/name1.txt"));
		String s ;
		//StringBuilder sb = new StringBuilder();
		LinkedList<String> ll = new LinkedList<String>();
		while((s = br.readLine())!= null)
			//sb.append(s + "\n");
			ll.add(s);
		br.close();
		System.out.println(ll);
		Collections.reverse(ll);
		//System.out.println(sb.toString());
		for(String ss : ll)
			System.out.print(ss.toUpperCase()+" ");
	}

}
