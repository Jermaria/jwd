package by.jwd.task1.exercise6.controller;

import by.jwd.task1.exercise6.entity.Moment;

public class Printer {
    
    private static final Printer instance = new Printer();
    
    private static final String TIME_PASSED_MESSAGE = "Прошло ";
    private static final String HOUR_MESSAGE = " ч ";
    private static final String MINUTE_MESSAGE = " мин ";
    private static final String SECOND_MESSAGE = " сек ";
    
    private static final String FAILURE_MESSAGE = "недопустимое количество секунд";
    
    
    private Printer() {}

    public static Printer getInstance() {
        return instance;
    }
    
    public void printPassedTime(Moment moment) {
        
        int hours = moment.getHours().size();
        int minutes = moment.getMinutes().size();
        int seconds = moment.getSeconds();
        
        System.out.println(TIME_PASSED_MESSAGE 
                           + hours + HOUR_MESSAGE
                           + minutes + MINUTE_MESSAGE
                           + seconds + SECOND_MESSAGE);
        
    }
    
    public void printFailureMessage() {
        
        System.out.println(FAILURE_MESSAGE);
    }
    

}
