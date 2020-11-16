package by.jwd.task1.exercise2.service;

import java.util.Scanner;

import by.jwd.task1.exercise2.entity.Year;

public interface YearService {
    
    int scanYear(Scanner scan);
    Year getYear(int year);
    boolean  isLeap(int year);

}
