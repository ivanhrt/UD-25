package me.ivanherrero.ud25.ex3.service;

import java.util.List;

import me.ivanherrero.ud25.ex3.dto.Box;

public interface ICajasService {

	public List<Box> listarCajas();

	public Box guardarCajas(Box cajas);

	public Box CajasXID(String id);

	public List<Box> listarCajasAlmacenes(String almacen);

	public Box actualizarCajas(Box cajas);

	public void eliminarCajas(String numreferencia);
}
