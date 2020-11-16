package by.jwd.task1.exercise6.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.jwd.task1.exercise6.entity.Minute;
import by.jwd.task1.exercise6.service.MinuteService;

public class MinuteServiceImpl implements MinuteService {

    public int calculateMinutesTotal(int seconds) {

        return seconds / 60;
        
    }
    
    public int calculateMinutesLeft(int seconds) {
        
        int minutesTotal = calculateMinutesTotal(seconds-1);
        
        return minutesTotal % 60;
        
    }
    
    public List<Minute> createMinutesList(int minutesNum) {
        
        List<Minute> minutes = new ArrayList<Minute>();
        
        for (int i = 0; i < minutesNum; i++) {
            
            Minute minute = new Minute();
            
            minutes.add(minute);
        }
        
        return minutes;
    }
    
    public int calculateRemainder(int seconds) {
        
        int secondsPassed = seconds - 1;
        
        int secondsLeft = secondsPassed % 3600 % 60;
        
        return secondsLeft;
    }
    
    

}
