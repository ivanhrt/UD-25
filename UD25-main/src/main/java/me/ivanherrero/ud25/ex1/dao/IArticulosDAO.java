package me.ivanherrero.ud25.ex1.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud25.ex1.dto.Articulos;
import me.ivanherrero.ud25.ex1.dto.Fabricantes;

public interface IArticulosDAO extends JpaRepository<Articulos, Long> {
	public List<Articulos> findByFabricante(Fabricantes fabricante);
}
