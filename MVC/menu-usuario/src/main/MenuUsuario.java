package main;

import controller.UsuarioController;
import model.Usuario;

import javax.swing.*;

public class MenuUsuario {
    public static void main(String[] args) {
        UsuarioController usuarioController = new UsuarioController();

        StringBuilder menuPrincipal = new StringBuilder();
        menuPrincipal.append("*** Tela de login ***");
        menuPrincipal.append("\n");
        menuPrincipal.append("\n[1] Login");
        menuPrincipal.append("\n[2] Cadastrar");
        menuPrincipal.append("\n[0] Sair");
        menuPrincipal.append("\n");
        menuPrincipal.append("\n\n Selecione uma opção");

        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));

            switch (opcao) {
                case 1:
                    String emailLogin = JOptionPane.showInputDialog("Digite seu email");
                    String senhaLogin = JOptionPane.showInputDialog("Digite seu senha");

                    Usuario usuarioLogado = usuarioController.login(emailLogin, senhaLogin);

                    if(usuarioLogado == null) {
                        JOptionPane.showMessageDialog(null, "Email ou senha incorretos!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário encontrado");
                    }
                    break;
                case 2:
                    String novoNome = JOptionPane.showInputDialog("Digite o nome");
                    String novoEmail = JOptionPane.showInputDialog("Digite o email");
                    String novaSenha = JOptionPane.showInputDialog("Digite a senha");

                    Usuario novoUsuario = new Usuario();

                    novoUsuario.setNome(novoNome);
                    novoUsuario.setEmail(novoEmail);
                    novoUsuario.setSenha(novaSenha);

                    if (usuarioController.cadastrar(novoUsuario)) {
                        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Problema ao cadastrar usuário");
                    }

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
