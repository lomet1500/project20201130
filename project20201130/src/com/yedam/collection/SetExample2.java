package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("Hong"));
		persons.add(new Person("Hwang"));
		persons.add(new Person("Park"));
		persons.add(new Person("Hong"));
		
		Iterator<Person> iter= persons.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person);
		}
	}

}
