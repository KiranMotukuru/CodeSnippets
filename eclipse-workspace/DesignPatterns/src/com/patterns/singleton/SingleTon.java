package com.patterns.singleton;

public class SingleTon {

	static SingleTon s = null;

	private SingleTon() {}

	static SingleTon getInstance() {
		if (s == null) {
			s = new SingleTon();
                                  }
		return s;

	}
}
