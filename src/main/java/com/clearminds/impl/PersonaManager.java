package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	ServicioPersona serv;

	public PersonaManager() {
		super();
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	
}
