package me.ivanherrero.ud25.ex1.service;

import java.util.List;

import me.ivanherrero.ud25.ex1.dto.Articulos;
import me.ivanherrero.ud25.ex1.dto.Fabricantes;

public interface IArticulosService {

	public List<Articulos> listarArticulos();

	public Articulos guardarArticulos(Articulos articulos);

	public Articulos articulosXID(Long id);

	public List<Articulos> listarArticulosFabricantes(Fabricantes fabricante);

	public Articulos actualizarArticulos(Articulos articulos);

	public void eliminarArticulos(Long id);
}
