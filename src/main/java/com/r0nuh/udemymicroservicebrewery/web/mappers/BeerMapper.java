package com.r0nuh.udemymicroservicebrewery.web.mappers;

import org.mapstruct.Mapper;

import com.r0nuh.udemymicroservicebrewery.domain.Beer;
import com.r0nuh.udemymicroservicebrewery.web.model.BeerDTO;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
