package mx.com.twg;

import mx.com.twg.beans.Persona;

public class Main {

	public static void main(String... args){
		
		Persona bean = new Persona();
		bean.setNombre("Noe");
		bean.setEdad(26);
		bean.setTrabajo(true);
		
		System.out.println(bean.getNombre());
		System.out.println(bean.getEdad());
		System.out.println(bean.isTrabajo());
	}
}
