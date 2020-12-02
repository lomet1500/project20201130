package com.yedam.interfaces;

interface Runnable {
	public void run();
}

class AutoRun implements Runnable {

	@Override
	public void run() {
		System.out.println("자동실행");

	}

}
class NewRun implements Runnable{

	@Override
	public void run() {
		System.out.println("새로운실행");
		
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
		runnable = new NewRun();
		runnable.run();
		
		runnable = new Runnable() { //클래스 반복 불필요

			@Override
			public void run() {
				System.out.println("익명 실행");
				
			}
			
		};
		runnable.run();
		
		runnable = () -> System.out.println("또다른 익명 실행"); //간단한 표현 - 람다식  (매개값 표현 부분과 실행부분만 남김)
		
		runnable.run();

	}
}
