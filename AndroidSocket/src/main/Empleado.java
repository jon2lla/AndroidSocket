package main;

import java.io.Serializable;
import java.util.Date;

public class Empleado implements Serializable{
	/**
	 * 
	 */
	private int numEmp;
	private String apellido;
	private String oficio;
	private int dir;
	private Date fechaAlta;
	private float salario;
	private float comision;
	private int numDept;
	private String departamento;
	
	
	public Empleado() {	}


	public Empleado(int numEmp, String apellido, String oficio, int dir, Date fechaAlta, float salario, float comision, int numDept) {
		super();
		this.numEmp = numEmp;
		this.apellido = apellido;
		this.oficio = oficio;
		this.dir = dir;
		this.fechaAlta = fechaAlta;
		this.salario = salario;
		this.comision = comision;
		this.numDept = numDept;
	}


	public int getNumEmp() {
		return numEmp;
	}


	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getOficio() {
		return oficio;
	}


	public void setOficio(String oficio) {
		this.oficio = oficio;
	}


	public int getDir() {
		return dir;
	}


	public void setDir(int dir) {
		this.dir = dir;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public float getComision() {
		return comision;
	}


	public void setComision(float comision) {
		this.comision = comision;
	}


	public int getNumDept() {
		return numDept;
	}


	public void setNumDept(int numDept) {
		this.numDept = numDept;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
