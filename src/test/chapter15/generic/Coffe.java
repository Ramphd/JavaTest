package test.chapter15.generic;

import java.util.Random;

interface Generator<T>{T next();}

class Guys{
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}

class GoodGuy1 extends Guys{}
class GoodGuy2 extends Guys{}
class GoodGuy3 extends Guys{}
class BadGuy1 extends Guys{}
class BadGuy2 extends Guys{}
class BadGuy3 extends Guys{}

public class Coffe implements Generator<Guys>{
	private Class<?>[] types = {GoodGuy1.class,GoodGuy2.class,GoodGuy3.class,
			BadGuy1.class,BadGuy2.class,BadGuy3.class};
	private static Random rand = new Random(47);
	public Guys next(){
		try {
			return (Guys)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} 
	}
	public static void main(String[] args) {
	Coffe cof = new Coffe();
	for(int i = 0 ;i <5;i++){
		System.out.println(cof.next() + " fuck " + cof.next());
	}

	}

}
