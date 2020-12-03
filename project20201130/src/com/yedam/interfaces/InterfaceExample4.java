package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		MyInterface mi = null;
		// 매개값의 합.
		mi = (a, b) -> a + b;

		int result = mi.run(10, 20);

		mi = (num1, num2) -> num1 * num2;
		result = mi.run(5, 10);

		// 두개의 변수(직사각형의 가로,세로) -> 넓이는 기능 구현.
		mi = (num1, num2) -> num1 * num2;
		{
			result = mi.run(25, 12);
			System.out.println("결과값 " + result);
			
			//java api 8 - java.util.function

		}
	}
}
