package com.java.defaultandstaticmethods;

public interface Interface1 {
	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);

	}

}
