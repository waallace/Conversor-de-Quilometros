package br.quilometros.com;

public class Conversor {
	public static double conversorQuilomeros(double valor , QuilometrosQuadrados origem, QuilometrosQuadrados destino) {

		return valor * origem.getNumeros() / destino.getNumeros();
	
	}
	public static void main(String[] args) {
		System.out.println(conversorQuilomeros(2 , QuilometrosQuadrados.KM, QuilometrosQuadrados.M));
	}
}
