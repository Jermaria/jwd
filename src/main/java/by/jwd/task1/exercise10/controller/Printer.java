package by.jwd.task1.exercise10.controller;

import java.util.Map;

public class Printer {
    
    private static final Printer instance = new Printer();
    private static final String NO_RESULT_MESSAGE = "результаты не найдены";
    private static final String TABLE_HEADER = "x  y";
    private static final String WRONG_STEP_MESSAGE = "шаг не должен быть меньше 0";
    
    private Printer() {}

    public static Printer getInstance() {
        return instance;
    }

    public void printResult(Map<Integer, Double> results) {
        
        System.out.println(TABLE_HEADER);
        
        for (Map.Entry<Integer, Double> entry : results.entrySet()) {
            
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
    
    public void printNoResultMessage() {
        
        System.out.println(NO_RESULT_MESSAGE);
    }
    
    public void printUnacceptableStepValueMessage() {
        
        System.out.println(WRONG_STEP_MESSAGE);
    }

}
