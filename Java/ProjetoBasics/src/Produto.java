public class Produto {

    // Atributos

    private int codigo;
    private Double valor;
    private String nome;
    private boolean status;
    private String marca;
    private String categoria;


    // Construtores

    // Vazio
    public Produto () {
    }

    // Exigindo somente valor inicial para o atributo 'nome'
    public Produto (String nome) {
        this.nome = nome;
    }

    // Exigindo valor inicial para os atributos 'nome' e 'valor'
    public Produto (String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}