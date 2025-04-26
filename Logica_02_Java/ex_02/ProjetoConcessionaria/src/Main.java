
public class Main {

	public static void main(String[] args) {
		
		// Declarar um objeto da classe Carro
		// utilizando um Construtor Vazio
		
		Carro carro1 = new Carro();
		
		// Inserindo valores em cada atributo do objeto
		carro1.setModelo("Voyage");
		carro1.setCor("Laranja");
		carro1.setAno(1678);
		
		carro1.imprimirDados();
	
		
		// Declarar um objeto da classe Carro
		// utilizando um Construtor com Parâmetros
		
		Carro carro2 = new Carro("Kombi", "Black", 2026);
		
		carro2.imprimirDados();
		

	}

}
