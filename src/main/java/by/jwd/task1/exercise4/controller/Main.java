package by.jwd.task1.exercise4.controller;

import by.jwd.task1.exercise4.entity.Expression;
import by.jwd.task1.exercise4.service.ParityChecker;

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = new int[] {5, 4, 3, 1, 1 };
        
        Expression expression = new Expression(array);
        
        ParityChecker checker = new ParityChecker();
        Printer printer = Printer.getInstance();
        
        if (checker.isExpressionTrue(expression)) {
            
            printer.printPositiveResult();
        
        } else {
            
            printer.printNegativeResult();
        }
    }
}
