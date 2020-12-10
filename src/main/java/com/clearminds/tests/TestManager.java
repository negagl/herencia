package com.clearminds.tests;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Nega", "Garcia", "1234");
		PersonaManager pm = new PersonaManager();
		pm.insertarPersona(p1);
		
	}

}
