import javax.swing.*;

public class PanelMain {
    public static void main(String[] args) {


        JOptionPane panel = new JOptionPane();

        JOptionPane.showMessageDialog(null, "Bem vindo!");

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        String message = "Olá " + nome + ", seja bem vindo ao sistema!";

        JOptionPane.showMessageDialog(null, message);

    }
}
