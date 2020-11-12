package by.jwd.task1.exercise2.entity;

public enum Month {
	
	JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7),
	AUGUST(8), SEPTEMBER(9), NOVEMBER(10), OCTOBER(11), DECEMBER(12);
	
	private final int monthNumber;

	private Month(int monthNumber) {
		this.monthNumber = monthNumber;
	}

	public int getMonthNumber() {
		return monthNumber;
	}

}
