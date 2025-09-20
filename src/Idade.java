// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        int idade;
        int mes;
        int dia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        mes = idade * 30;
        dia = idade * 365;

        System.out.println(" Você tem " + mes + " em meses de vida e " + dia + " em dias de vida");

    }
}
