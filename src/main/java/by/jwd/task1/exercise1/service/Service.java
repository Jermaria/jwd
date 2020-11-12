package by.jwd.task1.exercise1.service;

public class Service {
	
	public int getSquare (int number) {
		
		int square;
		
		square = (int)Math.pow(number, 2);
		
		return square;
		
	}
	
	public int getLastDigit(int number) {
		
		int lastDigit;
		
		lastDigit = number % 10;
		
		return lastDigit;
	}

}
