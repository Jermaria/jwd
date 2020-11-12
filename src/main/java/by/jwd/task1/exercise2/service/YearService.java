package by.jwd.task1.exercise2.service;

import java.util.Scanner;

import by.jwd.task1.exercise2.entity.Year;

public interface YearService {
    
    public int scanYear(Scanner scan);
    public Year getYear(int year);
    public boolean  isLeap(int year);

}
