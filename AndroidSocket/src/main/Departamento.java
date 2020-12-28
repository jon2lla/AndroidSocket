package main;


import java.io.Serializable;

public class Departamento implements Serializable {
	
	private int numDept;
	private String nombre;
	private String localidad;
	
	
	public Departamento() {	}
	
	
	public Departamento(int numDept, String nombre, String localidad) {
		this.numDept = numDept;
		this.nombre = nombre;
		this.localidad = localidad;
	}


	public int getNumDept() {
		return numDept;
	}


	public void setNumDept(int numDept) {
		this.numDept = numDept;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
}

