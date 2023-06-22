package ContaBancaria;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    @Override
    void sacar(double quantiaASacar) {
        if (getSaldo() > quantiaASacar) {
            setSaldo(getSaldo() - quantiaASacar);
            conferirSaldo();
        } else if (limite > quantiaASacar){

        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
