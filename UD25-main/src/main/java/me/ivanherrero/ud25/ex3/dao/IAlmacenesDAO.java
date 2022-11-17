package me.ivanherrero.ud25.ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud25.ex3.dto.Warehouse;

public interface IAlmacenesDAO extends JpaRepository<Warehouse, Long>{


}
