package by.jwd.task1.exercise8.controller;

public class Printer {
    
    private static final Printer instance = new Printer();
    
    private Printer() {}

    public static Printer getInstance() {
        return instance;
    }
    
    public void printResult(double result) {
        
        System.out.println(result);
    }

}
