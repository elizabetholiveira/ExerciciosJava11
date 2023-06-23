package Animal;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }
}
