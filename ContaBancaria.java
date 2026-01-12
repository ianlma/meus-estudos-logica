public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo Atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ian", 1000.0);
        conta.exibirSaldo();
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();
    }
}
