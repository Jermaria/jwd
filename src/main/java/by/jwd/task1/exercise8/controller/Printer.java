package by.jwd.task1.exercise8.controller;

public class Printer {
    
    private static final Printer INSTANCE = new Printer();
    
    private Printer() {}

    public static Printer getInstance() {
        return INSTANCE;
    }
    
    public void printResult(double result) {
        
        System.out.println(result);
    }

}
