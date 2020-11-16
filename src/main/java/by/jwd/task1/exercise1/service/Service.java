package by.jwd.task1.exercise1.service;

public class Service {
    
    private static final Service INSTANCE = new Service();
    
    private Service() {}  
	
	public static Service getInstance() {
        return INSTANCE;
    }

    public int calculateSquare (int number) {
		
		int square;
		
		square = number * number;
		
		return square;
		
	}
	
	public int defineLastDigit(int number) {
		
		int lastDigit;
		
		lastDigit = number % 10;
		
		return lastDigit;
	}

}
