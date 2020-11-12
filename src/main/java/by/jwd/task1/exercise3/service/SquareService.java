package by.jwd.task1.exercise3.service;

import by.jwd.task1.exercise3.entity.Square;

public interface SquareService {
    
    
    public double getSideByArea(double area) throws NoSuchShapeException;
    
    public double getSideByCircumscribedRadius(double radius) throws NoSuchShapeException;
    
    public double calculateArea(Square square) throws NoSuchShapeException;

}
