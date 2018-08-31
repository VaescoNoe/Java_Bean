package mx.com.twg.beans;

import java.io.Serializable;

//Un bean debe de tener...

// implementar Serializable
public class Persona implements Serializable{

	// Variables de tipo privado
	private String nombre;
	private int edad;
	private boolean trabajo;
	
	//Siempre se debe de declarar el constructos sin argumentos
	public Persona(){}
	
	//Costructor con argumentos no requerido (Opcional)
	public Persona(String nombre,int edad){
		this.nombre= nombre;
		this.edad=edad;
	}

	// Uso de los métodos Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isTrabajo() {
		return trabajo;
	}

	public void setTrabajo(boolean trabajo) {
		this.trabajo = trabajo;
	}
	
	
	
}
