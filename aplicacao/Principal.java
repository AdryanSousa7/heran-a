package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.ContaComercial;
import entidade.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        Scanner adr = new Scanner(System.in);

        int tipoConta = 0;
        while (tipoConta != 1 && tipoConta != 2) {
            System.out.println("Escolha o tipo de conta (1 para Poupança, 2 para Comercial): ");
            tipoConta = adr.nextInt();
            if (tipoConta != 1 && tipoConta != 2) {
                System.out.println("Tipo de conta inválido. Por favor, escolha 1 ou 2.");
            }
        }

        adr.nextLine();

        System.out.println("Digite o nome do titular: ");
        String titular = adr.nextLine();

        double saldo = -1;
        while (saldo < 0) {
            System.out.println("Digite o saldo inicial: ");
            saldo = adr.nextDouble();
            if (saldo < 0) {
                System.out.println("Saldo não pode ser negativo. Digite novamente.");
            }
        }

        adr.nextLine();
        List<String> coresValidas = new ArrayList<>();
        coresValidas.add("rosa");
        coresValidas.add("preto");
        coresValidas.add("vermelho");

        String corCartao = "";
        boolean corValida = false;
        while (!corValida) {
            System.out.println("Escolha a cor do cartão (rosa, preto, vermelho): ");
            corCartao = adr.nextLine();
            if (coresValidas.contains(corCartao.toLowerCase())) {
                corValida = true;
            } else {
                System.out.println("Cor inválida. Por favor, escolha entre rosa, preto ou vermelho.");
            }
        }

        if (tipoConta == 1) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(titular, saldo, corCartao);
            contaPoupanca.exibirDetalhes();
        } else if (tipoConta == 2) {
            double limiteDeCredito = -1;
            while (limiteDeCredito < 0) {
                System.out.println("Digite o limite de crédito: ");
                limiteDeCredito = adr.nextDouble();
                if (limiteDeCredito < 0) {
                    System.out.println("Limite de crédito não pode ser negativo. Digite novamente.");
                }
            }

            ContaComercial contaComercial = new ContaComercial(titular, saldo, corCartao, limiteDeCredito);
            contaComercial.exibirDetalhes();
        }

        adr.close();
    }
}