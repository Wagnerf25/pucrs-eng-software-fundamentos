import java.util.Scanner;

public class CompararTriangulos {
    public static void main(String[] args) {

        int ladoA, ladoB, ladoC;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os valores dos lados A,B e C ");
        ladoA = sc.nextInt();
        ladoB = sc.nextInt();
        ladoC = sc.nextInt();

            if(ladoA+ladoB <= ladoC || ladoA+ladoC <= ladoB || ladoC+ladoB <= ladoA){
                System.out.println("É um tringulo");

                if (ladoA == ladoB && ladoA==ladoC && ladoB==ladoC) {
                    System.out.println("É um triangulo  eqüilátero ");

                } if (ladoA!=ladoB && ladoC!=ladoA && ladoB!= ladoC) {
                    System.out.println("É um triangulo escaleno");
                } else {
                    System.out.println("é um triangulo isósceles ");
                }

            } else {
                System.out.println("Não é um triangulo");
            }

    }
}
