package by.jwd.task1.exercise9.service;

public class Validator {
    
    private static final Validator INSTANCE = new Validator();
    
    private Validator() {}

    public static Validator getInstance() {
        return INSTANCE;
    }
    
    public boolean validateRadius(double radius) {
        
        boolean isSuccessful = (radius > 0) ? true : false;
        return isSuccessful;
    }
    
    

}
