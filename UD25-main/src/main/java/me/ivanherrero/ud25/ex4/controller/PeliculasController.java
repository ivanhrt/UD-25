package me.ivanherrero.ud25.ex4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.ivanherrero.ud25.ex4.dto.Peliculas;
import me.ivanherrero.ud25.ex4.service.PeliculasServiceIMPL;

@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceIMPL PeliculasServiceIMPL;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return PeliculasServiceIMPL.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas salvarPeliculas(@RequestBody Peliculas Peliculas) {
		return PeliculasServiceIMPL.guardarPeliculas(Peliculas);
	}
	
	@GetMapping("/peliculas/{id}")
	public Peliculas PeliculasXID(@PathVariable(name="id") int id) {
		Peliculas Peliculas_xid= new Peliculas();
		
		Peliculas_xid=PeliculasServiceIMPL.PeliculasXID(id);
				
		return Peliculas_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarPeliculas(@PathVariable(name="id")int id,@RequestBody Peliculas Peliculas) {
		Peliculas Peliculas_seleccionado= new Peliculas();
		Peliculas Peliculas_actualizado= new Peliculas();
		
		Peliculas_seleccionado= PeliculasServiceIMPL.PeliculasXID(id);
		
		Peliculas_seleccionado.setNombre(Peliculas.getNombre());
		Peliculas_seleccionado.setClasificacionEdad(Peliculas.getClasificacionEdad());
		
		Peliculas_actualizado = PeliculasServiceIMPL.actualizarPeliculas(Peliculas_seleccionado);
				
		return Peliculas_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eleiminarPeliculas(@PathVariable(name="id")int id) {
		PeliculasServiceIMPL.eliminarPeliculas(id);
	}
	
}
