package by.jwd.task1.exercise3.service.impl;

public class Validator {
    
    private static final Validator INSTANCE = new Validator();
    
    private Validator() {}
 
    public static Validator getInstance() {
        
        return INSTANCE;
    }
    
    public boolean isPositive(double number) {
        
        if (number > 0) {
            return true;
        }
        
        return false;
    }
    

}
