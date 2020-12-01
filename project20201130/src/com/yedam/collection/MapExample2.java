package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "운태현"), 80);
		map.put(new Student(102, "정병기"), 90);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 80);
		map.put(new Student(103, "정병기"), 88);
		
// 1.keySet()
		int sum = 0;
		int [] score = {80,90,70,80,88};	
		double avg = 0.0;
		for(int i = 0; i <score.length; i++) {
			sum += score[i];
		}
		
		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println("학번: "+ student.getStudentNo() + ", 이름: " + student.getStudentName() +", 점수 :" + map.get(student));
		}
		avg = (double)sum/score.length;
		System.out.println("평균: " + avg );
	}
	
	//2.entrySet()

	//777페이지 9번
	
}
