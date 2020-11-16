package by.jwd.task1.exercise6.service;

public interface Validator {
    
    boolean validateSecondsInput(int seconds) throws UnacceptableValueServiceException;

}
