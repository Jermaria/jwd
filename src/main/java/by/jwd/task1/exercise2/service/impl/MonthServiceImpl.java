package by.jwd.task1.exercise2.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import by.jwd.task1.exercise2.controller.Printer;
import by.jwd.task1.exercise2.entity.Month;
import by.jwd.task1.exercise2.service.MonthService;

public class MonthServiceImpl implements MonthService{
    
    private static final String ENTER_MONTH_NUMBER_MESSAGE = "Введите номер месяца";

    @Override
    public int scanMonthNumber(Scanner scan) {
        
        int monthNum = 0;
        boolean validationSuccessful = false;
        
        Printer printer = Printer.getInstance();
        
        do {
            
            printer.printMessage(ENTER_MONTH_NUMBER_MESSAGE);
            
            if (scan.hasNextInt()) {
                
                monthNum = scan.nextInt();
                
                validationSuccessful = true;
            
            } else {
                
                scan.next();
                continue;
            }
            
        
        } while (!validationSuccessful|| (monthNum < 1) || (monthNum > 12));
        
        return monthNum;
    }
	
    @Override
	public Optional<Month> defineMonthByNumber(int num) {
		
		List<Month> result = Arrays.stream(Month.values())
		                              .filter(m -> num == m.getMonthNumber())
		                              .collect(Collectors.toList());
		
		Optional<Month> month = result.size() != 0 ? Optional.of(result.get(0)) : Optional.empty();
				
		return month;

	}

}
