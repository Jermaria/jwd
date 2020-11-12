package by.jwd.task1.exercise5.controller;

import by.jwd.task1.exercise5.service.PerfectChecker;
import by.jwd.task1.exercise5.service.ServiceException;

public class Main {
    
    public static void main(String[] args) {
        
        int x = 6;
        
        PerfectChecker checker = PerfectChecker.getInstance();
        Printer printer = Printer.getInstance();
        
        try {
            
            boolean isPerfect = checker.isNumberPerfect(x);
            
            if (isPerfect) {
                
                printer.printPositiveResult();
            
            } else {
                
                printer.printNegativeResult();
            }
          
        } catch (ServiceException e) {
             // log
            printer.printFailureMessage();
        }
    }

}
