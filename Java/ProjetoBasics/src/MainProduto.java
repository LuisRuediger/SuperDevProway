import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {

        // Aplicando conceito de CRUD em List

        // C - Create


        // Criando a lista do tipo 'Produto'
        List<Produto> produtoList = new ArrayList<>();

        int sequenciaCodigos = 1;

        int opcao = 999;
        String menu = "*** Menu Produto ***\n" +
                "\n[1] Listar todos" +
                "\n[2] Buscar por código" +
                "\n[3] Adicionar novo" +
                "\n[4] Alterar" +
                "\n[5] Excluir" +
                "\n[0] Sair";

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String relatorioProdutos = "Código        Nome                   Valor\n";

                    for (Produto produto : produtoList) {
                        relatorioProdutos +=
                                produto.getCodigo() + "                  " +
                                produto.getNome() + "                    " +
                                produto.getValor() + "\n";
                    }

                    if (produtoList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Sem produtos cadastrados.");
                    } else {
                        JOptionPane.showMessageDialog(null, relatorioProdutos);
                    }
                    break;
                case 2:
                    int codigoBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));

                    Produto produtoEncontrado = null;

                    for (Produto produto : produtoList) {
                        if (codigoBusca == produto.getCodigo()) {
                            produtoEncontrado = produto;
                        }
                    }

                    if (produtoEncontrado == null) {
                        JOptionPane.showMessageDialog(null,
                                "Produto não encontrado para o código " + codigoBusca);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Produto encontrado!\n" +
                                        "\nCódigo: " + produtoEncontrado.getCodigo() +
                                        "\nNome: " + produtoEncontrado.getNome() +
                                        "\nValor: " + produtoEncontrado.getValor()
                        );
                    }

                    break;
                case 3:
                    Produto novoProduto = new Produto();

                    novoProduto.setCodigo(sequenciaCodigos);
                    sequenciaCodigos++;

                    novoProduto.setNome(JOptionPane.showInputDialog("Digite o nome do produto"));

                    double novoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
                    novoProduto.setValor(novoValor);

                    produtoList.add(novoProduto);

                    break;
                case 5:
                    int codigoExclusao = Integer.parseInt(JOptionPane.showInputDialog("Digite o códio para excluir"));

                    Produto produtoExcluir = null;

                    for (Produto produto : produtoList) {
                        if (codigoExclusao == produto.getCodigo()) {
                            produtoExcluir = produto;
                        }
                    }

                    if (produtoExcluir == null) {
                        JOptionPane.showMessageDialog(null,
                                "Produto não encontrado para o código" + codigoExclusao);
                    } else {
                        produtoList.remove(produtoExcluir);
                        JOptionPane.showMessageDialog(null,
                                "Produto excluido com sucesso!");
                    }


                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");


            }

        }

    }
}