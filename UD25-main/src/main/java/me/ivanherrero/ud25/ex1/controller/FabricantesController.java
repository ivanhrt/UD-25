package me.ivanherrero.ud25.ex1.controller;

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

import me.ivanherrero.ud25.ex1.dto.Fabricantes;
import me.ivanherrero.ud25.ex1.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {

    @Autowired FabricantesServiceImpl fabricantesServiceImpl;

    @GetMapping("/fabricantes")
    public List<Fabricantes> listarFabricantes() {
        return fabricantesServiceImpl.listarFabricantes();
    }

    @PostMapping("/fabricantes")
    public Fabricantes salvarEmpleado(@RequestBody Fabricantes fabricantes) {
        return fabricantesServiceImpl.guardarFabricantes(fabricantes);
    }

    @GetMapping("/fabricantes/{id}")
    public Fabricantes empleadoXID(@PathVariable(name = "id") Long id, @RequestBody Fabricantes fabricantes) {
        Fabricantes fabricantes_xid = new Fabricantes();

        fabricantes_xid = fabricantesServiceImpl.fabricantesXID(id);

        return fabricantes_xid;
    }

    @PutMapping("/fabricantes/{id}")
    public Fabricantes actualizarEmpleado(@PathVariable(name = "id") Long id,
                                          @RequestBody Fabricantes fabricantes) {
        Fabricantes fabricantes_seleccionado = new Fabricantes();
        Fabricantes fabricantes_actualizado = new Fabricantes();

        fabricantes_seleccionado = fabricantesServiceImpl.fabricantesXID(id);
        fabricantes_seleccionado.setNombre(fabricantes.getNombre());
        fabricantes_actualizado = fabricantesServiceImpl.actualizarFabricantes(fabricantes_seleccionado);

        return fabricantes_actualizado;
    }

    @DeleteMapping("/fabricantes/{id}")
    public void eliminarEmpleado(@PathVariable(name = "id") Long id) {
        fabricantesServiceImpl.eliminarFabricantes(id);
    }
}
