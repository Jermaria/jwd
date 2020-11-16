package by.jwd.task1.exercise3.service;

import by.jwd.task1.exercise3.entity.Square;

public interface SquareService {
    
    
    double calculateSideByArea(double area) throws NoSuchShapeException;
    
    double calculateSideByCircumscribedRadius(double radius) throws NoSuchShapeException;
    
    double calculateArea(Square square) throws NoSuchShapeException;

}
