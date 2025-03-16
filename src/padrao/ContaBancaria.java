package padrao;

import java.util.Scanner;

public abstract class ContaBancaria{
	private String senha;
	private int numero;
	private double saldo;
	
	public ContaBancaria(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void saca(double valor);
	public abstract void deposita(double valor);
	public abstract void tiraExtrato();
	
	
	
	@Override
	public String toString() {
		return "ContaBancaria [senha=" + senha + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	public void alteraSenha(String senhaNova) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a senha antiga: ");
		String senhaAntiga = s.next();

		if(senhaAntiga == senhaNova) {
			this.senha = senhaNova;
			System.out.println("Senha alterada com sucesso!");
		}else {
			System.out.println("Senha não alterada!");
		}
		s.close();
}
}
