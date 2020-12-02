package com.yedam.interfaces;
//함수적 인터페이스(Functional Interface)

interface Cal {
	public void multi(int num); // 인터페이스 안 메소드는 하나만 있어야함

}

interface Calculate{
	public void sum(int num1, int num2);
}

public class IntetfaceExample2 {
	public static void main(String[] args) {
		Calculate calcu = new Calculate() {

			@Override
			public void sum(int num1, int num2) {
			System.out.println(num1+num2);	
				
			}
			
		};
		calcu.sum(3, 5);
		
		calcu = (a,b) ->{
			System.out.println(a*b);
			
		};
		calcu.sum(3, 5);
		
		Cal cal = (num) -> {
			int result = num * 2;
			System.out.println(result);
		};
		cal.multi(3);
		
		cal = (a) -> {
			int result = a*a;
			System.out.println(result);
		};
	cal.multi(3);
	}

}
