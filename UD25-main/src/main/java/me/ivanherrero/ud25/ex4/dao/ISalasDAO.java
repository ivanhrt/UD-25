package me.ivanherrero.ud25.ex4.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud25.ex4.dto.Salas;

public interface ISalasDAO extends JpaRepository<Salas, Integer> {


}
