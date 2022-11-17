package me.ivanherrero.ud25.ex4.service;

import java.util.List;

import me.ivanherrero.ud25.ex4.dto.Salas;

public interface ISalasService {

	public List<Salas> listarSalas();
	
	public Salas guardarSalas(Salas Salas);
	
	public Salas SalasXID(int id);
	
	public Salas actualizarSalas(Salas Salas);
	
	public void eliminarSalas(int id);
	
}
