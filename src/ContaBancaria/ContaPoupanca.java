package ContaBancaria;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;


    void calcularNovoSaldo(double taxaDeRendimento){
        double rendimento = (getSaldo() * taxaDeRendimento) / 100;
        System.out.print("Seu dinheiro rendeu " + taxaDeRendimento + "%. ");
        System.out.printf("Que é equivalente a: R$ %,.2f%n", rendimento);
        setSaldo(getSaldo() + rendimento);
        conferirSaldo();
    }
}
