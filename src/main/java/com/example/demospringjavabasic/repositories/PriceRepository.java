package com.example.demospringjavabasic.repositories;

import com.example.demospringjavabasic.models.dto.PriceDTO;

public interface PriceRepository {
    PriceDTO findPriceByLocation(String location);
}
