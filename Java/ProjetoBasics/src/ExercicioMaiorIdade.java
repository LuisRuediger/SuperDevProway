import javax.swing.*;

public class ExercicioMaiorIdade {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");

        Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Olá " + nome + ", você é maior de idade" );
        } else {
            JOptionPane.showMessageDialog(null, "Olá" + nome + ", você é menor de idade");
        }

    }
}
