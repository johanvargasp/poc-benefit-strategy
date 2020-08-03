package com.todopago.benefitstrategy.strategies;

import com.todopago.benefitstrategy.dto.ProgramDto;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConfirmationStrategy implements ValidationStrategy {
    
    @Override
    public boolean validation(ProgramDto programDto) {
        log.info("confirmation strategy");
        return false;
    }
    
}
