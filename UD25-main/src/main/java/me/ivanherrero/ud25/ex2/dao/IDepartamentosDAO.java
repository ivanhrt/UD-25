package me.ivanherrero.ud25.ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud25.ex2.dto.Departamentos;

public interface IDepartamentosDAO extends JpaRepository<Departamentos, Long> {

}
