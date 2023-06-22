package TributosBanco;

public class SeguroDeVida extends Dados implements CalculoTributos{


    @Override
    public void tributos() {
        double taxa = 42;
        System.out.println("Sua conta possui uma taxa fixa de 42 reais");
        setSaldo(getSaldo() - taxa);
    }
}
