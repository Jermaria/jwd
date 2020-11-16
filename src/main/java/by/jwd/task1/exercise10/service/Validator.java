package by.jwd.task1.exercise10.service;

public class Validator {
    
    private static final Validator INSTANCE = new Validator();
    
    private Validator() {}

    public static Validator getInstance() {
        return INSTANCE;
    }
    
    public boolean validateStep(int step) throws UnacceptableValueServiceException {
        
        if (step < 0) {
            
            throw new UnacceptableValueServiceException();
        }
        
        return true;
    }

}
