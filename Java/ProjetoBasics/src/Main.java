import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Saída de dados
        System.out.println("Hello and welcome!");

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = scanner.next();

        System.out.println("Olá " + nome + ", seja bem vindo!");


        }
    }