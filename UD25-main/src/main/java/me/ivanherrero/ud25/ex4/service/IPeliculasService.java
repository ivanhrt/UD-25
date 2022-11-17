package me.ivanherrero.ud25.ex4.service;

import java.util.List;

import me.ivanherrero.ud25.ex4.dto.Peliculas;

public interface IPeliculasService {

public List<Peliculas> listarPeliculas();
	
	public Peliculas guardarPeliculas(Peliculas Peliculas);
	
	public Peliculas PeliculasXID(int id);
	
	
	public Peliculas actualizarPeliculas(Peliculas Peliculas);
	
	public void eliminarPeliculas(int id);
	
}
