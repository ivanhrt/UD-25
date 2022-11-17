package me.ivanherrero.ud25.ex3.service;

import java.util.List;

import me.ivanherrero.ud25.ex3.dto.Warehouse;

public interface IAlmacenesService {

	public List<Warehouse> listarAlmaceness();

	public Warehouse guardarAlmacenes(Warehouse Almacenes);

	public Warehouse AlmacenesXID(Long id);

	public Warehouse actualizarAlmacenes(Warehouse Almacenes);

	public void eliminarAlmacenes(Long id);
}