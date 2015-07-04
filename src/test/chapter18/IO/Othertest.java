package test.chapter18.IO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Othertest {
	public void s1() throws FileNotFoundException{
	DataInputStream ds = new DataInputStream(
			new BufferedInputStream(new FileInputStream("sss")));
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream ds = new DataInputStream(
				new BufferedInputStream(new FileInputStream("sss")));
		
		ds.available();	
	}

}
