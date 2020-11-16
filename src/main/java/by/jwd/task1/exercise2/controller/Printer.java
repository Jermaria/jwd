package by.jwd.task1.exercise2.controller;

public class Printer {
    
 private static final Printer INSTANCE = new Printer();
 
 private static final String IS_LEAP_MESSAGE = "Год високосный.";
 private static final String IS_NON_LEAP_MESSAGE = "Год невисокосный.";
 
 private static final String UNDER_45_BC_MESSAGE = "Високосный год ещё не придумали. "
                                                 + "Месяц можете даже не вводить. " 
                                                 + "Великий понтифик ещё не определился, "
                                                 + "сколько их будет в этом году.";
 
 private static final String NUMBER_OF_DAYS_MESSAGE = "Количество дней в месяце: ";
 private static final String FALURE_MESSAGE_FOR_USER = "Извините, что-то пошло не так";
    
    private Printer() {}

    public static Printer getInstance() {
        
        return INSTANCE;
    }
    
    public void printLeapResult() {
        System.out.println(IS_LEAP_MESSAGE);
    }
    
    public void printNonLeapResult() {
        System.out.println(IS_NON_LEAP_MESSAGE);
    }
    
    public void printBeforeCaesarMessage() {
        System.out.println(UNDER_45_BC_MESSAGE);
    }
    
    public void printNumberOfDays(int numberOfDays) {
        System.out.println(NUMBER_OF_DAYS_MESSAGE + numberOfDays);
    }
    
    public void printFailureMessage() {
        System.out.println(FALURE_MESSAGE_FOR_USER);
    }
    
    public void printMessage(String message) {
        System.out.println(message);
    }

}
