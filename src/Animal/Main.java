package Animal;

public class Main {

    public static void main(String[] args) {

        //Camelo
        //Tubarão
        //Urso-do-Canadá
        //Iguana
        //Leão
        //Mico-leão-dourado

        Mamifero camelo = new Mamifero("Camelo",30,4,"Laranja","Deserto",10,"Comida");
        Peixe tubarao = new Peixe("Tubarão",30,0,"Cinza","Água",20,"Nada");
        Mamifero urso = new Mamifero("Urso-do-Canadá",30,4,"Marrom","Canadá",20,"Peixe");
        Animal iguana = new Animal("Iguana",10,4,"Verde","Folha",10);
        Mamifero leao = new Mamifero("Leão",20,4,"Laranja","Savana",25,"Você");
        Mamifero mico = new Mamifero("Mico-leão-dourado",10,4,"Dourado","Árvore",10,"Fruta");
    }
}
