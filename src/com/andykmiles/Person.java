package com.andykmiles;

import lombok.Data;
import lombok.NonNull;

@Data public class Person {
	@NonNull String name;
	@NonNull int age;

	public double calculate(int size) {
		return size * 2.3;
	}
}
