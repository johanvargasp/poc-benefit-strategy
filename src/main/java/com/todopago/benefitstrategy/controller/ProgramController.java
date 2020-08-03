package com.todopago.benefitstrategy.controller;

import com.todopago.benefitstrategy.dto.StrategyDto;
import com.todopago.benefitstrategy.service.ProgramService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@RestController
@RequestMapping("/program")
public class ProgramController {
    
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private ProgramService programService;
    
    @GetMapping("/{strategy}")
    public ResponseEntity<String> validation(@PathVariable String strategy) {
        try {
            String tenantId = request.getHeader("X-TentantId");
            log.info("Tenant id: " + tenantId);
            return ResponseEntity.ok(programService.validation(StrategyDto.Strategy.valueOf(strategy.toUpperCase())));
        }
        catch (IllegalArgumentException e){
            return ResponseEntity.status(500).body("Not command found");
        }
        catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
    
}
