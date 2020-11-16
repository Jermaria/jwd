package by.jwd.task1.exercise3.service;

import by.jwd.task1.exercise3.service.impl.CircleServiceImpl;
import by.jwd.task1.exercise3.service.impl.SquareServiceImpl;

public class ServiceFactory {
    
    private static final ServiceFactory INSTANCE = new ServiceFactory();
    
    private final CircleService circleService = new CircleServiceImpl();
    private final SquareService squareService = new SquareServiceImpl();
    
    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public CircleService getCircleService() {
        return circleService;
    }

    public SquareService getSquareService() {
        return squareService;
    }
    
    

}
