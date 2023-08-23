package com.example.spring6reactivemongo.services;

import com.example.spring6reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public class BeerServiceImpl implements BeerService {
    @Override
    public Mono<BeerDTO> saveBeer(BeerDTO beerDTO) {
        return null;
    }

    @Override
    public Mono<BeerDTO> getById(String id) {
        return null;
    }
}
