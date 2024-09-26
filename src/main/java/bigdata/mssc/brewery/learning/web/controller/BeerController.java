package bigdata.mssc.brewery.learning.web.controller;

import bigdata.mssc.brewery.learning.services.BeerService;
import bigdata.mssc.brewery.learning.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {
    private final BeerService service;

    public BeerController(BeerService service) {
        this.service = service;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") String beerId){
        return new ResponseEntity<>(service.getBeerById(beerId), HttpStatus.OK);
    }
}
