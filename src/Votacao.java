
//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

import java.util.Scanner;

public class Votacao {
   public static void main(String[] args){

       double totalEleitores;
       double votosBrancos;
       double votosNulos;
       double votosValidos;

       double votosPBrancos;
       double votosPNulos;
       double votosPValidos;

       Scanner sc = new Scanner(System.in);

       System.out.println("Digite a quantidade de votos nulos: ");
       votosNulos = sc.nextDouble();

       System.out.println("Digite a quantidade de votos em branco: ");
       votosBrancos = sc.nextDouble();

       System.out.println("Digite a quantidade de votos válidos: ");
       votosValidos = sc.nextDouble();

       totalEleitores = votosBrancos +  votosNulos + votosValidos;
       System.out.println("A quantidade eleitores neste ano foi de " + totalEleitores + ". ");

       votosPBrancos = (votosBrancos / totalEleitores) * 100;
       System.out.println("A quantidade de votos em branco foi de " + votosPBrancos + "%. ");

       votosPNulos = votosNulos / totalEleitores * 100;
       System.out.println("A quantidade de votos nulos foi de " + votosPNulos + "%. ");

       votosPValidos = votosValidos / totalEleitores * 100;
       System.out.println("A quantidade de votos válidos foi de " + votosPValidos + "%. ");

   }
}