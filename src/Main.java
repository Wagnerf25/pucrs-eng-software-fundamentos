import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int cont;
        String nome;
        int idade;
        double altura;
        int numero;
        int soma = 0;
        int menu = 4;

        Scanner sc = new Scanner(System.in);

        while(menu != 0) {

            System.out.println("Selecione a opção 1 para gerar um um laço de repetição");
            System.out.println("Selecione a opção 2 para exibir seus dados pessoais");
            System.out.println("Selecione a opção 3 para exibir a soma de todos os valores entre 0 e valor informado ");
            System.out.println("Opção 0 para encerrar ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:

                    for (cont = 1; cont <= 10; cont++) {
                        int val = rand.nextInt(101);
                        System.out.println(val);
                    }
                    break;

                case 2:

                    System.out.println("Digite seu nome ");
                    nome = sc.next();
                    System.out.println("Digite sua altura ");
                    altura = sc.nextDouble();
                    System.out.println("Digite sua idade: ");
                    idade = sc.nextInt();
                    System.out.println("Seu nome é " + nome + " sua altura " + altura + " e sua idade " + idade + ".");
                    break;

                case 3:
                    System.out.println("Digite o numero para o contador: ");
                    numero = sc.nextInt();
                    for (cont = 0; cont <= numero; cont++) {
                        soma = soma + cont;
                    }

                    System.out.println(soma);
                    break;

                case 0:
                    System.out.println("Menu encerrado");
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}