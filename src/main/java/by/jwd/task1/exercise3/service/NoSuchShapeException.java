package by.jwd.task1.exercise3.service;

public class NoSuchShapeException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public NoSuchShapeException() {}
    
    public NoSuchShapeException(Exception e) {
        
        super(e);
    }
    
    public NoSuchShapeException(String message, Exception e) {
        
        super(message, e);
    }
    
    public NoSuchShapeException(String message) {
        
        super(message);
    }

}
