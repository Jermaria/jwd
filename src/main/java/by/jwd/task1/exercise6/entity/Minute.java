package by.jwd.task1.exercise6.entity;

import java.io.Serializable;

public class Minute implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private final int secondNum = 60;
    
    public Minute() {}

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getSeconds() {
        return secondNum;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + secondNum;
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
        if (secondNum != other.secondNum)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [seconds=" + secondNum + "]";
    }

}
