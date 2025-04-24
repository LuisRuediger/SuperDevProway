
public class Carro {
	
	private String modelo;
	private String cor;
	private Integer ano;
	
	
//	Declaração de Construtor vazio
	
	public Carro() {
		
	};
	
	
//	Declaração de Construtor com parâmetros
	
	public Carro(String modelo, String cor, Integer ano) {
		
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		
	};
	
	
//	Declaração dos métodos GET
	
	public String getModelo() {
		return this.modelo;
	};
	
	public String getCor() {
		return this.cor;
	};
	
	public Integer getAno() {
		return this.ano;
	};
	
	
//	Declaração dos métodos SET
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	};
	
	public void setCor(String cor) {
		this.cor = cor;
	};
	
	public void setAno(Integer ano) {
		this.ano = ano;
	};
	
	
	
//	Declaração do métodos próprios
	
	public void imprimirDados() {
		
		System.out.println("- Informações do Carro -");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		
	}
	
	
	
	

}
