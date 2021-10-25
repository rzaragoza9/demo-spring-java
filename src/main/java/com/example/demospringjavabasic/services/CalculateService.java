package com.example.demospringjavabasic.services;

import com.example.demospringjavabasic.models.dto.PriceDTO;

public interface CalculateService {
    PriceDTO calculate(String location);
}
