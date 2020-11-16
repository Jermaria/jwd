package by.jwd.task1.exercise3.controller;

public class Printer {
    
    private static final Printer INSTANCE = new Printer();
    private static final String FAILED_TO_CREATE_SHAPE_MESSAGE = "недопустимое значение площади";
    
    private Printer() {}
    
    public static Printer getInstance() {
        
        return INSTANCE;
    }

    public void printFailMessage() {
        
        System.out.println(FAILED_TO_CREATE_SHAPE_MESSAGE);
    
    }
    
    public void printResult(double result) {
        
        System.out.println(result);
    }

}
