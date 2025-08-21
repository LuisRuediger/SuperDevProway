import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoMain {
    public static void main(String[] args) {

        // Aplicando conceito de CRUD em List

        // Instanciar o serviço da ProdutoService
        ProdutoService service = new ProdutoService();

        int opcao = 999;
        String menu = "*** Menu Produto ***\n" +
                "\n[1] Listar todos" +
                "\n[2] Buscar por código" +
                "\n[3] Adicionar novo" + // validar a categoria do produto (se software ou hardware)
                "\n[4] Alterar" +
                "\n[5] Excluir" +
                "\n[0] Sair";
                // outra opção para listar apenas software
                // outr opção para listas apenas hardware

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String relatorioProdutos = "Código        Nome                   Valor                Categoria\n";

                    for (Produto produto : service.getListaProduto()) {
                        relatorioProdutos +=
                                produto.getCodigo() + "                  " +
                                produto.getNome() + "                    " +
                                produto.getValor() + "\n";
                    }

                    if (service.getListaProduto().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Sem produtos cadastrados.");
                    } else {
                        JOptionPane.showMessageDialog(null, relatorioProdutos);
                    }
                    break;
                case 2:
                    int codigoBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));

                    Produto produtoEncontrado = service.getProdutoPorCodigo(codigoBusca);

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
                    String categoria = JOptionPane.showInputDialog(
                            "Qual a categoria do produto\n" +
                                    "Hardware ou Software?"
                    );
                    String novoNome = JOptionPane.showInputDialog("Digite o nome do produto");
                    double novoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));

                    if (categoria.equalsIgnoreCase("Software")) {
                        ProdutoSoftware software = new ProdutoSoftware();
                        software.setNome(novoNome);
                        software.setValor(novoValor);
                        software.setCategoria(categoria);

                        String versao = JOptionPane.showInputDialog("Qual a versãa?");
                        software.setVersao(versao);

                        service.addProduto(software);
                    } else if (categoria.equalsIgnoreCase("Hardware")) {
                        ProdutoHardware hardware = new ProdutoHardware();

                        hardware.setNome(novoNome);
                        hardware.setValor(novoValor);

                        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade?"));
                        hardware.setQuantidade(quantidade);

                        service.addProduto(hardware);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        break;
                    }

                    Produto novoProduto = new Produto();
                    novoProduto.setNome(novoNome);
                    novoProduto.setValor(novoValor);

                    service.addProduto(novoProduto);

                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

                    break;
                case 4:
                    int codigoAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto que deseja alterar"));

                    Produto produtoAlterar = service.getProdutoPorCodigo(codigoAlterar);

                    if (produtoAlterar == null) {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado para o código: " + codigoAlterar);
                    } else {
                        String mensagemAlterar = "Produto encontrado!\n" +
                                "\nNome: " + produtoAlterar.getNome() +
                                "\nValor: " + produtoAlterar.getValor();
                        JOptionPane.showMessageDialog(null, mensagemAlterar);

                        String nomeAlterar = JOptionPane.showInputDialog("Digite o novo nome para o produto");
                        double valorAlterar = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor"));

                        service.updateProduto(codigoAlterar, nomeAlterar, valorAlterar);

                        JOptionPane.showMessageDialog(
                                null,
                                "Produto " + produtoAlterar.getNome() + "Alterado com sucesso!"
                                );

                    }

                    break;
                case 5:
                    int codigoExclusao = Integer.parseInt(JOptionPane.showInputDialog("Digite o código para excluir"));

                    boolean isExclusao = service.deleteProduto(codigoExclusao);

                    if (!isExclusao) {
                        JOptionPane.showMessageDialog(null,
                                "Produto não encontrado para o código" + codigoExclusao);
                    } else {
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