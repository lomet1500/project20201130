package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple {

}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = box.get();

		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get();
		System.out.println("end");
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		
		List<Apple> appList = new ArrayList<>();
		appList.add(new Apple());
		
	}

}
