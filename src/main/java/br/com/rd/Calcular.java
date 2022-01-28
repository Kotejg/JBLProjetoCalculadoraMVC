package br.com.rd;

public class Calcular {
	private Integer valor1;
	private Integer valor2;
	
	
	
	public Calcular(Integer valor1, Integer valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2; 
	}
	
	
	public int somar() {
		return (this.valor1 + this.valor2);
	}
	
	public int subtrair() {
		return (this.valor1 - this.valor2);
	}
	
	public int multiplicar() {
		return (this.valor1 * this.valor2);
	}
	
	public int dividir() {
		return (this.valor1 / this.valor2);
	}
	
}
