package oop.calc;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Calculator myCalc = new Calculator();
		updateDisplay(0);
		
		int newDisplayValue = myCalc.pushNumber(42);
		updateDisplay(newDisplayValue);
		
		myCalc.pushAdd();
			
		
		newDisplayValue = myCalc.pushNumber(44);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		myCalc.pushMinus();
		
		newDisplayValue = myCalc.pushNumber(63);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		myCalc.pushAdd();
		
		newDisplayValue = myCalc.pushNumber(23);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		
	}
	
	public static void updateDisplay(int value) {
		System.out.println(value);
	}
	
}
