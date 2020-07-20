package entities;

public class Conta {
	
	private int nConta;
	private String nome;
	private double valorIncial;
	
	
	public Conta(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
	}
	public Conta(int nConta, String nome, double valorIncial) {
		this.nConta = nConta;
		this.nome = nome;
		this.valorIncial = valorIncial;
	}
	public double getNConta() {
		return nConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorIncial() {
		return valorIncial;
	}
	
	public void deposito (double saldo) {
		valorIncial += saldo;
	}
	public void saque (double saldo) {
		valorIncial -= saldo + 5;
	}
	
	public String toString() {
		return "Conta: "
				+ nConta
				+ ", Nome: "
				+ nome
				+ ", saldo: $"
				+ String.format("%.2f", valorIncial);
		
	}
}
