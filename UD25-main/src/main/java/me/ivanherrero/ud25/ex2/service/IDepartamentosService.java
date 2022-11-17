package me.ivanherrero.ud25.ex2.service;

import java.util.List;

import me.ivanherrero.ud25.ex2.dto.Departamentos;

public interface IDepartamentosService {
public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamentos(Departamentos departamentos);
	
	public Departamentos departamentoXID(Long id);
	
	public Departamentos actualizarDepartamento(Departamentos departamentos);
	
	public void eliminarDepartamento(Long id);
}
