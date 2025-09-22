import Controller.PacienteController;
import Model.Paciente;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        PacienteController controller = new PacienteController();

        StringBuilder menu = new StringBuilder();
        menu.append("*** Menu do sistema ***");
        menu.append("\n[1] Cadastrar");
        menu.append("\n[2] Listar");
//        menu.append("\n[3] Buscar por ID");
//        menu.append("\n[4] Buscar por Descrição");
//        menu.append("\n[5] Excluir");
//        menu.append("\n[6] Alterar");
//        menu.append("\n[0] Sair");
//        menu.append("\n\n Selecione uma opção");

        Integer opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:

                    break;
                case 2:
                    List<Paciente> listaTodosPacientes = controller.getAll();

                    controller.printFormatedList(listaTodosPacientes);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;


            }
        }
    }
}