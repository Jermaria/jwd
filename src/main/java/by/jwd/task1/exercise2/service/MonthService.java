package by.jwd.task1.exercise2.service;

import java.util.Optional;
import java.util.Scanner;

import by.jwd.task1.exercise2.entity.Month;

public interface MonthService {
    
    public int scanMonthNumber(Scanner scan);
    public Optional<Month> getMonthByNumber(int num);

}
