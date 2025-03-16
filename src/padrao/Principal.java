package padrao;

import java.util.Scanner;

import padrao.ContaBancaria;
import padrao.ContaCorrente;
import padrao.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int qtdContas = 0;
		
		while(qtdContas <= 0){
			System.out.println("Quantas contas serão criadas?");
			qtdContas = Integer.parseInt(s.nextLine());
		}
		
		ContaBancaria[] contas = new ContaBancaria[qtdContas];
		
		for(int i=0; i<qtdContas; i++) {
			System.out.println("Digite 1 para Conta Corrente ou qualquer outro número para Conta Poupança: ");
			if(Integer.parseInt(s.nextLine()) == 1) {
				contas[i] = new ContaCorrente("123456");
			}else {
				contas[i] = new ContaPoupanca("123456");
			}
		}
		
		for(ContaBancaria cb: contas) {
			cb.setNumero((int)(Math.random()*10000+1));
		}
		
		for(ContaBancaria cb: contas) {
			if(cb instanceof ContaPoupanca) {
				((ContaPoupanca) cb).setTaxaRendimento(Math.random());
			}
		}
		
		for(ContaBancaria cb: contas) {
			cb.deposita(Math.random()*500);
			cb.deposita(Math.random()*100);
			cb.tiraExtrato();
		}
		
		for(ContaBancaria cb: contas) {
			if(cb instanceof ContaPoupanca) {
				System.out.println("Taxa de rendimento da poupança: "+cb.getNumero()+((ContaPoupanca) cb).getTaxaRendimento());
			}else if(cb instanceof ContaCorrente) {
				System.out.println("Quantidade de transações da conta corrente"+cb.getNumero()+": "+((ContaCorrente) cb).getQtdTransacoes());
			}
				
		}
		
		Rentavel[] rentaveis = new Rentavel[(int)Math.random()*10+1];
		for(int i=0; i<rentaveis.length; i++) {
			if(Math.random() < 0.5) {
				rentaveis[i] = new ContaPoupanca("123456");
			}else {
				rentaveis[i] = new TesouroDireto(0);
			}
		}
		
		for(Rentavel r: rentaveis) {
			System.out.println(r.calculaRendimento());
		}
		
		s.close();

	}
}