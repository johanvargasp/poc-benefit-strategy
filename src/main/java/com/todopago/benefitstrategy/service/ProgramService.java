package com.todopago.benefitstrategy.service;

import com.todopago.benefitstrategy.dto.ProgramDto;
import com.todopago.benefitstrategy.dto.StrategyDto;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {
    
    public String validation(StrategyDto.Strategy strategy) {
        return Boolean.toString(ProgramDto.builder().strategy(StrategyDto.getStrategyInstance(strategy)).build().isValid());
    }
    
}
