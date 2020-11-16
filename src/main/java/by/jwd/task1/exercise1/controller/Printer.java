package by.jwd.task1.exercise1.controller;

public class Printer {
    
    private static final Printer INSTANCE = new Printer();
    
    private Printer() {}

    public static Printer getInstance() {
        
        return INSTANCE;
    }
    
    public void printResult(int result) {
        
        System.out.println(result);
    }

}
