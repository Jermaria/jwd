package by.jwd.task1.exercise2.controller;

public class MainException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public MainException() {}
    
    public MainException(Exception e) {
        
        super(e);
    }
    
    public MainException(String message, Exception e) {
        
        super(message, e);
    }
    
    public MainException(String message) {
        
        super(message);
    }

}
