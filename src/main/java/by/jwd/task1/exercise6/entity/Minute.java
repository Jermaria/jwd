package by.jwd.task1.exercise6.entity;

import java.io.Serializable;

public class Minute implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private final int SECONDS_NUMBER = 60;
    
    public Minute() {}

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getSeconds() {
        return SECONDS_NUMBER;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + SECONDS_NUMBER;
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
        Minute other = (Minute) obj;
        if (SECONDS_NUMBER != other.SECONDS_NUMBER)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [seconds=" + SECONDS_NUMBER + "]";
    }

}
