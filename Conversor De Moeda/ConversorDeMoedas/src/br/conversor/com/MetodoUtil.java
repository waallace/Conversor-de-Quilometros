package br.conversor.com;

import java.text.NumberFormat;
import java.util.Currency;

public class MetodoUtil {
	public static String metodoUtil(double Moeda , String nome) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setCurrency(Currency.getInstance(nome));
		return nf.format(Moeda);
		
	}
}
