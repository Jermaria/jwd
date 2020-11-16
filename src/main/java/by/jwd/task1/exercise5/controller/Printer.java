package by.jwd.task1.exercise5.controller;


public class Printer {
    
    private static final Printer INSTANCE = new Printer();
    
    private static final String PERFECT_RESULT_MESSAGE = "это число совершенное";
    private static final String IMPERFECT_RESULT_MESSAGE = "это число несовершенное";
    private static final String NOT_NATURAL_NUMBER_MESSAGE = "число не является натуральным";
    
    private Printer() {}

    public static Printer getInstance() {
        return INSTANCE;
    }
    
    public void printPositiveResult() {  
        System.out.println(PERFECT_RESULT_MESSAGE);
    }
    
    public void printNegativeResult() {
        System.out.println(IMPERFECT_RESULT_MESSAGE);
    }
    
    public void printFailureMessage() {
        System.out.println(NOT_NATURAL_NUMBER_MESSAGE);
    }

}
