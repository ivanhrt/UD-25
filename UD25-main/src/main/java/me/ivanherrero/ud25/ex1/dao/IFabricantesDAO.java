package me.ivanherrero.ud25.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud25.ex1.dto.Fabricantes;

public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long>  {}
