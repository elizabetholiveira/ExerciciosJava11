package ContaBancaria;

public class Main {

    public static void main(String[] args) {

        //Criar contas:

        //Conta normal:
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumConta("001");
        conta1.setNomeCliente("João");
        conta1.setSaldo(500);
        //Conta especial:
        ContaEspecial conta2 = new ContaEspecial();
        conta2.setNumConta("002");
        conta2.setNomeCliente("Maria");
        conta2.setSaldo(600);
        conta2.setLimite(200);
        //Conta poupança:
        ContaPoupanca conta3 = new ContaPoupanca();
        conta3.setNumConta("003");
        conta3.setNomeCliente("Júlia");
        conta3.setSaldo(450);

        //Sacar um valor das contas:

        //Conta normal:
        conta1.sacar(450);
        //Conta especial:
        conta2.sacar(700);

        //Depositar:

        conta1.depositar(200);

        //Mostrar um novo saldo a partir de um rendimento:

        conta3.calcularNovoSaldo(5);

        //Mostrar dados da conta do cliente:

        System.out.println("Número da conta: " + conta2.getNumConta());
        System.out.println("Nome do cliente: " + conta2.getNomeCliente());
        System.out.printf("Saldo: R$ %,.2f%n", conta2.getSaldo());
        System.out.printf("Limite: R$ %,.2f%n", conta2.getLimite());
    }
}
