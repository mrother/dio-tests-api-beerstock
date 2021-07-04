package br.com.codered.beerstock.mapper;

import br.com.codered.beerstock.dto.BeerDTO;
import br.com.codered.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
