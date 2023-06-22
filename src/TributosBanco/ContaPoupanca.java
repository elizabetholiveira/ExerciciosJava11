package TributosBanco;

public class ContaPoupanca extends Dados implements CalculoTributos{

    @Override
    public void tributos() {
        System.out.println("Esse tipo de conta não é tributável");
    }
}
