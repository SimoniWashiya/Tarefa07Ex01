package view;


import model.ControleAvaliacoes;
import model.Prova;
import model.Atividade;

public class Main {
    public static void main(String[] args) {
        ControleAvaliacoes controle = new ControleAvaliacoes();

        // Cadastrar prova
        controle.cadastrarProva(20);

        // Cadastrar atividade
        controle.cadastrarAtividade("Projeto Final", 10);

        // Consultar prova
        Prova prova = controle.consultarProva(0);
        if (prova != null) {
            System.out.println("Prova - Número de questões: " + prova.getNumeroQuestoes() + ", Média de notas: " + prova.getMediaNotas());
        }

        // Consultar atividade
        Atividade atividade = controle.consultarAtividade(0);
        if (atividade != null) {
            System.out.println("Atividade - Assunto: " + atividade.getAssunto() + ", Páginas: " + atividade.getPaginas());
        }

        // Limpar avaliações
        controle.limparAvaliacoes();
    }
}