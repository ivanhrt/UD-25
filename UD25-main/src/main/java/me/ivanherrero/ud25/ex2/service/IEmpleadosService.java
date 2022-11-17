package me.ivanherrero.ud25.ex2.service;

import java.util.List;

import me.ivanherrero.ud25.ex2.dto.Empleados;

public interface IEmpleadosService {
	
	public List<Empleados> listarEmpleados();
	
	public Empleados guardarEmpleados(Empleados empleados);
	
	public Empleados empleadoXID(int id);
	
	public Empleados actualizarEmpleado(Empleados empleados);
	
	public void eliminarEmpleados(int id);

}
