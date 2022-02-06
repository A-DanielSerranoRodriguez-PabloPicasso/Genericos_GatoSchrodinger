package models;

public class Perro extends Abstract_Animal {
	private String raza;

	public Perro(String nombre, String color, String raza, double peso, double altura) {
		super(nombre, color, peso, altura);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", color: " + getColor() + ", raza: " + raza + ", peso: " + getPeso()
				+ ", altura: " + getAltura();
	}
}
