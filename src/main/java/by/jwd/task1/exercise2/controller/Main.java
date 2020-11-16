package by.jwd.task1.exercise2.controller;

import java.util.Scanner;

import by.jwd.task1.exercise2.entity.Month;
import by.jwd.task1.exercise2.entity.Year;
import by.jwd.task1.exercise2.service.MonthService;
import by.jwd.task1.exercise2.service.ServiceFactory;
import by.jwd.task1.exercise2.service.YearService;

public class Main {
    
    private static final String FAILURE_IN_MONTH_ENUM_EXEPTION = "Ошибка в перечислении Month";

	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    ServiceFactory factory = ServiceFactory.getInstance();
	    
	    YearService yearService = factory.getYearService();
	    
	    int yearNumber = yearService.scanYear(scan);
	    Year year = yearService.getYear(yearNumber);
	    
	    Printer printer = Printer.getInstance();
	    
	    if (yearService.isLeap(year.getYearNumber())) {
	        
	        printer.printLeapResult();
	    
	    } else {
	        
	        printer.printNonLeapResult();
	    }
	    
	    if (year.getYearNumber() < -45) {
            
            printer.printBeforeCaesarMessage();
              
        } else {
	    
            MonthService monthService = factory.getMonthService();
            
            int monthNumber = monthService.scanMonthNumber(scan);
          
            try {
            
               Month m = monthService.defineMonthByNumber(monthNumber)
                            .orElseThrow(() -> new MainException(FAILURE_IN_MONTH_ENUM_EXEPTION));
               
               int daysInMonth = year.getMonths().get(m);
               
               printer.printNumberOfDays(daysInMonth);
        
           } catch (MainException e) {
               
               //log
               printer.printFailureMessage();
           }

        }
	    
	    scan.close();

	}

}
