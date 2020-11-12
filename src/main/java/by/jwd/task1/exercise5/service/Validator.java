package by.jwd.task1.exercise5.service;

public class Validator {
    
private static final Validator instance = new Validator();
    
    private Validator() {}

    public static Validator getInstance() {
        return instance;
    }
    
    public boolean isPositive(int x) {
        
        boolean result = (x > 0) ? true : false;
        
        return result;
    }

}
