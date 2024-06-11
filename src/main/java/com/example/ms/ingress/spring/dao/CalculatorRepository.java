package com.example.ms.ingress.spring.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Setter
@Getter
public class CalculatorRepository {
    private Double lastResult = 0.0;
}
