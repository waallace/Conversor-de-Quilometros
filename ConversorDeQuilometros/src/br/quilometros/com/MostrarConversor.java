package br.quilometros.com;

public class MostrarConversor {
	public static void main(String[] args) {
		double conversor = Conversor.conversorQuilomeros(1, QuilometrosQuadrados.KM, QuilometrosQuadrados.M);
		System.out.println(conversor);
	}
}
