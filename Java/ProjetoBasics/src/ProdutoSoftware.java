public class ProdutoSoftware extends Produto {

    private int tamanho;
    private String versao;

    public ProdutoSoftware () {
        super();
    }

    // Exigindo somente valores do construtor da classe mão
    public ProdutoSoftware (String nome, Double valor) {
        super(nome, valor);
    }

    // Exigindo valor tanto de atributo da classe mãe quanto da própria classe
    public ProdutoSoftware (String nome, String versao) {
        super(nome);
        this.versao = versao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
