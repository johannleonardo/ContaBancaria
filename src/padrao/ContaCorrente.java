package padrao;

import padrao.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
	
	private int qtdTransacoes;
	

	public int getQtdTransacoes() {
		return qtdTransacoes;
	}

	public void setQtdTransacoes(int qtdTransacoes) {
		this.qtdTransacoes = qtdTransacoes;
	}

	public ContaCorrente(String senha) {
		super(senha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()-valor);
		qtdTransacoes++;
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()+valor);
		qtdTransacoes++;
	}

	@Override
	public void tiraExtrato() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		qtdTransacoes++;
	}

	@Override
	public String toString() {
		return "ContaCorrente [qtdTransacoes=" + qtdTransacoes + ", toString()=" + super.toString() + "]";
	}

	
	
}
