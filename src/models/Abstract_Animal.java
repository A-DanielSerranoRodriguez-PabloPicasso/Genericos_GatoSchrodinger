package models;

public abstract class Abstract_Animal {
	private String nombre, color;
	private double peso, altura;

	protected Abstract_Animal(String nombre, String color, double peso, double altura) {
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.altura = altura;
	};

	protected String getNombre() {
		return nombre;
	}

	protected String getColor() {
		return color;
	}

	protected double getPeso() {
		return peso;
	}

	protected double getAltura() {
		return altura;
	}
}
