package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	@Autowired
    private IEmpleadoDAO iEmpleadoDAO;

    @Override
    public List<Empleado> listarEmpleados() {
        return iEmpleadoDAO.findAll();
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Integer id) {
    	return iEmpleadoDAO.findById(id).get();
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
    	
    	if (empleado.getTrabajo() != null) {
            switch (empleado.getTrabajo()) {
                case Carpintero:
                    empleado.setSalario(20000);
                    break;
                case Paleta:
                    empleado.setSalario(25000);
                    break;
                case Programador:
                    empleado.setSalario(35000);
                    break;
                case Profesor:
                    empleado.setSalario(40000);
                    break;
                default:
                    throw new IllegalArgumentException("Trabajo no reconocido: " + empleado.getTrabajo());
            }
        }
    	
        return iEmpleadoDAO.save(empleado);
    };


    @Override
    public Empleado actualizarEmpleado(Empleado empleado) {
    	return iEmpleadoDAO.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Integer id) {
    	iEmpleadoDAO.deleteById(id);
    }
}
