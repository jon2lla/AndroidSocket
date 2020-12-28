package main;

import java.io.Serializable;

public class Datos implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idConexion;
    private String identificador;
    private String contenido;
    private String consulta;
    private int tipoConsulta;
    private Object objeto;

    public Datos() {}

    

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getIdConexion() {
		return idConexion;
	}

	public void setIdConexion(String idConexion) {
		this.idConexion = idConexion;
	}

	public int getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(int tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public static long getSerialversionuid() {
        return serialVersionUID;
    }

}