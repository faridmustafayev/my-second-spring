package com.example.ms.ingress.spring.service;

import com.example.ms.ingress.spring.dao.CalculatorRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import static lombok.AccessLevel.PRIVATE;

@Service
@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CalculateServiceImpl implements CalculatorService{

    CalculatorRepository calculatorRepository;

    @Override
    public Double add(Double a, Double b) {
        Double result = a + b;
        calculatorRepository.setLastResult(result);
        return result;
    }

    @Override
    public Double multiply(Double a, Double b) {
        Double result = a * b;
        calculatorRepository.setLastResult(result);
        return result;
    }

    @Override
    public Double subtract(Double a, Double b) {
        Double result = a - b;
        calculatorRepository.setLastResult(result);
        return result;
    }

    @Override
    public Double divide(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }

        Double result = a / b;
        calculatorRepository.setLastResult(result);
        return result;
    }

    @Override
    public Double getLastResult() {
        return calculatorRepository.getLastResult();
    }
}
