package ex_03;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private Double salario;
	
	
	public Funcionario() {
		
	};
	
	
	public String getNome() {
		return this.nome;
	};
	
	public String getCpf() {
		return this.cpf;
	};
	
	public Double getSalario() {
		return this.salario;
	};
	
	public void setNome(String nome) {
		this.nome = nome;
	};
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	};
	
	public void setSalario(Double salario) {
		this.salario = salario;
	};
	
	
	public void receberBonus(Double bonus) {
		this.salario = this.salario + bonus;
		
		System.out.println(this.nome + " recebeu " + bonus + " de bonus! Seu salário vai para " + this.salario);
};
	
	public void pagarPenalidade(Double penalidade) {
		this.salario = this.salario - penalidade;
		
		System.out.println(this.nome + " Deve pagar " + penalidade + " de penalidade! Seu salário vai para " + this.salario);
	};
	
	public void mostrarSalario() {
		System.out.println("O salário de " + this.nome + " é de " + this.salario);
	};

}
