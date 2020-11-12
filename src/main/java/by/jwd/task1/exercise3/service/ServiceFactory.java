package by.jwd.task1.exercise3.service;

import by.jwd.task1.exercise3.service.impl.CircleServiceImpl;
import by.jwd.task1.exercise3.service.impl.SquareServiceImpl;

public class ServiceFactory {
    
    private static final ServiceFactory instance = new ServiceFactory();
    
    private static final CircleService circleService = new CircleServiceImpl();
    private static final SquareService squareService = new SquareServiceImpl();
    
    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public CircleService getCircleService() {
        return circleService;
    }

    public SquareService getSquareService() {
        return squareService;
    }
    
    

}
