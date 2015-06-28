package test.chapter17.Container;

import java.util.HashMap;

public class Quiz13 {
	public static void putS(HashMap<String,Integer> a,String b){
		if(a.get(b)!=null)
			a.put(b, a.remove(b)+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("a",0);
		hm.put("b", 0);
		
		putS(hm, "a");
		putS(hm, "a");
		putS(hm, "a");
		putS(hm, "b");
		System.out.println(hm);
		
	}

}
