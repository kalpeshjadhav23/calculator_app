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
		public void badCode() {

			int a = 10;
			int b = 20;
			int c = 30;
			int d = 40;
			int e = 50;

			System.out.println(a + b + c + d + e);
		}
	}
}
