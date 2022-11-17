package me.ivanherrero.ud25.ex3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud25.ex3.dto.Box;

public interface ICajasDAO extends JpaRepository<Box, String>{
	
	public List<Box> findByAlmacen(String almacen);
	
}