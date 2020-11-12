package by.jwd.task1.exercise2.service.impl;

import java.util.Scanner;

import by.jwd.task1.exercise2.entity.Year;
import by.jwd.task1.exercise2.service.YearService;

public class YearServiceImpl implements YearService {

    private static final String ENTER_YEAR_MESSAGE = "Введите год";
    
    @Override
    public int scanYear(Scanner scan) {
        
        int year = 0;
        boolean validationSuccessful = false;

        do {

            System.out.println(ENTER_YEAR_MESSAGE);
            
            if (scan.hasNextInt()) {
            
                year = scan.nextInt();

                validationSuccessful = true;
            
            } else {
                
                scan.next();
                continue;
            }
        
        } while (!validationSuccessful || year == 0);
        
        return year;
    }
    
    public Year getYear(int year) {
        
        return new Year(isLeap(year), year);
    }
    
    @Override
    public boolean  isLeap(int year) {
        
        boolean isLeap = false;;
        
        if (year < -45) {
            
            isLeap = true;

        } else {
            
            isLeap = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? true : false;

        }
        
        return isLeap;
    }
    

}
