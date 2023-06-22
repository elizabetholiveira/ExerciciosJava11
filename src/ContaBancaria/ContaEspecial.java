package ContaBancaria;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    @Override
    void sacar(double quantiaASacar) {
        if ((getSaldo() + limite) > quantiaASacar) {
            setSaldo(getSaldo() - quantiaASacar);
            limite += getSaldo();
            conferirSaldo();
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}
