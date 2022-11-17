package me.ivanherrero.ud25.ex2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name="Departamentos")
public class Departamentos {
	@Id
	private @Getter @Setter int codigo;

	private @Getter @Setter String nombre;
	private @Getter @Setter int presupuesto;

	@JsonIgnore
	@OneToMany(mappedBy= "departamento")
	private @Getter @Setter List<Empleados> empleado;
}
