package com.cenfotec.estrategia.mundo.animales;

import com.cenfotec.estrategia.mundo.conductas.IMovimiento;

public class Aguila implements IMovimiento {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void mover() {
		System.out.println("Estoy volando.");
	}
}
