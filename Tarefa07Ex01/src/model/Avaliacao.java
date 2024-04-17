package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Avaliacao<T> {
    private List<T> atividades = new ArrayList<>();

    public void cadastrarAtividade(T atividade) {
        atividades.add(atividade);
    }

    public T consultarAtividade(int posicao) {
        if (posicao >= 0 && posicao < atividades.size()) {
            return atividades.get(posicao);
        } else {
            return null;
        }
    }

    public void limparAtividades() {
        atividades.clear();
    }
}
