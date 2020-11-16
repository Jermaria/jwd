package by.jwd.task1.exercise6.service;

import java.util.List;

import by.jwd.task1.exercise6.entity.Hour;

public interface HourService {
    
    int calculateHoursNumber(int seconds) throws UnacceptableValueServiceException;
    List<Hour> createHourList(int hoursNum);

}
