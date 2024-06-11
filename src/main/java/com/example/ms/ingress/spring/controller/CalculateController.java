package com.example.ms.ingress.spring.controller;

import com.example.ms.ingress.spring.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequestMapping(path = "/calculator")
@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CalculateController {
    CalculatorService calculatorService;

    @GetMapping(path = "/add")
    public Double add(Double a, Double b) {
        return calculatorService.add(a, b);
    }

    @GetMapping(path = "/multiply")
    public Double multiply(Double a, Double b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping(path = "/subtract")
    public Double subtract(Double a, Double b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping(path = "/divide")
    public Double divide(Double a, Double b) {
        return calculatorService.divide(a, b);
    }

    @GetMapping(path = "lastResult")
    public Double lastResult() {
        return calculatorService.getLastResult();
    }
}
