
public class Repetition {

	public static void main(String[] args) {
				
//				Entrada de dados
				
				Scanner read = new Scanner(System.in);
				
//				While
				
				String repeat = 1;
				
				while ( repeat == 1) {
					
					System.out.println("Deseja continuar repetindo");
					System.out.println("[1] SIM      [0]  NÃO ");
					
					repeat = read.nextInt();
				};
				
//				For
				
				int number = 7;
				
				for (int cont = 1; cont <=10; cont++) {
					int result = number * cont;
					
					System.out.println(number + " x " + cont + " = " + result);
					
				};

			


	}

}
