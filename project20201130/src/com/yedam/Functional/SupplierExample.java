package com.yedam.Functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// 매개값 X -> 반환값 O
		Supplier<String> sup = null;
		sup = new Supplier<String> () {

			@Override
			public String get() {
			return "Hello";
			}
			
		};
		System.out.println(sup.get());
		
		Supplier<Integer> intSup = new Supplier<Integer>() {

			@Override
			public Integer get() {
				int result = 35 * 20;
				return result;
				
			}
			
		};
		intSup.get();
		
		IntSupplier intSupp = new IntSupplier() {

			@Override
			public int getAsInt() {
				
				return (int) (Math.random()*6) + 1;
			}
			
		};
		System.out.println(intSupp.getAsInt());
	}
}
