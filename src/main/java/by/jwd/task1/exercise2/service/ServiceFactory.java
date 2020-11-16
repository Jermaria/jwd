package by.jwd.task1.exercise2.service;

import by.jwd.task1.exercise2.service.impl.MonthServiceImpl;
import by.jwd.task1.exercise2.service.impl.YearServiceImpl;

public class ServiceFactory {
    
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    
    private final MonthService  monthService = new MonthServiceImpl();
    private final YearService  yearService = new YearServiceImpl();
    
    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public MonthService getMonthService() {
        return monthService;
    }

    public YearService getYearService() {
        return yearService;
    }

}
