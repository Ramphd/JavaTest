package oldA;

public class InternTest {
	
	public static String g(){
		return "a";
	}
	public static void main(String[] args) {
		String a = "a";
		final String c = "a";
		String b = a + "b";
		String d = c + "b";
		String e =g() + "b";
		String com = "ab";
		System.out.println(b == com);
//		System.out.println(c == d);
		System.out.println(d == com);
		System.out.println(e == com);
		
	}

}
