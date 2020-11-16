package by.jwd.task1.exercise6.service;

import java.util.List;

import by.jwd.task1.exercise6.entity.Minute;

public interface MinuteService {
    
    int calculateMinutesTotal(int seconds);
    int calculateMinutesLeft(int seconds);
    List<Minute> createMinutesList(int minutesNum);
    int calculateRemainder(int seconds);

}
