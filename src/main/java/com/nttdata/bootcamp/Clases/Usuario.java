package com.nttdata.bootcamp.Clases;

public class Usuario {
	
	private String nombre;
	private String fechaNac;
	private String gmail;
	private String sexo;
	
	public Usuario(String nombre, String fechaNac, String gmail, String sexo) {
		this.nombre=nombre;
		this.fechaNac=fechaNac;
		this.gmail=gmail;
		this.sexo=sexo;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNac=" + fechaNac + ", gmail=" + gmail + ", sexo=" + sexo + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
