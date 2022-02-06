package models;

public class Reptil extends Abstract_Animal {
	private String especie;

	public Reptil(String nombre, String color, String raza, double peso, double altura) {
		super(nombre, color, peso, altura);
		this.especie = raza;
	}

	public String getRaza() {
		return especie;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", color: " + getColor() + ", especies: " + especie + ", peso: " + getPeso()
				+ ", altura: " + getAltura();
	}
}
