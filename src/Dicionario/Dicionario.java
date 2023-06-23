package Dicionario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dicionario {

    private Map<String, List<String>> valores = new HashMap<>();

    public Map<String, List<String>> getValores() {
        return valores;
    }

    public void setValores(Map<String, List<String>> valores) {
        this.valores = valores;
    }
}
