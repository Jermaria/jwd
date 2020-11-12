package by.jwd.task1.exercise9.controller;

import by.jwd.task1.exercise9.service.CircleService;
import by.jwd.task1.exercise9.service.UnacceptableRadiusServiceException;

public class Main {

    public static void main(String[] args) {
        
        double radius = 3;
        
        CircleService service = CircleService.getInstance();
        Printer printer = Printer.getInstance();
        
        try {
            
            double cirumference = service.calculateСircumference(radius);
            printer.printResult(cirumference);
            
            double area = service.calculateCircleArea(radius);
            printer.printResult(area);            
        
        } catch (UnacceptableRadiusServiceException e) {
            
            printer.printFailureMessage();
        }

    }

}
