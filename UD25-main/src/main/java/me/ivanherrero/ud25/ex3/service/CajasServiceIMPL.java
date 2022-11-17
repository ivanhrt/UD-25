package me.ivanherrero.ud25.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ivanherrero.ud25.ex3.dao.ICajasDAO;
import me.ivanherrero.ud25.ex3.dto.Box;

@Service
public class CajasServiceIMPL implements ICajasService{

	@Autowired
	ICajasDAO iCajasDAO;
	@Override
	public List<Box> listarCajas() {
		return iCajasDAO.findAll();
	}

	@Override
	public Box guardarCajas(Box cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public Box CajasXID(String id) {
		return iCajasDAO.findById(id).get();
	}

	@Override
	public List<Box> listarCajasAlmacenes(String almacen) {
		return iCajasDAO.findByAlmacen(almacen);
	}

	@Override
	public Box actualizarCajas(Box cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public void eliminarCajas(String numreferencia) {
		iCajasDAO.deleteById(numreferencia);
		
	}
	
}
