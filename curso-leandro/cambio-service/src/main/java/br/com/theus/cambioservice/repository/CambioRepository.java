package br.com.theus.cambioservice.repository;

import br.com.theus.cambioservice.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

    Cambio findByFromAndTo(String from, String to);
}
