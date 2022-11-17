package me.ivanherrero.ud25.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ivanherrero.ud25.ex2.dao.IDepartamentosDAO;
import me.ivanherrero.ud25.ex2.dto.Departamentos;

@Service
public class DepartamentosServiceIMPL implements IDepartamentosService {
	@Autowired
	IDepartamentosDAO iDepartamentosDAO;

	@Override
	public List<Departamentos> listarDepartamentos() {
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamentos) {
		return iDepartamentosDAO.save(departamentos);
	}

	@Override
	public Departamentos departamentoXID(Long id) {
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public Departamentos actualizarDepartamento(Departamentos departamentos) {
		return iDepartamentosDAO.save(departamentos);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		iDepartamentosDAO.deleteById(id);

	}

}
