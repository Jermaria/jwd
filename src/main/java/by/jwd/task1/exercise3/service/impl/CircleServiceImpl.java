package by.jwd.task1.exercise3.service.impl;

import by.jwd.task1.exercise3.entity.Square;
import by.jwd.task1.exercise3.service.CircleService;

public class CircleServiceImpl implements CircleService {
    
    public double calculateInscribedRadius(Square square) {
        
        return square.getSide() / 2;
    }

}
