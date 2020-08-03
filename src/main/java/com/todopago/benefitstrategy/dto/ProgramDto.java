package com.todopago.benefitstrategy.dto;

import com.todopago.benefitstrategy.strategies.ValidationStrategy;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProgramDto {
    private ValidationStrategy strategy;
    
    public ProgramDto(ValidationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public boolean isValid() {
        return strategy.validation(this);
    }
}
