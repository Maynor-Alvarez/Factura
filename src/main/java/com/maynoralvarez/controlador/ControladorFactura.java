package com.maynoralvarez.controlador;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maynoralvarez.modelo.DetalleCrud;
import com.maynoralvarez.modelo.DetalleFact;
import com.maynoralvarez.modelo.Factura;
import com.maynoralvarez.modelo.FacturaCrud;
import com.maynoralvarez.modelo.FacturaDTO;

@RestController
@RequestMapping("/Factura")
public class ControladorFactura {

	
	private FacturaCrud fa;
	private DetalleCrud de;
	
	public ControladorFactura(FacturaCrud fa, DetalleCrud de) {
		this.fa = fa;
		this.de = de;
	}
	
	
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	

	
	
	@GetMapping
	public List<Factura> listaFacturas(){
		return fa.findAll();
	}
	
	@PostMapping("/Crear")
	public ResponseEntity crear(@RequestBody Factura factura) {
		this.fa.save(factura);
		return new ResponseEntity<>("Factura Creada", HttpStatus.CREATED);
	}
	
	@GetMapping("/Detalle")
	public ResponseEntity detalle(@RequestParam("idFactura") Long idFactura){
	Optional<Factura> factura = this.fa.findById(idFactura);
	if(factura.isPresent()) {
		FacturaDTO dto = new FacturaDTO();
		dto.setIdFactura(factura.get().getIdFactura());
		dto.setNombre(factura.get().getNombre());
		dto.setNit(factura.get().getNit());
		dto.setFecha(factura.get().getFecha());
		dto.setDetalle(de.findAllByIdFactura(dto.getIdFactura()));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}else {
		return new ResponseEntity<>("Factura no Existente", HttpStatus.CONFLICT);
		}
	}
	


}
