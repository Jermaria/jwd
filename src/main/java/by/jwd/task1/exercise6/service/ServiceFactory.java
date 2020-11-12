package by.jwd.task1.exercise6.service;

import by.jwd.task1.exercise6.service.impl.HourServiceImpl;
import by.jwd.task1.exercise6.service.impl.MinuteServiceImpl;
import by.jwd.task1.exercise6.service.impl.ValidatorImpl;

public class ServiceFactory {
    
    private static final ServiceFactory instance = new ServiceFactory();
    
    private final HourService hourService = new HourServiceImpl();
    private final MinuteService minuteService = new MinuteServiceImpl();
    private final Validator validator = new ValidatorImpl();
    
    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public HourService getHourService() {
        return hourService;
    }

    public MinuteService getMinuteService() {
        return minuteService;
    }

    public Validator getValidator() {
        return validator;
    }
    
    
    
    

}
