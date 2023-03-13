package br.conversor.com;

public class ConversorDeMoedas {
	public static double ConversorDeMoedas(double valor, Moeda origem, Moeda destino ) {
		return origem.getNumero() / destino.getNumero() * valor;
		
	}
	
}
