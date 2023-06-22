package TributosBanco;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumConta("001");
        contaPoupanca.setSaldo(450);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumConta("002");
        contaCorrente.setSaldo(500);

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        seguroDeVida.setNumConta("003");
        seguroDeVida.setSaldo(630);

        contaPoupanca.leituraDados();
        contaPoupanca.tributos();
        contaPoupanca.leituraDados();

        System.out.println();
        System.out.println("-----");
        System.out.println();

        contaCorrente.leituraDados();
        contaCorrente.tributos();
        contaCorrente.leituraDados();

        System.out.println();
        System.out.println("-----");
        System.out.println();

        seguroDeVida.leituraDados();
        seguroDeVida.tributos();
        seguroDeVida.leituraDados();

    }
}
