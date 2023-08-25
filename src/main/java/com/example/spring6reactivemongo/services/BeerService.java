package com.example.spring6reactivemongo.services;

import com.example.spring6reactivemongo.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeerService {
    Flux<BeerDTO> listBeers();
    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);
    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);
    Mono<BeerDTO> getById(String id);

    Mono<BeerDTO> updateBeer(String beerId, BeerDTO beerDTO);

    Mono<BeerDTO> patchBeer(String beerId, BeerDTO beerDTO);

    Mono<Void> deleteBeerById(String beerId);
}
