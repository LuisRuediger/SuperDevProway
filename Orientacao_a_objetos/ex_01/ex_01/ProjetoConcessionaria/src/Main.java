
public class Main {

	public static void main(String[] args) {
		

//		Declarar um objeto da classe Carro
//		Utilizando o construtor vazio
		
		Carro carro1 = new Carro();
		
		carro1.setModelo("Voyage");
		carro1.setCor("Laranja");
		carro1.setAno(1970);
		
		carro1.imprimirDados();
		
		
//		Declarar um objeto da classe Carro
//		Utilizando o construtor vazio
		
		Carro carro2 = new Carro("Kombi", "Black", 1970);
				
		carro2.imprimirDados();

	}

}
