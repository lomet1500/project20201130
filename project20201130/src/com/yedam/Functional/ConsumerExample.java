package com.yedam.Functional;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
//		Consumer<String> consumer = null;
//		
//		consumer = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//			
//		};
//		consumer.accept("Hello");
//	

//	Consumer<String> consumer = null;
//	
//	consumer = t -> System.out.println("Hello" + t);
//			
//	consumer.accept("Hong");
//	consumer.accept("Hwang");


		BiConsumer<String, Integer> biCon = null;
		biCon = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				System.out.println("이름은 " + t + ", 나이는" + u);
			}

		};
		biCon.accept("Hong", 15);

		ObjIntConsumer<String> objIntCon = null;
		objIntCon = new ObjIntConsumer<String>() {

			@Override
			public void accept(String t, int value) {
				System.out.println("이름은 " + t + ", 점수는" + value);

			}
		};
		objIntCon.accept("Hwang", 88);
	}
}
