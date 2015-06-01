package test.chapter15.generic;

public class ss {
    public static void m1(String s, String... ss) {
    	if(s!=null)
    		System.out.println(s);
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }

    public static void main(String[] args) {

        m1("");
        m1("aaa1");
        m1("aaa12", "bbb12");
    }
}