package java_core_9_homework_shop;

import java.util.ArrayList;

public class Commodity {

	private String name;
	private int price;
	private int weight;
	
	
	ArrayList<Commodity> shops = new ArrayList<>();


	public Commodity() {
		// TODO Auto-generated constructor stub
	}
	public Commodity(String name, int price, int weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public ArrayList<Commodity> getShops() {
		return shops;
	}


	public void setShops(ArrayList<Commodity> shops) {
		this.shops = shops;
	}

	
	public void additem(){
		
		
		
		
		for (int i = 0; i < 10; i++) {
			int randomPrice = (int)(Math.random()*1000);
			int randomWeight = (int)(Math.random()*1000);
			String randomName = "item"+ i;
			Commodity shop = new Commodity(randomName, randomPrice, randomWeight);
			
			System.out.println(shop);
		}
		
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", price=" + price + ", weight=" + weight  + "]";
	}
	
	
	
	
}
