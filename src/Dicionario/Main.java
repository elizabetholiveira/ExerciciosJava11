package Dicionario;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //Não faço ideia de como dividir isso em duas classes. Tudo que tentei, deu erro.
        HashMap<String, String> dicionario = new HashMap<>();
        dicionario.put("bola","azul");
        dicionario.put("boneca","amarela");
        dicionario.put("dado","rosa");

        //Não faço ideia de como fazer isso funcionar.
//        for (int i:dicionario.size()) {
//            System.out.println(dicionario.containsKey(i) + " -> " + dicionario.containsValue(i));
//        }
    }
}
