package TributosBanco;

public class ContaCorrente extends Dados implements CalculoTributos{
    @Override
    public void tributos() {
        double taxa = 1;
        double tributo = (getSaldo() * taxa) / 100;
        setSaldo(getSaldo() - tributo);
        System.out.print("A taxa da sua conta é de 1%. ");
        System.out.printf("Totalizando tributos de: R$ %,.2f%n", tributo);
    }
}
