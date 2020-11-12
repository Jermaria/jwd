package by.jwd.task1.exercise6.entity;

import java.io.Serializable;
import java.util.List;

public class Hour implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<Minute> minutes;
    
    public Hour() {}

    public Hour(List<Minute> minutes) {
        super();
        this.minutes = minutes;
    }

    public List<Minute> getMinutes() {
        return minutes;
    }

    public void setMinutes(List<Minute> minutes) {
        this.minutes = minutes;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((minutes == null) ? 0 : minutes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hour other = (Hour) obj;
        if (minutes == null) {
            if (other.minutes != null)
                return false;
        } else if (!minutes.equals(other.minutes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [minutes=" + minutes + "]";
    }
    
    
}
