package by.jwd.task1.exercise1.controller;

import by.jwd.task1.exercise1.service.Service;

public class Main {

	public static void main(String[] args) {
		
		int x;
		x = 178;
		
		Service service = new Service();
		
		int xLastDigit = service.getLastDigit(x);
		int result = service.getLastDigit(service.getSquare(xLastDigit));

		Printer printer = Printer.getInstance();
		
		printer.printResult(result);

	}

}
