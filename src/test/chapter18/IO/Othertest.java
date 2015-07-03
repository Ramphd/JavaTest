package test.chapter18.IO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Othertest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream ds = new DataInputStream(
				new BufferedInputStream(new FileInputStream("sss")));
		ds.available();	

	}

}
