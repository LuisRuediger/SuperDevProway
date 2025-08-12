import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ExLista {
    public static void main(String[] args) {

        List<String> listaFuncionarios = new ArrayList();

        String menu = "" +
                "*** Menu de opções" +
                "\n[1] Exibir lista" +
                "\n[2] Inserir nome" +
                "\n[3] Localizar funcionário por posição" +
                "\n[4] Localizar funcionário por nome" +
                "\n[5] Remover um funcionário" +
                "\n[0] Sair" +
                "\n*********************************"
                ;

        int opcao = 999;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String lista = "*** Lista de funcionários ***\n";

                    for (String funcionario : listaFuncionarios) {
                        lista += funcionario + "\n";
                    };

                    if (listaFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existem funcionários cadastrados");
                    } else {
                        JOptionPane.showMessageDialog(null, lista);

                    }

                    break;
                case 2:
                    String novoFuncionario = JOptionPane.showInputDialog(null, "Digite o nome do novo funcionário");

                    listaFuncionarios.add(novoFuncionario);

                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso");

                    break;
                case 3:
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição a ser encontrada"));


                    if (posicao >= 0 && posicao < listaFuncionarios.size()) {
                        String funcionarioPosicao = listaFuncionarios.get(posicao);

                        JOptionPane.showMessageDialog(null, "Funcionário encontrado: " + funcionarioPosicao);

                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
                    }

                    break;
                case 4:
                    String funcionarioNome = JOptionPane.showInputDialog(null, "Informe o nome para buscar");
                    String funcionarioEncontrado = null;

                    for (String funcionario : listaFuncionarios) {
                        if (funcionarioNome.toLowerCase().equals(funcionario.toLowerCase())) {
                            funcionarioEncontrado = funcionario;
                        }
                    }

                    if (funcionarioEncontrado != null) {
                        JOptionPane.showMessageDialog(null, "Funcionário encontrado: " + funcionarioEncontrado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
                    }

                    break;
                case 5:
                    String funcionarioRemover = JOptionPane.showInputDialog(null, "Digite o nome a ser removido");

                    boolean exclusao =  listaFuncionarios.remove(funcionarioRemover);

                    if (exclusao == true ) {
                        JOptionPane.showMessageDialog(null, funcionarioRemover + " removido com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado");

                    }

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }

    }

}
