package by.jwd.task1.exercise9.controller;

public class Printer {
    
    private static final Printer instance = new Printer();
    private static final String UNACCEPTABLE_RADIUS_MESSAGE = "недопустимое значение радиуса";
    
    private Printer() {}

    public static Printer getInstance() {
        return instance;
    }

    public void printResult(double result) {
        
        System.out.println(result);
    }
    
    public void printFailureMessage() {
        System.out.println(UNACCEPTABLE_RADIUS_MESSAGE);
    }

}
