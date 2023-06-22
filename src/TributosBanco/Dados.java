package TributosBanco;

public class Dados {

    private double saldo;
    private String numConta;

    public void leituraDados() {
        System.out.println("Número da conta: " + getNumConta());
        System.out.printf("Saldo da conta: R$ %,.2f%n", getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
}
