package by.jwd.task1.exercise6.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.jwd.task1.exercise6.entity.Hour;
import by.jwd.task1.exercise6.service.HourService;
import by.jwd.task1.exercise6.service.ServiceFactory;
import by.jwd.task1.exercise6.service.UnacceptableValueServiceException;

public class HourServiceImpl implements HourService {
    
    private static final ServiceFactory FACTORY = ServiceFactory.getInstance();
    
    public int calculateHoursNumber(int seconds) throws UnacceptableValueServiceException {
        
        int hours = 0;
        
        if (FACTORY.getValidator().validateSecondsInput(seconds)) {
            
            int minutes = FACTORY.getMinuteService().calculateMinutesTotal(seconds-1);
            
            hours = minutes / 60;
        }
        
        return hours;
    }
    
    @Override
    public List<Hour> createHourList(int hoursNum) {
        
        List<Hour> hours = new ArrayList<Hour>();
        
        for (int i = 0; i < hoursNum; i++) {
            
            Hour hour = new Hour();
            hours.add(hour);
        }
        
        return hours;
    }
    
    


}
