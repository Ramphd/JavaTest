package test.chapter15.generic;

import java.util.ArrayList;
import java.util.Random;

class Product{
	private final int id;
	private String description;
	private double price;
	public Product(int id ,String des ,double price){
		this.id = id;
		this.description = des;
		this.price = price;
		System.out.println(toString());
	}
	public String toString(){
		return id + ":"+description + ", price : $" + price;
	}
	public void priceChange(double p){
		price+=p;
	}
	public static Generator<Product> generator = new Generator<Product>(){
		private Random rand = new Random(47);
		public Product next(){
			return new Product (rand.nextInt(1000),"TEST",
					Math.round(rand.nextDouble()* 1000+0.99));
		}
	};
}
@SuppressWarnings("serial")
class Shelf extends ArrayList<Product>{
	public Shelf(int nProduct){
		Generators.fill(this, Product.generator,nProduct);
	}
}
@SuppressWarnings("serial")
class Bis extends ArrayList<Shelf>{
	public Bis(int nShelf , int nPro){
		for(int i = 0; i < nShelf;i++)
			add(new Shelf(nPro));
	}
}
@SuppressWarnings("serial")
public class Cargo extends ArrayList<Bis>{
	public Cargo(int nBis,int nShelf ,int nProd){
		for(int i = 0;i < nBis;i++){
			add(new Bis(nShelf,nProd));
		}
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(Bis b : this){
			for(Shelf s : b){
				for(Product p :s){
					result.append(p);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Cargo(1,2,1));
	}

}
