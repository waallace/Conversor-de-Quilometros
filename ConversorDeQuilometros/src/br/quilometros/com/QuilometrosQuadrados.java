package br.quilometros.com;

public class QuilometrosQuadrados {
	
	private String nomeCompleto;
	private String nome;
	private double numeros;
	
	
	
	public QuilometrosQuadrados(String nomeCompleto, String nome, double numeros) {
		
		this.nomeCompleto = nomeCompleto;
		this.nome = nome;
		this.numeros = numeros;
		
			
	}
	
	
	public static QuilometrosQuadrados KM = new QuilometrosQuadrados("Quilometros", "KM", 1000 );
	public static QuilometrosQuadrados M = new QuilometrosQuadrados("Metros", "M", 1 );
	public static QuilometrosQuadrados[] quilometrosAMostra = new QuilometrosQuadrados[] {KM , M};
	

	public String getNomeCompleto() {
		return nomeCompleto;
	}



	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNumeros() {
		return numeros;
	}
	
	public void setNumeros(double numeros) {
		this.numeros = numeros;
	}

}


