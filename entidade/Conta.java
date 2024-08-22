package entidade;

public class Conta {
    protected String titular;
    protected double saldo;
    protected String corCartao;

    public Conta(String titular, double saldo, String corCartao) {
        this.titular = titular;
        this.saldo = saldo;
        this.corCartao = corCartao;
    }

    public void exibirDetalhes() {
        System.out.println("Conta:");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Cor do Cartão: " + corCartao);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
