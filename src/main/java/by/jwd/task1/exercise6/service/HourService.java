package by.jwd.task1.exercise6.service;

import java.util.List;

import by.jwd.task1.exercise6.entity.Hour;

public interface HourService {
    
    public int getHoursNumber(int seconds) throws UnacceptableValueServiceException;
    public List<Hour> createHourList(int hoursNum);

}
