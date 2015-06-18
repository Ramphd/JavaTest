package test.chapter15.generic;

interface Basee{
	void sh();
}
class Dogg implements Basee{
	public void sh(){
		System.out.println("Dogg sh");
	}
}
class Robott implements Basee{
	public void sh(){
		System.out.println("Robot sh");
	}
}

public class DuckyType {
	
	static <T extends Basee> void  test(T item){
		item.sh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new Dogg());
		test(new Robott());
	}

}
