package me.ivanherrero.ud25.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ivanherrero.ud25.ex3.dao.IAlmacenesDAO;
import me.ivanherrero.ud25.ex3.dto.Warehouse;

@Service
public class AlmacenesServiceIMPL implements IAlmacenesService{

	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	@Override
	public List<Warehouse> listarAlmaceness() {
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Warehouse guardarAlmacenes(Warehouse almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public Warehouse AlmacenesXID(Long id) {
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Warehouse actualizarAlmacenes(Warehouse almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public void eliminarAlmacenes(Long id) {
		iAlmacenesDAO.deleteById(id);
	}

}
