package com.todopago.benefitstrategy.strategies;

import com.todopago.benefitstrategy.dto.ProgramDto;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CancelStrategy implements ValidationStrategy {
    
    @Override
    public boolean validation(ProgramDto programDto) {
        log.info("cancel strategy");
        return false;
    }
}
