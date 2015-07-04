package test.chapter18.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

class S1 implements Serializable{
	/***/
	private static final long serialVersionUID = 7974687935664001044L;
	private int a;
	public S1(int a){
		this.a = a;
	}
	private int b = new Random().nextInt(50);
	public String toString(){
		return Integer.toString(a) +" "+ b;
	}
}
class S2 implements Serializable{
	/***/
	private static final long serialVersionUID = 8091170881800099775L;
	S1 s1  = new S1(3);
	public String toString(){
		return s1.toString();
	}
}
public class Quiz27 {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String file = "./src/test/chapter18/IO/out1.txt";
		S2 s2 = new S2();
		System.out.println(s2);
		ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream(file));
		out.writeObject(s2);
		out.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		S2 s = (S2)in.readObject();
		in.close();
		System.out.println(s.toString());
	}
	
}
