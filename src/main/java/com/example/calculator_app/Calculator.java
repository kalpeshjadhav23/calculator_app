package com.example.calculator_app;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {

		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}

		return (double) a / b;
	}

	// Intentionally added for SonarQube Quality Gate failure demo
	public void badCode() {

		String name = "Kalpesh";

		if (name != null) {
			System.out.println("Bad Practice");
		}
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println("Addition: "
				+ calculator.add(10, 5));

		System.out.println("Subtraction: "
				+ calculator.subtract(10, 5));

		System.out.println("Multiplication: "
				+ calculator.multiply(10, 5));

		System.out.println("Division: "
				+ calculator.divide(10, 5));
	}
}