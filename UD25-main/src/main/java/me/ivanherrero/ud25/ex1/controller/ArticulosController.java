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

import me.ivanherrero.ud25.ex1.dto.Articulos;
import me.ivanherrero.ud25.ex1.dto.Fabricantes;
import me.ivanherrero.ud25.ex1.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {

    @Autowired ArticulosServiceImpl articulosServiceImpl;

    @GetMapping("/articulos")
    public List<Articulos> listarArticulos() {
        return articulosServiceImpl.listarArticulos();
    }

    @PostMapping("/articulos")
    public Articulos salvarEmpleado(@RequestBody Articulos articulos) {
        return articulosServiceImpl.guardarArticulos(articulos);
    }

    @GetMapping("/articulos/fabricante/{fabricante}")
    public List<Articulos> listarEmpleadosTrabajo(@PathVariable(name = "fabricante") Long id) {
        Fabricantes fabricante = new Fabricantes();

        fabricante.setId(id);

        return articulosServiceImpl.listarArticulosFabricantes(fabricante);
    }

    @GetMapping("/articulos/{id}")
    public Articulos empleadoXID(@PathVariable(name = "id") Long id, @RequestBody Articulos articulos) {
        Articulos articulos_xid = new Articulos();

        articulos_xid = articulosServiceImpl.articulosXID(id);

        return articulos_xid;
    }

    @PutMapping("/articulos/{id}")
    public Articulos actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Articulos articulos) {
        Articulos art_sel = new Articulos();
        Articulos art_act = new Articulos();

        art_sel = articulosServiceImpl.articulosXID(id);
        art_sel.setNombre(articulos.getNombre());
        art_act = articulosServiceImpl.actualizarArticulos(art_sel);

        return art_act;
    }

    @DeleteMapping("/articulos/{id}")
    public void eliminarEmpleado(@PathVariable(name = "id") Long id) {
        articulosServiceImpl.eliminarArticulos(id);
    }
}
