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

import me.ivanherrero.ud25.ex3.dto.Box;
import me.ivanherrero.ud25.ex3.service.CajasServiceIMPL;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceIMPL cajasServiceImpl;

	@GetMapping("/cajas")
	public List<Box> listarCajass() {
		return cajasServiceImpl.listarCajas();
	}

	// listar Cajass por campo nombre
	@GetMapping("/cajas/almacen/{almacen}")
	public List<Box> listarCajasNombre(@PathVariable(name = "almacen") String almacen) {
		return cajasServiceImpl.listarCajasAlmacenes(almacen);
	}

	@PostMapping("/cajas")
	public Box salvarCajas(@RequestBody Box Cajas) {
		return cajasServiceImpl.guardarCajas(Cajas);
	}

	@GetMapping("/cajas/{id}")
	public Box CajasXID(@PathVariable(name = "id") String id) {
		Box Cajas_xid = new Box();
		Cajas_xid = cajasServiceImpl.CajasXID(id);
		return Cajas_xid;
	}

	@PutMapping("/Cajas/{id}")
	public Box actualizarCajas(@PathVariable(name = "id") String id, @RequestBody Box Cajas) {
		Box Cajas_seleccionado = new Box();
		Box Cajas_actualizado = new Box();

		Cajas_seleccionado = cajasServiceImpl.CajasXID(id);

		Cajas_seleccionado.setNum_ref(Cajas.getNum_ref());
		Cajas_seleccionado.setContenido(Cajas.getContenido());
		Cajas_seleccionado.setValor(Cajas.getValor());

		Cajas_actualizado = cajasServiceImpl.actualizarCajas(Cajas_seleccionado);

		return Cajas_actualizado;
	}

	@DeleteMapping("/cajas/{id}")
	public void eliminarCajas(@PathVariable(name = "id") String id) {
		cajasServiceImpl.eliminarCajas(id);
	}

}
