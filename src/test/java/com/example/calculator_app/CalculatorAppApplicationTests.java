package com.example.calculator_app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorAppApplicationTests {

	private Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	void testAdd() {
		assertEquals(15, calculator.add(10, 5));
	}

	@Test
	void testSubtract() {
		assertEquals(5, calculator.subtract(10, 5));
	}

	@Test
	void testMultiply() {
		assertEquals(50, calculator.multiply(10, 5));
	}

	@Test
	void testDivide() {
		assertEquals(2.0, calculator.divide(10, 5));
	}

	@Test
	void testDivideByZero() {

		Exception exception = assertThrows(
				IllegalArgumentException.class,
				() -> calculator.divide(10, 0)
		);

		assertEquals(
				"Cannot divide by zero",
				exception.getMessage()
		);
	}
}