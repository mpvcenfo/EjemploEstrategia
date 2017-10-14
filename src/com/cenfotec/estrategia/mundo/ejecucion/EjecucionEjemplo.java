package com.cenfotec.estrategia.mundo.ejecucion;

import java.util.ArrayList;

import com.cenfotec.estrategia.mundo.animales.Aguila;
import com.cenfotec.estrategia.mundo.animales.Pato;
import com.cenfotec.estrategia.mundo.animales.Perro;
import com.cenfotec.estrategia.mundo.conductas.IMovimiento;

public class EjecucionEjemplo {

	public static void main(String[] args) {
		ArrayList<IMovimiento> animalitos = new ArrayList<IMovimiento>();
		
		animalitos.add(new Pato());
		animalitos.add(new Perro());
		animalitos.add(new Aguila());
		
		animalitos.add(new Pato());
		animalitos.add(new Perro());
		animalitos.add(new Aguila());
		
		moverAnimalitos(animalitos);
	}

	private static void moverAnimalitos(ArrayList<IMovimiento> animalitos) {
		for(IMovimiento animalActual: animalitos) {
			animalActual.mover();
		}
	}
}
