package by.jwd.task1.exercise6.entity;

import java.io.Serializable;
import java.util.List;

public class Moment implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<Hour> hours;
    private List<Minute> minutes;
    private int seconds;
    
    public Moment() {}

    public Moment(List<Hour> hours, List<Minute> minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public List<Hour> getHours() {
        return hours;
    }

    public void setHours(List<Hour> hours) {
        this.hours = hours;
    }

    public List<Minute> getMinutes() {
        return minutes;
    }

    public void setMinutes(List<Minute> minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public static long getSerialversionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
    }
    
    
    
}
