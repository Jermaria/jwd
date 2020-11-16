package by.jwd.task1.exercise1.controller;

import by.jwd.task1.exercise1.service.Service;

public class Main {

	public static void main(String[] args) {
		
		int x;
		x = 178;
		
		Service service = Service.getInstance();
		
		int xLastDigit = service.defineLastDigit(x);
		int result = service.defineLastDigit(service.calculateSquare(xLastDigit));

		Printer printer = Printer.getInstance();
		
		printer.printResult(result);

	}

}
