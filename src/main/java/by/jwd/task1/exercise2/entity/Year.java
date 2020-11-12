package by.jwd.task1.exercise2.entity;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

public class Year implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int yearNumber;
	private Map<Month, Integer> months = new EnumMap<>(Month.class);
	
	
	public Year() {}
	
	public Year(boolean isLeap, int yearNumber) {
		
		if (isLeap) {
			
			int[] dayNum = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			for(int i = 0; i < Month.values().length; i++) {
				
				months.put(Month.values()[i], dayNum[i]);
			}
		
		} else {
			
			int[] dayNum = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			for(int i = 0; i < 12; i++) {

				months.put(Month.values()[i], dayNum[i]);
			}
		}
		
		this.yearNumber = yearNumber;
	}

	public int getYearNumber() {
		return yearNumber;
	}

	public void setYearNumber(int yearNumber) {
		this.yearNumber = yearNumber;
	}

	public Map<Month, Integer> getMonths() {
		return months;
	}

	public void setMonths(EnumMap<Month, Integer> months) {
		this.months = months;
	}

	public void setMonths(Map<Month, Integer> months) {
        this.months = months;
    }

    public static long getSerialversionuid() {
		return serialVersionUID;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((months == null) ? 0 : months.hashCode());
        result = prime * result + yearNumber;
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
        Year other = (Year) obj;
        if (months == null) {
            if (other.months != null)
                return false;
        } else if (!months.equals(other.months))
            return false;
        if (yearNumber != other.yearNumber)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [yearNumber=" + yearNumber + ", months=" + months + "]";
    }

}
