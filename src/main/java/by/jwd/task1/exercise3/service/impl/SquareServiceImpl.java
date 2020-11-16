package by.jwd.task1.exercise3.service.impl;

import by.jwd.task1.exercise3.entity.Square;
import by.jwd.task1.exercise3.service.NoSuchShapeException;
import by.jwd.task1.exercise3.service.SquareService;

public class SquareServiceImpl implements SquareService {
    
    private static final Validator VALIDATOR = Validator.getInstance();

    @Override
    public double calculateSideByArea(double area) throws NoSuchShapeException {
        
        if(VALIDATOR.isPositive(area)) {
            throw new NoSuchShapeException();
        }
        
        return Math.sqrt(area);
        
    }
    
    @Override
    public double calculateSideByCircumscribedRadius(double radius) throws NoSuchShapeException {
        
        double side = radius * 2 / Math.sqrt(2);
        
        return side;    
    }

    @Override
    public double calculateArea(Square square) throws NoSuchShapeException {
        
        double side = square.getSide();
        
        return side * side;
     
    }

}
