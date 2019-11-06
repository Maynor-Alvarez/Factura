package com.maynoralvarez.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleCrud extends JpaRepository<DetalleFact, Long>{

	List<DetalleFact> findAllByIdFactura(Long idFactura);
}
