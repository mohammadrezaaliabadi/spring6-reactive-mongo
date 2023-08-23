package com.example.spring6reactivemongo.mappers;

import com.example.spring6reactivemongo.domain.Beer;
import com.example.spring6reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
