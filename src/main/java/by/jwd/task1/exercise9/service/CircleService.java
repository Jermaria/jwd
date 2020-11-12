package by.jwd.task1.exercise9.service;

public class CircleService {
    
    private static final CircleService instance = new CircleService();
    private final Validator validator = Validator.getInstance();
    
    private CircleService() {}

    public static CircleService getInstance() {
        return instance;
    }
    
    public double calculateСircumference(double radius) throws UnacceptableRadiusServiceException {
        
        double circumference = 0;
        
        if (validator.validateRadius(radius)) {
            
            circumference = 2 * Math.PI * radius;
        
        } else {
            
            throw new UnacceptableRadiusServiceException();
        }
        
        return circumference;
    }
    
    public double calculateCircleArea(double radius) throws UnacceptableRadiusServiceException {
        
        double area = 0;
        
        if (validator.validateRadius(radius)) {
            
            area = Math.PI * radius * radius;
        
        } else {
            
            throw new UnacceptableRadiusServiceException();
        }
        
        return area;
    }

}
