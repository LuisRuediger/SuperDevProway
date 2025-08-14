public class Produto {

    // Atributos
    private int codigo;
    private Double valor;
    private String nome;
    private int quantidade;
    private boolean status;


    // Construtores
    public Produto () {

    }

    public Produto (double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }


    // Métodos Get / Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}