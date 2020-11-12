package by.jwd.task1.exercise9.service;

public class UnacceptableRadiusServiceException extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    public UnacceptableRadiusServiceException() {}
    
    public UnacceptableRadiusServiceException(Exception e) {
        
        super(e);
    }
    
    public UnacceptableRadiusServiceException(String message, Exception e) {
        
        super(message, e);
    }
    
    public UnacceptableRadiusServiceException(String message) {
        
        super(message);
    }

}
