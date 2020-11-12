package by.jwd.task1.exercise6.service;

import java.util.List;

import by.jwd.task1.exercise6.entity.Minute;

public interface MinuteService {
    
    public int getMinutesTotal(int seconds);
    public int getMinutesLeft(int seconds);
    public List<Minute> getMinutesList(int minutesNum);
    public int getRemainder(int seconds);
    

}
