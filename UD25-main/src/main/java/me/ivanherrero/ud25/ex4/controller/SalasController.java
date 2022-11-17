package me.ivanherrero.ud25.ex4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ivanherrero.ud25.ex4.dto.Salas;
import me.ivanherrero.ud25.ex4.service.SalasServiceIMPL;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServiceIMPL SalasServiceIMPL;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return SalasServiceIMPL.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarSalas(@RequestBody Salas Salas) {
		return SalasServiceIMPL.guardarSalas(Salas);
	}
	
	@GetMapping("/salas/{id}")
	public Salas SalasXID(@PathVariable(name="id") int id) {
		
		Salas Salas_xid= new Salas();
		
		Salas_xid=SalasServiceIMPL.SalasXID(id);
				
		return Salas_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarSalas(@PathVariable(name="id")int id,@RequestBody Salas Salas) {
		
		Salas Salas_seleccionado= new Salas();
		Salas Salas_actualizado= new Salas();
		
		Salas_seleccionado= SalasServiceIMPL.SalasXID(id);
		
		Salas_seleccionado.setNombre(Salas.getNombre());
		Salas_seleccionado.setPelicula(Salas.getPelicula());
		
		Salas_actualizado = SalasServiceIMPL.actualizarSalas(Salas_seleccionado);
				
		return Salas_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eleiminarSalas(@PathVariable(name="id")int id) {
		SalasServiceIMPL.eliminarSalas(id);
	}
	
}
