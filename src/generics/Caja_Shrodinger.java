package generics;

import java.util.LinkedList;

public class Caja_Shrodinger<Abstract_Animal> {
	private LinkedList<Abstract_Animal> caja;

	public Caja_Shrodinger() {
		this.caja = new LinkedList<Abstract_Animal>();
	}

	public int size() {
		return caja.size();
	}

	public void clear() {
		caja.clear();
	}

	public LinkedList<Abstract_Animal> getCaja() {
		return caja;
	}

	public Abstract_Animal getAnimal(int posicion) {
		return caja.get(posicion);
	}

	public void meterAnimal(Abstract_Animal animal) {
		caja.add(animal);
	}

	public void matarAnimal(int posicion) {
		caja.set(posicion, null);
	}

	public void mostrarAnimal() {
		for (Abstract_Animal animal : caja) {
			if (animal != null)
				System.out.println(animal);
		}
	}

	public Abstract_Animal observar(int posicion) {
		if ((int) (Math.random() * 2) == 0)
			return caja.get(posicion);
		else
			return null;
	}
}
