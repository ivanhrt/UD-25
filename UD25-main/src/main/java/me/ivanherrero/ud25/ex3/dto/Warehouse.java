package me.ivanherrero.ud25.ex3.dto;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "warehouses")
public class Warehouse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long id;
	private @Getter @Setter String lugar;
	private @Getter @Setter int capacidad;

	// https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping 
	@OneToMany(mappedBy= "almacen") // Nom de la variable de l'altre entitat que guarda la FK d'aquesta entitat
	@JsonIgnore
	private @Setter List<Box> cajas;
}
