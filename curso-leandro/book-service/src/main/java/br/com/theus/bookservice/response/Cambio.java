package br.com.theus.bookservice.response;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cambio {

    private long id;
    private String from;
    private String to;
    private Double conversionFactor;
    private Double convertedValue;
    private String environment;

    }
