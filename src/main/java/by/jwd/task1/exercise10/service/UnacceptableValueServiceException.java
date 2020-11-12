package by.jwd.task1.exercise10.service;

public class UnacceptableValueServiceException extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    public UnacceptableValueServiceException() {}
    
    public UnacceptableValueServiceException(Exception e) {
        
        super(e);
    }
    
    public UnacceptableValueServiceException(String message, Exception e) {
        
        super(message, e);
    }
    
    public UnacceptableValueServiceException(String message) {
        
        super(message);
    }

}
