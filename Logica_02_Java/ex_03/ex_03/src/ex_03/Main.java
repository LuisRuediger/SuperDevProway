package ex_03;

public class Main {

	public static void main(String[] args) {
		

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Luis");
		funcionario.setCpf("123123123123");
		funcionario.setSalario(2000.0);
		
		
		funcionario.receberBonus(1000.0);
		funcionario.pagarPenalidade(500.0);
		funcionario.mostrarSalario();

	}
}
