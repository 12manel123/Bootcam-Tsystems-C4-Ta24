package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleado")
public class Empleado {
    public enum Trabajo {
    	Carpintero,
    	Paleta,
    	Programador,
    	Profesor
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    @Enumerated(EnumType.STRING)
    private Trabajo trabajo;
    private int salario;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, Trabajo trabajo, int salario) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.trabajo = trabajo;
        this.salario = salario;
    }
    // Getter y setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", trabajo=" + trabajo
				+ ", salario=" + salario + "]";
	}
	
    
    
}


