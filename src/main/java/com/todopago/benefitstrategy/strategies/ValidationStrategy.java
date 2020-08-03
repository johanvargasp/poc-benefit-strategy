package com.todopago.benefitstrategy.strategies;

import com.todopago.benefitstrategy.dto.ProgramDto;

public interface ValidationStrategy {
    
    boolean validation(ProgramDto programDto);
}
