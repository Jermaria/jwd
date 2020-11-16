package by.jwd.task1.exercise2.service;

import java.util.Optional;
import java.util.Scanner;

import by.jwd.task1.exercise2.entity.Month;

public interface MonthService {
    
    int scanMonthNumber(Scanner scan);
    Optional<Month> defineMonthByNumber(int num);

}
