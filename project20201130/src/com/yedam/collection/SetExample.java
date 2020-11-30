package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World1");
		set.add("World2");
		set.add("Welcome");

//		for(String str : set) {
//			System.out.println(str);
//			
//		}

		Iterator<String> iter = set.iterator(); 
		while (iter.hasNext()) { // hasnext로 값이 있는지 체크
			String str = iter.next();

			System.out.println(str);

		}
		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(26);
		numbers.add(38);

		numbers.remove(26);

		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers: " + sum);
	}
	// 10,15,20,25,30.35,40,20,25
	// 컬렉션 : List,Set, (Map)
	// 1)전체값의 합: 155
	// 2)중복된 값은 제외한 합: 110
	
}



	


