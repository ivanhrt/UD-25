package me.ivanherrero.ud25.ex2.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name="Empleados")
public class Empleados {
	@Id
	private @Getter @Setter String dni;

	private @Getter @Setter String nombre;
	private @Getter @Setter String apellidos;

	@Exclude
	@ManyToOne
	@JoinColumn(name = "cod_dep")
	private @Getter @Setter Departamentos departamento;

}
