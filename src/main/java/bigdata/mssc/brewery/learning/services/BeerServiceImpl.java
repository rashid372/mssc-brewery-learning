package bigdata.mssc.brewery.learning.services;

import bigdata.mssc.brewery.learning.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId).beerName("Test Beer").beerStyle("pale").build();
    }
}
