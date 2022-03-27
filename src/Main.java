public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Eric");
        Cliente cliente2 = new Cliente("Joao");
        Cliente cliente3 = new Cliente("Pietro");
        Cliente cliente4 = new Cliente("Ian");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta cp1 = new ContaPoupanca(cliente2);
        Conta cc2 = new ContaCorrente(cliente3);
        Conta cp2 = new ContaPoupanca(cliente4);

        banco.addConta(cc1);
        banco.addConta(cc2);
        banco.addConta(cp1);
        banco.addConta(cp2);

        cc1.depositar(100);
        cc1.transferir(100, cp2);

        banco.imprimirListaContas();
    }
}
