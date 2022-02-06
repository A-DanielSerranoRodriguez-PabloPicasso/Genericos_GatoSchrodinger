package mainApp;

import generics.Caja_Shrodinger;
import models.Abstract_Animal;
import models.Gato;
import models.Pajaro;
import models.Perro;
import models.Reptil;

public class MainApp {
	public static void main(String[] args) {
		Caja_Shrodinger<Abstract_Animal> caja = new Caja_Shrodinger<Abstract_Animal>();

		reiniciarCaja(caja);

		for (int i = 0; i < 10; i++) {
			System.out.println("Comienzo de prueba Nº" + (i + 1) + "\n");
			for (int j = 0; j < caja.size(); j++) {
				if (caja.observar(j) == null) {
					caja.matarAnimal(j);
				}
			}
			caja.mostrarAnimal();
			reiniciarCaja(caja);
			System.out.println("\n");
		}

	}

	private static void reiniciarCaja(Caja_Shrodinger<Abstract_Animal> caja) {
		caja.clear();

		Gato gat1 = new Gato("Gato1", "Negro", "Siames", 1.1, 2.2);
		Gato gat2 = new Gato("Gato2", "Blanco", "Persa", 3.3, 4.4);
		Pajaro paj1 = new Pajaro("Pajaro1", "Rojo", "Canario", 5.5, 6.6);
		Pajaro paj2 = new Pajaro("Pajaro2", "Azul", "Agaporni", 7.7, 8.8);
		Perro per1 = new Perro("Perro1", "Dorado", "Pointer", 9.9, 10.10);
		Perro per2 = new Perro("Perro2", "Marron", "Beagle", 11.11, 12.12);
		Reptil rep1 = new Reptil("Reptil1", "Gris", "Dragon de comodo", 13.13, 14.14);
		Reptil rep2 = new Reptil("Reptil2", "Naranja", "Iguana", 15.15, 16.16);

		caja.meterAnimal(gat1);
		caja.meterAnimal(gat2);
		caja.meterAnimal(paj1);
		caja.meterAnimal(paj2);
		caja.meterAnimal(per1);
		caja.meterAnimal(per2);
		caja.meterAnimal(rep1);
		caja.meterAnimal(rep2);
	}
}
