package by.jwd.task1.exercise4.controller;

public class Printer {
    
    private static final Printer instance = new Printer();
    private static final String POSITIVE_RESULT_MESSAGE = "обнаружено минимум 2 чётных числа";
    private static final String NEGATIVE_RESULT_MESSAGE = "количество чётных чисел меньше 2";
    
    private Printer() {}
    
    public static Printer getInstance() {
        return instance;
    }
    
    public void printPositiveResult() {
        System.out.println(POSITIVE_RESULT_MESSAGE);
    }
    
    public void printNegativeResult() {
        System.out.println(NEGATIVE_RESULT_MESSAGE);
    }

}
