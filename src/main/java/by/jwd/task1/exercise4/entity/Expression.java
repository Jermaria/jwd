package by.jwd.task1.exercise4.entity;

import java.io.Serializable;
import java.util.Arrays;

public class Expression implements Serializable {

    private static final long serialVersionUID = 1L;
    
    int[] array;
    
    public Expression() {}
    
    public Expression(int[] array) {
        
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +" [array=" + Arrays.toString(array) + "]";
    }

}
