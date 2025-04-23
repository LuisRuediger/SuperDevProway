package ex_01;

public class Conditional {

	public static void main(String[] args) {
		
//		If
		
		int number = 5;
		
		if (number >= 2) {
			System.out.println(number + " é maior!");
		} else {
			System.out.println(number + " é menor!");
		}
		
		
//		Switch Case
		
		int day = 2;
		
		switch (day) {
		
		case 1:
			System.out.println("Hoje é Domingo!");
			break;
			
		case 2:
			System.out.println("Hoje é Segunda!");
			break;
			
		case 3:
			System.out.println("Hoje é Terça!");
			break;
			
		default:
			System.out.println("Dia inválido!");
			
		};
		
		

	}

}
