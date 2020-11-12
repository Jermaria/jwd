package by.jwd.task1.exercise3.controller;

import by.jwd.task1.exercise3.entity.Circle;
import by.jwd.task1.exercise3.entity.Square;
import by.jwd.task1.exercise3.service.CircleService;
import by.jwd.task1.exercise3.service.NoSuchShapeException;
import by.jwd.task1.exercise3.service.ServiceFactory;
import by.jwd.task1.exercise3.service.SquareService;

public class Main {

    public static void main(String[] args) {
        
        double circumscribedSquareArea = 64;
        
        ServiceFactory factory = ServiceFactory.getInstance();
        
        SquareService squareService = factory.getSquareService();
        
        Printer printer = Printer.getInstance();
        
        try {
            
            Square circumscribedSquare = new Square(squareService.getSideByArea(circumscribedSquareArea));
            
            CircleService circleService = factory.getCircleService();
            
            Circle circle = new Circle(circleService.calculateInscribedRadius(circumscribedSquare));
            
            Square inscribedSquare = new Square(squareService
                                           .getSideByCircumscribedRadius(circle.getRadius()));
            
            double inscribedSquareArea = squareService.calculateArea(inscribedSquare);
            
            
            // double даёт погрешность, попробовать в BigDecimal
            double result = circumscribedSquareArea / inscribedSquareArea;
            
            printer.printResult(result);   
             
        } catch (NoSuchShapeException e) {
            
            printer.printFailMessage();
        }
        
    }

}
