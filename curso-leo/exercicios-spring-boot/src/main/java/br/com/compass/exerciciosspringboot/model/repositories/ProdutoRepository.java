package br.com.compass.exerciciosspringboot.model.repositories;

import br.com.compass.exerciciosspringboot.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
