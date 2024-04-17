package model;

public class Prova {
    private int numeroQuestoes;
    private double mediaNotas;

    public Prova(int numeroQuestoes, double mediaNotas) {
        this.numeroQuestoes = numeroQuestoes;
        this.mediaNotas = mediaNotas;
    }

    public int getNumeroQuestoes() {
        return numeroQuestoes;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }
}