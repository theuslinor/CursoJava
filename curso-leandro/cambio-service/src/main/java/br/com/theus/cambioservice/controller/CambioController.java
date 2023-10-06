package br.com.theus.cambioservice.controller;

import br.com.theus.cambioservice.model.Cambio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.theus.cambioservice.repository.CambioRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;


@RestController
@RequestMapping("cambio-service")
public class CambioController {

    @Autowired
    private Environment enviroment;

    @Autowired
    private CambioRepository repository;

    @GetMapping(value = "/{amount}/{from}/{to}")
    public Cambio getCambio(
            @PathVariable("amount") BigDecimal amount,
            @PathVariable("from") String from,
            @PathVariable("to") String to
            ){

        var cambio = repository.findByFromAndTo(from, to);
        if (cambio == null) throw new RuntimeException("Currency Unsupported");

        var port = enviroment.getProperty("local.server.port");
        BigDecimal conversionFactor = cambio.getConversionFactor();
        BigDecimal convertedValue = conversionFactor.multiply(amount);
        cambio.setConvertedValue(convertedValue.setScale(2,  RoundingMode.CEILING));
        cambio.setEnvironment(port);

        return cambio;
    }
}
