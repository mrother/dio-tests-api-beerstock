package br.com.codered.beerstock.builder;

import br.com.codered.beerstock.dto.BeerDTO;
import br.com.codered.beerstock.enums.BeerType;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
