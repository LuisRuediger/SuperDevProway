import java.util.ArrayList;
import java.util.List;

public class Paciente {

        private String nome;
        private int idade;
        private ArrayList historicoMedico;

        public Paciente(String nome, int idade) {

        }

        public Paciente() {

        }

        public void adicionarHistorico(String registro) {

        }

        public void mostrarHistorico() {

            System.out.println(this.historicoMedico);
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public ArrayList<List> getHistoricoMedico() {
            return historicoMedico;
        }

        public void setHistoricoMedico(ArrayList historicoMedico) {
            this.historicoMedico = historicoMedico;
        }
}
