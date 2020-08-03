package com.todopago.benefitstrategy.dto;


import com.todopago.benefitstrategy.strategies.CancelStrategy;
import com.todopago.benefitstrategy.strategies.CheckStrategy;
import com.todopago.benefitstrategy.strategies.ConfirmationStrategy;
import com.todopago.benefitstrategy.strategies.ReturnStrategy;
import com.todopago.benefitstrategy.strategies.ValidationStrategy;
import lombok.Data;

@Data
public class StrategyDto {
    
    private Strategy strategy;
    
    public static ValidationStrategy getStrategyInstance(Strategy strategy) {
        switch (strategy) {
            case CHECK:
                return new CheckStrategy();
            case CONFIRMATION:
                return new ConfirmationStrategy();
            case RETURN:
                return new ReturnStrategy();
            case CANCEL:
                return new CancelStrategy();
        }
        return null;
    }
    
    public enum Strategy {
        CHECK,
        CONFIRMATION,
        RETURN,
        CANCEL
    }
}
