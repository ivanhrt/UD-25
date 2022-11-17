package me.ivanherrero.ud25.ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ivanherrero.ud25.ex3.dto.Warehouse;
import me.ivanherrero.ud25.ex3.service.AlmacenesServiceIMPL;

@RestController
@RequestMapping("/api")
public class AlmacenesController {

	@Autowired
	AlmacenesServiceIMPL almacenesServiceImpl;

	@GetMapping("/almacenes")
	public List<Warehouse> listarAlmacenes() {
		return almacenesServiceImpl.listarAlmaceness();
	}

	@PostMapping("/almacenes")
	public Warehouse salvarAlmacenes(@RequestBody Warehouse Almacenes) {
		return almacenesServiceImpl.guardarAlmacenes(Almacenes);
	}

	@GetMapping("/almacenes/{id}")
	public Warehouse AlmacenesXID(@PathVariable(name = "id") Long id) {

		Warehouse Almacenes_xid = new Warehouse();

		Almacenes_xid = almacenesServiceImpl.AlmacenesXID(id);

		System.out.println("Almacenes XID: " + Almacenes_xid);

		return Almacenes_xid;
	}

	@PutMapping("/Almacenes/{id}")
	public Warehouse actualizarAlmacenes(@PathVariable(name = "id") Long id, @RequestBody Warehouse Almacenes) {

		Warehouse Almacenes_seleccionado = new Warehouse();
		Warehouse Almacenes_actualizado = new Warehouse();

		Almacenes_seleccionado = almacenesServiceImpl.AlmacenesXID(id);

		Almacenes_seleccionado.setId(Almacenes.getId());
		Almacenes_seleccionado.setLugar(Almacenes.getLugar());
		Almacenes_seleccionado.setCapacidad(Almacenes.getCapacidad());

		Almacenes_actualizado = almacenesServiceImpl.actualizarAlmacenes(Almacenes_seleccionado);

		System.out.println("El Almacenes actualizado es: " + Almacenes_actualizado);

		return Almacenes_actualizado;
	}

	@DeleteMapping("/Almacenes/{id}")
	public void eliminarAlmacenes(@PathVariable(name = "id") Long id) {
		almacenesServiceImpl.eliminarAlmacenes(id);
	}
}
