package com.yedam.Functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	
	static int[] scores = {92,95,87};
	
	static int maxOrMin(IntBinaryOperator oper){
		int result = scores[0];
		for(int number : scores) {
			result = oper.applyAsInt(result, number);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int maxValue =	maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ", right: " + right);
				return left > right ? left : right;
			}
			
		});
		
		System.out.println("제일 큰 값: " + maxValue);

			int minValue =	maxOrMin(new IntBinaryOperator() {

				@Override
				public int applyAsInt(int left, int right) {
					System.out.println("left: " + left + ", right: " + right);
					return left < right ? left : right;
				}
				
			});

		System.out.println("제일 작은 값: " + minValue);
}
}
