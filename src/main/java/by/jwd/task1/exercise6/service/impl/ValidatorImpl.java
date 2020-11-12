package by.jwd.task1.exercise6.service.impl;

import by.jwd.task1.exercise6.service.UnacceptableValueServiceException;
import by.jwd.task1.exercise6.service.Validator;

public class ValidatorImpl implements Validator {
    
    @Override
    public boolean validateSecondsInput(int seconds) throws UnacceptableValueServiceException {
        
        if (seconds >= 86400 || seconds < 0) {
            
            throw new UnacceptableValueServiceException();
        }
        
        return true;
    }

}
