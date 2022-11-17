package me.ivanherrero.ud25.ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud25.ex2.dto.Empleados;

public interface IEmpleadosDAO extends JpaRepository<Empleados, Integer> {

}
