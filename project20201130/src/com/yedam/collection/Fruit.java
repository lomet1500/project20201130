package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;
	private Fruit() {
		
	}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int hashCode() { //hashCode: 두 개체가 '같은 객체'인지 확인하는 메소드
		
//		return super.hashCode();
		return this.name.length() + this.price; 
	}
	@Override
	public boolean equals(Object obj) { //실제 코드값을 비교
//	Object obj => Fruit 클래스로 Casting
			Fruit fruit = (Fruit) obj;
			boolean b1 = this.name.length() == fruit.name.length();
			boolean b2 = this.price == fruit.price;
		return b1 && b2;	
//		return super.equals(obj);
	}
	
}
