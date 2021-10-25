package com.example.demospringjavabasic.services;

import com.example.demospringjavabasic.models.dto.PriceDTO;
import com.example.demospringjavabasic.repositories.PriceRepository;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImp implements CalculateService{
    private final PriceRepository priceRepository;

    public CalculateServiceImp(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public PriceDTO calculate(String location) {
        return priceRepository.findPriceByLocation(location);
    }

}
