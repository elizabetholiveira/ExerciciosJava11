package Dicionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Dicionario d1 = new Dicionario();

        List<String> l1 = new ArrayList<>();
        l1.add("azul");

        List<String> l2 = new ArrayList<>();
        l2.add("amarela");

        List<String> l3 = new ArrayList<>();
        l3.add("rosa");


        d1.getValores().put("bola",l1);
        d1.getValores().put("boneca",l2);
        d1.getValores().put("dado",l3);

        for (String chave : d1.getValores().keySet()) {
            List<String> valor = d1.getValores().get(chave);
            System.out.println(chave + " -> " + valor);
        }
    }
}
