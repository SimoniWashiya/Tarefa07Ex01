package Controller;

public class ControleAvaliacoes {
    private Avaliacao<Prova> provas = new Avaliacao<>();
    private Avaliacao<Atividade> atividades = new Avaliacao<>();
    private Random random = new Random();

    public void cadastrarProva(int numeroQuestoes) {
        Prova prova = new Prova(numeroQuestoes, random.nextDouble() * 10);
        provas.cadastrarAtividade(prova);
    }

    public void cadastrarAtividade(String assunto, int paginas) {
        Atividade atividade = new Atividade(assunto, paginas);
        atividades.cadastrarAtividade(atividade);
    }

    public Prova consultarProva(int posicao) {
        return provas.consultarAtividade(posicao);
    }

    public Atividade consultarAtividade(int posicao) {
        return atividades.consultarAtividade(posicao);
    }

    public void limparAvaliacoes() {
        provas.limparAtividades();
        atividades.limparAtividades();
    }
}