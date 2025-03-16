package padrao;

import padrao.ContaBancaria;

public class ContaPoupanca extends ContaBancaria implements Rentavel{
	public ContaPoupanca(String senha) {
		super(senha);
		// TODO Auto-generated constructor stub
	}

	private double taxaRendimento;

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}


	@Override
	public String toString() {
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()-valor);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()+valor);
	}

	@Override
	public void tiraExtrato() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

	@Override
	public double calculaRendimento() {
		// TODO Auto-generated method stub
		return super.getSaldo() * this.taxaRendimento;
	}
	
}
