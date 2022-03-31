public class Main {

    public static void main(String[] args) {
        Cliente rhaniel = new Cliente();
            rhaniel.setNome("Rhaniel");

        Conta cc = new ContaCorrente(rhaniel);
        Conta poupanca = new ContaPoupanca(rhaniel);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
