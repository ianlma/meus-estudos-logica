public class Main {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Ian", "12345-6", "0001", 1000.0, 500.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", "98765-4", "0001", 500.0, 300.0);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta1.depositar(200);
        conta1.sacar(1500);
        conta1.transferir(conta2, 300);

        conta2.depositar(400);
        conta2.sacar(500);
        conta2.transferir(conta1, 300);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

    }

}
