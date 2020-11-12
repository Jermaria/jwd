package by.jwd.task1.exercise10.entity;

import java.io.Serializable;

public class Interval implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int x1;
    private int x2;
    
    public Interval() {}

    public Interval(int x1, int x2) {

        this.x1 = x1;
        this.x2 = x2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x1;
        result = prime * result + x2;
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
        Interval other = (Interval) obj;
        if (x1 != other.x1)
            return false;
        if (x2 != other.x2)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +" [x1=" + x1 + ", x2=" + x2 + "]";
    }
    
    

}
