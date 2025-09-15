import controller.ProdutoController;
import model.Produto;
import test.ProdutoTest;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        ProdutoController controller = new ProdutoController();

        StringBuilder menu = new StringBuilder();
        menu.append("*** Menu do sistema ***");
        menu.append("\n[1] Cadastrar");
        menu.append("\n[2] Listar");
        menu.append("\n[3] Buscar por ID");
        menu.append("\n[4] Buscar por Descrição");
        menu.append("\n[5] Excluir");
        menu.append("\n[6] Alterar");
        menu.append("\n[0] Sair");
        menu.append("\n\n Selecione uma opção");


        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String descricao = JOptionPane.showInputDialog("Descrição do produto");
                    Double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto"));

                    Produto novoProduto = new Produto();
                    novoProduto.setDescricao(descricao);
                    novoProduto.setPreco(preco);
                    novoProduto.setStatus(true);

                    String mensagemInsert = controller.insert(novoProduto);
                    JOptionPane.showMessageDialog(null, mensagemInsert);
                    break;
                case 2:
                    List<Produto> listaTodosProduto = controller.getAll();

                    controller.printFormatedList(listaTodosProduto);

                    break;
                case 3:
                    Integer idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID para buscar o produto"));

                    Produto produtoEncontrado = controller.getById(idBuscar);

                    if (produtoEncontrado != null) {
                        JOptionPane.showMessageDialog(
                                null,
                                "*** Produto encontrado ***\n" +
                                "\nNome: " + produtoEncontrado.getDescricao() +
                                "\nCódigo: " + produtoEncontrado.getId() +
                                "\nPreço: " + produtoEncontrado.getPreco());
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    }

                    break;
                case 4:
                    String descricaoBusca = JOptionPane.showInputDialog("Digite a descrição para buscar o produto");
                    List<Produto> produtosFiltradosPorDesc = controller.getByDescricao(descricaoBusca);

                    controller.printFormatedList(produtosFiltradosPorDesc);

                    break;
                case 5:
                    // Validar se o produto para o codigo digitado
                    int idDelete = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto para excluir"));

                    //Se existir executar
                    controller.delete(idDelete);

                    JOptionPane.showMessageDialog(null, "Produto exluído com sucesso!");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }


    }
}
