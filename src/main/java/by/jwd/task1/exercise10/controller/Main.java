package by.jwd.task1.exercise10.controller;

import java.util.Map;
import java.util.Optional;

import by.jwd.task1.exercise10.entity.Interval;
import by.jwd.task1.exercise10.service.FunctionService;
import by.jwd.task1.exercise10.service.UnacceptableValueServiceException;

public class Main {
    
    public static void main(String[] args) {
        
        Interval interval = new Interval(0, 6);
        int step = 2;
        
        FunctionService service = FunctionService.getInstance();
        Printer printer = Printer.getInstance();

        try {
            
            Optional<Map<Integer, Double>> result = service.calculateResultsOprional(interval, step);
            
            if (result.isPresent()) {
                
                Map<Integer, Double> resultMap = result.get();
                printer.printResult(resultMap);
            
            } else {
                
                printer.printNoResultMessage();
            }
            
        } catch (UnacceptableValueServiceException e) {
            
            printer.printUnacceptableStepValueMessage();
        }
        
    }

}
