import java.time.LocalDate;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private String agencia;
    private LocalDate dataAbertura;
    private double saldo;
    private double limiteChequeEspecial;

    public ContaBancaria(String titular, String numeroConta, String agencia, double saldoInicial, double limiteChequeEspecial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.dataAbertura = LocalDate.now();
        this.saldo = Math.max(saldoInicial, 0);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }

    }

    public void sacar(double valor) {

        if (valor > 0 && valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }

    }

    public void exibirSaldo() {

        System.out.println("Titular: " + titular +
                " | Conta: " + numeroConta +
                " | Agência: " + agencia +
                " | Saldo Atual: R$" + saldo +
                " | Limite Cheque Especial: R$" + limiteChequeEspecial +
                " | Data de Abertura: " + dataAbertura);

    }

    public void transferir(ContaBancaria destino, double valor) {

        if (valor > 0 && valor <= saldo + limiteChequeEspecial) {

            this.saldo -= valor;
            destino.saldo += valor;

            System.out.println("Transferência de R$" + valor + " realizada para " + destino.titular);

        } else {

            System.out.println("Transferência não realizada. Saldo insuficiente.");

        }

    }

}
