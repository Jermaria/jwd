package by.jwd.task1.exercise3.service.impl;

import by.jwd.task1.exercise3.entity.Square;
import by.jwd.task1.exercise3.service.NoSuchShapeException;
import by.jwd.task1.exercise3.service.SquareService;

public class SquareServiceImpl implements SquareService {

    @Override
    public double getSideByArea(double area) throws NoSuchShapeException {
        
        if(!isPositive(area)) {
            throw new NoSuchShapeException();
        }
        
        return Math.sqrt(area);
        
    }
    
    @Override
    public double getSideByCircumscribedRadius(double radius) throws NoSuchShapeException {
        
        double side = radius * 2 / Math.sqrt(2);
        
        return side;    
    }

    @Override
    public double calculateArea(Square square) throws NoSuchShapeException {
        
        double side = square.getSide();
        
        return side * side;
     
    }
    
    public boolean isPositive(double number) {
        
        if (number > 0) {
            return true;
        }
        
        return false;
    }

}
