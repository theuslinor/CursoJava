package br.com.compass.exerciciosspringboot.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private int id;
    private String nome;
    private String cpf;

}
