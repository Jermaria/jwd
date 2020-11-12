package by.jwd.task1.exercise8.controller;

import by.jwd.task1.exercise8.service.FunctionService;

public class Main {

    public static void main(String[] args) {
        
        double x = 4;
        
        FunctionService service = FunctionService.getInstance();
        
        double result = service.calculate(x);
        
        Printer printer = Printer.getInstance();
        
        printer.printResult(result);

    }

}
