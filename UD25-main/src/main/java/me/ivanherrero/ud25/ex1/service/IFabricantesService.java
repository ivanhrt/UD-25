package me.ivanherrero.ud25.ex1.service;

import java.util.List;

import me.ivanherrero.ud25.ex1.dto.Fabricantes;

public interface IFabricantesService {

	public List<Fabricantes> listarFabricantes();

	public Fabricantes guardarFabricantes(Fabricantes fabricantes);

	public Fabricantes fabricantesXID(Long id);

	public Fabricantes actualizarFabricantes(Fabricantes fabricantes);

	public void eliminarFabricantes(Long id);
}
