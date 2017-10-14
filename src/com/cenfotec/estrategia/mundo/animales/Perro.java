package com.cenfotec.estrategia.mundo.animales;

import com.cenfotec.estrategia.mundo.conductas.IMovimiento;

public class Perro implements IMovimiento {
	private String raza;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void mover() {
		System.out.println("Estoy caminando.");
	}
}
