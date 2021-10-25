package com.example.demospringjavabasic.services;

import com.example.demospringjavabasic.models.dto.PriceDTO;
import com.example.demospringjavabasic.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImp implements CalculateService{
    @Autowired
    private PriceRepository priceRepository;

    @Override
    public PriceDTO calculate(String location) {
        return priceRepository.findPriceByLocation(location);
    }

}
