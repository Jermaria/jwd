package by.jwd.task1.exercise6.controller;

import java.util.List;

import by.jwd.task1.exercise6.entity.Hour;
import by.jwd.task1.exercise6.entity.Minute;
import by.jwd.task1.exercise6.entity.Moment;
import by.jwd.task1.exercise6.service.ServiceFactory;
import by.jwd.task1.exercise6.service.UnacceptableValueServiceException;

public class Main {

    public static void main(String[] args) {
        
        int seconds = 3676;
        
        ServiceFactory factory = ServiceFactory.getInstance();
        
        int hoursNum, minutesNum, secondsNum;
        
        Printer printer = Printer.getInstance();
        
        try {
            
            hoursNum = factory.getHourService().getHoursNumber(seconds);
            minutesNum = factory.getMinuteService().getMinutesLeft(seconds);
            secondsNum = factory.getMinuteService().getRemainder(seconds);
            
            List<Hour> hours = factory.getHourService().createHourList(hoursNum);
            List<Minute> minutes = factory.getMinuteService().getMinutesList(minutesNum);
            
            Moment moment = new Moment(hours, minutes, secondsNum);
            
            printer.printPassedTime(moment);
            
        } catch (UnacceptableValueServiceException e) {
            
            //log
            printer.printFailureMessage();
        }

    }

}
