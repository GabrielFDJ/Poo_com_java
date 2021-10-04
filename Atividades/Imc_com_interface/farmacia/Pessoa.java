package Imc_com_interface.farmacia;

public class Pessoa {
	private double peso;
	private double altura;
	
	public Pessoa(double peso , double altura) {
		this.altura = altura;
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	private double calcularIMC() {
		double imc=(this.getPeso()/Math.pow(this.getAltura(),2));
		return imc;
	}
	
	public String getIMC() {
		double imc=this.calcularIMC();
		if(imc<=25) {
			return "Normal";
		}
		else if(imc>=30) {
			return "Obesidade";
		}
		else {
			return "Sobrepeso";
		}
	}
}

