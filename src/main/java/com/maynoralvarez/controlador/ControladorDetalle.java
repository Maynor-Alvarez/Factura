package com.maynoralvarez.controlador;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maynoralvarez.modelo.DetalleCrud;
import com.maynoralvarez.modelo.DetalleFact;

@RestController
@RequestMapping("/Detalle")
public class ControladorDetalle {

	private DetalleCrud de;
	
	public ControladorDetalle(DetalleCrud de) {
		this.de = de;
	}
	

	@GetMapping("/dto")
	public ResponseEntity detalleFact(@RequestParam("idDetalle") Long idDetalle) {
		Optional<DetalleFact> detalleFact = this.de.findById(idDetalle);
		if(detalleFact.isPresent()) {
		DetalleFact dto = new DetalleFact();
		dto.setCantidad(dto.getCantidad());
		dto.setDescripcion(dto.getDescripcion());
		dto.setTotal(dto.getTotal());
		dto.setIdDetalle(dto.getIdDetalle());
		return new ResponseEntity<>(detalleFact.get(), HttpStatus.OK);
	}else {
		return new ResponseEntity<>("Factura no Existente", HttpStatus.CONFLICT);
	}
}
}
