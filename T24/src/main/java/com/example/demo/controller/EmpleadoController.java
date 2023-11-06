package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.Empleado;
import com.example.demo.services.EmpleadoServiceImpl;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoServiceImpl empleadoService;
    //private IEmpleadoService empleadoService;

    // Listar todos los empleados
    @GetMapping("/listar")
    public List<Empleado> listarEmpleados() {
        return empleadoService.listarEmpleados();
    }

    // Obtener un empleado por su ID
    @GetMapping("/{id}")
    public Empleado obtenerEmpleadoPorId(@PathVariable Integer id) {
        return empleadoService.obtenerEmpleadoPorId(id);
    }

    // Crear un nuevo empleado
    @PostMapping("/crear")
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.guardarEmpleado(empleado);
    }

    // Actualizar un empleado existente
    @PutMapping("/{id}")
    public Empleado actualizarEmpleado(@PathVariable Integer id, @RequestBody Empleado empleado) {
        empleado.setId(id);
        return empleadoService.actualizarEmpleado(empleado);
    }

    // Eliminar un empleado por su ID
    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Integer id) {
        empleadoService.eliminarEmpleado(id);
    }
}
