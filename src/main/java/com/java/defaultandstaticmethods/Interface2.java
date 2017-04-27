package com.java.defaultandstaticmethods;

public interface Interface2 {
	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);

	}

}
