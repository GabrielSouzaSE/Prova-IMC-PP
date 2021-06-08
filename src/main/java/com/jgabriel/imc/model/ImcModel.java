package com.jgabriel.imc.model;

import java.text.DecimalFormat;

public class ImcModel {

	private double peso;
	private double altura;
	private String retorno;
	private double calculoimc;

	public double Peso() {

		return peso;
	}

	public double Altura() {

		return altura;
	}

	public ImcModel(double peso, double altura) {

		this.calculoimc = peso / (altura * altura);
	}

	public String Retorno() {

		DecimalFormat df = new DecimalFormat("#.00");

		if (calculoimc < 18.5) {

			this.retorno = "IMC: " + df.format(calculoimc) + ".\n" + "Classificação: Abaixo do peso.\nRisco: Elevado.";

		} else if (calculoimc >= 18.50 && calculoimc < 24.99) {

			this.retorno = "IMC: " + df.format(calculoimc) + ".\n" + "Classificação: Peso ideal.\nRisco: Inexistente.";

		} else if (calculoimc >= 25.00 && calculoimc <= 29.99) {

			this.retorno = "IMC: " + df.format(calculoimc) + ".\n" + "Classificação: Excesso de Peso.\nRisco: Elevado.";

		} else if (calculoimc >= 30.00 && calculoimc <= 34.99) {

			this.retorno = "IMC: " + df.format(calculoimc) + ".\n"
					+ "Classificação: Obesidade Grau 1.\nRisco: Muito Elevado.";

		} else if (calculoimc >= 35.00 && calculoimc <= 39.99) {

			this.retorno = "IMC: " + df.format(calculoimc) + ".\n"
					+ "Classificação: Obseidade Grau 2.\nRisco: Muitíssimo Elevado.";

		} else if (calculoimc >= 40) {

			this.retorno = "IMC: " + df.format(calculoimc) + ".\n"
					+ "Classificação: Obesidade Grau 3.\nRisco: Obesidade Mórbida.";

		}

		return retorno;
	}

}
