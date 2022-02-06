package models;

public class Pajaro extends Abstract_Animal {
	private String especie;

	public Pajaro(String nombre, String color, String raza, double peso, double altura) {
		super(nombre, color, peso, altura);
		this.especie = raza;
	}

	public String getRaza() {
		return especie;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", color: " + getColor() + ", especie: " + especie + ", peso: " + getPeso()
				+ ", altura: " + getAltura();
	}
}