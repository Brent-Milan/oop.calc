package oop.calc;

public class Calculator {
	int previousNumber;
	int currentNumber;
	
	char operation;
	
	int pushNumber(int number) {
		previousNumber = currentNumber;
		currentNumber = number;
		return currentNumber;
	}
	
	void pushAdd() {
		operation = '+';
	}
	
	void pushMinus() {
		operation = '-';
	}
	
	int pushEquals() {
		if(operation == '+') {
			currentNumber = currentNumber + previousNumber;
		} else { 
			currentNumber = currentNumber - previousNumber;
		}
		return currentNumber;
	}
	
	
}
