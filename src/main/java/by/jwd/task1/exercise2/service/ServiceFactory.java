package by.jwd.task1.exercise2.service;

import by.jwd.task1.exercise2.service.impl.MonthServiceImpl;
import by.jwd.task1.exercise2.service.impl.YearServiceImpl;

public class ServiceFactory {
    
    private static final ServiceFactory instance = new ServiceFactory();
    
    private static final MonthService  monthService = new MonthServiceImpl();
    private static final YearService  yearService = new YearServiceImpl();
    
    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public MonthService getMonthService() {
        return monthService;
    }

    public YearService getYearService() {
        return yearService;
    }

}
