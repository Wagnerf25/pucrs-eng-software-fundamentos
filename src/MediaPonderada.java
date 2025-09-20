import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        double nota1, nota2, peso1,peso2,mediaPonderada;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua nota e o peso da primeira prova ");
        nota1 = sc.nextDouble();
        peso1 = sc.nextDouble();
        System.out.print("Informe sua nota e o peso da segunda prova ");
        nota2 = sc.nextDouble();
        peso2 = sc.nextDouble();

        mediaPonderada = ((nota1*peso1) + (nota2*peso2)) / (peso1+peso2);

        System.out.println("A sua mendia ponderada é " +  mediaPonderada);

    }
}
