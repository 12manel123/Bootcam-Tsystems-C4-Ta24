package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado,Integer>{

}
