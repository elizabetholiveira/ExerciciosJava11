package ContaBancaria;

public abstract class ContaBancaria {

    private String nomeCliente;

    private int numConta;
    private double saldo;

    void conferirSaldo(){
        System.out.printf("Seu saldo é de: R$ %,.2f%n", saldo);
    }

    void sacar(double quantiaASacar){
        if(saldo > quantiaASacar){
            saldo -= quantiaASacar;
            conferirSaldo();
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void depositar(double quantiaADepositar){
        saldo += quantiaADepositar;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
