package by.jwd.task1.exercise1.controller;

public class Printer {
    
    private static final Printer instance = new Printer();
    
    private Printer() {}

    public static Printer getInstance() {
        
        return instance;
    }
    
    public void printResult(int result) {
        
        System.out.println(result);
    }

}
