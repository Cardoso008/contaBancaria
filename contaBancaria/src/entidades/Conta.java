package entidades;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		aumentarSaldo(depositoInicial);
	}
	
	public Conta( int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public Conta(String titular) {
		this.titular = titular;
	}
	
	public Conta() {
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void aumentarSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void diminuirSaldo(double saldo) {
		this.saldo -= saldo + 5;
	}
	
	public String toString() {
		return "Numero: " + numero + ", Titular: " + titular + ", Saldo: " + saldo;
	}
}
