package entidade;

import entidade.Conta;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String titular, double saldo, String corCartao) {
		        super(titular, saldo, corCartao);

	}

	public void exibirDetalhes() {
		System.out.println("Conta Poupança:");
        super.exibirDetalhes();
		
	}

}
