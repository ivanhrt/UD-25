package me.ivanherrero.ud25.ex4.dto;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Salas")
public class Salas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;
	@Column(name = "nombre")
	private @Getter @Setter String nombre;
	
	@Exclude
	@ManyToOne
	@JoinColumn(name = "pelicula")
	private @Getter @Setter Peliculas Pelicula;
	

	
}
