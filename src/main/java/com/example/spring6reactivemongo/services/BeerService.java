package com.example.spring6reactivemongo.services;

import com.example.spring6reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public interface BeerService {
    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);
    Mono<BeerDTO> getById(String id);
}
