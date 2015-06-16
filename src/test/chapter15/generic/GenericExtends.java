package test.chapter15.generic;

class Di{
	public int x,y,z;
}
class So<T extends Di>{
	T item;
	So(T item){
		this.item = item;
	}
	int getY(){return item.y;}
}
class Bou extends Di{}
public class GenericExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		So<Bou> so = new So<Bou>(new Bou());
		System.out.println(so.getY());
	}

}
