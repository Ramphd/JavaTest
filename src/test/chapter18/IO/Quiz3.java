package test.chapter18.IO;

import java.io.File;
import java.io.IOException;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("./src/test/chapter18/IO");
		String[] list;
		list = path.list();
		File[] ll = path.listFiles();
		for(File f: ll)
			try {
				System.out.println(f.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		long total = 0;
		long fs;
		for(String item : list){
			fs = new File(path,item).length();
			System.out.println(item + ", " + fs + " byte(s)");
			total += fs;
		}
		System.out.println("---");
		System.out.println(list.length + "files "+total+"bytes");
	}
}
