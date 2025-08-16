import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> listaProduto;

    // Cria um contador para sequencia de código
    int sequenciaCodigos = 1;

    // Construtur principal da classe de serviço
    // Ao gerar um objeto dessa classe, a propriedade recebe uma nova lista
    ProdutoService () {
        this.listaProduto = new ArrayList<>();
        this.sequenciaCodigos = 1;
    }

    // Method básico para retornar a lista atual
    public List<Produto> getListaProduto () {
        return this.listaProduto;
    }

    // Adicionar um novo produto na lista
    public void addProduto (Produto novoProduto) {
        novoProduto.setCodigo(this.sequenciaCodigos);
        this.sequenciaCodigos =+ 1;
        this.listaProduto.add(novoProduto);
    }

    // Buscar produto por código
    public Produto getProdutoPorCodigo (int codigo) {
        for (Produto produto : this.listaProduto) {
            if (codigo == produto.getCodigo()) {
                return produto;
            }
        }
        return null;
    }

    // Obter lista em forma de tabela - Pegar código depois
//    public String getListaTabela () {
//
//    }

    // Excluir um produto
    public boolean deleteProduto (int codigo) {
        Produto produto = this.getProdutoPorCodigo(codigo);

        if (produto != null) {
            this.listaProduto.remove(produto);
            return true;
        }
        return false;
    }

    // Alterar um produto
    public void updateProduto (int codigo, String novoNome, double novoValor) {
        Produto produto = this.getProdutoPorCodigo(codigo);

        produto.setNome(novoNome);
        produto.setValor(novoValor);

    }



}
