package com.yedam.generic;

public class UtilExample {
	public static void main(String[] args) {
		Box<String> box = Util.boxing("Orange");
		box.get();
		
		Box<Integer>boxInt = Util.boxing(100);  // integer 클래스, new Integer(100)
		boxInt.get();
		
		Pair<String, Integer> p1= new Pair<String, Integer>();
		p1.setKind("Hong1");
		p1.setModel(100);
		
		Pair<String, Integer> p2= new Pair<String, Integer>();
		p2.setKind("Hong2");
		p2.setModel(100);
		if(Util.compare(p1, p2)){
			System.out.println("논리적으로 동일한 객체입니다.");
		}else {
			System.out.println("논리적으로 다른 객체입니다.");
			
		};
		
}
}
