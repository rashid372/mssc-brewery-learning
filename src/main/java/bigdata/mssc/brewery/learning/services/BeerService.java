package bigdata.mssc.brewery.learning.services;

import bigdata.mssc.brewery.learning.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
