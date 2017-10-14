package com.cenfotec.estrategia.mundo.animales;

import com.cenfotec.estrategia.mundo.conductas.IMovimiento;

public class Pato implements IMovimiento{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void mover() {
		System.out.println("Nadando.");
	}
}
