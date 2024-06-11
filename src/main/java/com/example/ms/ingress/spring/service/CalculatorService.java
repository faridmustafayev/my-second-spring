package com.example.ms.ingress.spring.service;

public interface CalculatorService {
    Double add(Double a, Double b);
    Double multiply(Double a, Double b);
    Double subtract(Double a, Double b);
    Double divide(Double a, Double b);
    Double getLastResult();
}
