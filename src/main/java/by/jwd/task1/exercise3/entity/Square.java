package by.jwd.task1.exercise3.entity;

import java.io.Serializable;

import by.jwd.task1.exercise3.service.NoSuchShapeException;

public class Square implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private double side;
    
    public Square() {}

    public Square(double side) throws NoSuchShapeException {

        if(side > 0) {
            
            this.side = side;
        
        } else {
            
            throw new NoSuchShapeException();
        }
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(side);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Square other = (Square) obj;
        if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [side=" + side + "]";
    }
    
    

}
