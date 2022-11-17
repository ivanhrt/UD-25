package me.ivanherrero.ud25.ex4.dto;


import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import me.ivanherrero.ud25.ex1.dto.Articulos;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Peliculas")
public class Peliculas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;
	@Column(name = "nombre")
	private @Getter @Setter String nombre;
	@Column(name = "Clasificacion_Edad")
	private @Getter @Setter int ClasificacionEdad;
	
	@JsonIgnore
	@OneToMany(mappedBy= "Pelicula")
	private @Getter @Setter List<Salas> Salas;
}
