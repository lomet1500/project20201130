package com.yedam.generic;

public class Box<T> {
	T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}
