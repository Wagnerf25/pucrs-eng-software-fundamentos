//Leia 3 valores inteiros (X, Y, Z), determine e escreva o menor deles
import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner sc = new Scanner(System.in);

        System.out.println (" Informe 3 valores; ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println("O maior valor é " + x + ".");
        } if (y > x && y > z) {
            System.out.println("O maior valor é " + y + ".");
        } if (z > x && z > y) {
            System.out.println("O maior valor é " + z + "." );
        } if (x == y && y == z) {
            System.out.println ("Os valores " + x + " e " + y + " e " + z + " são iguais");
        }
    }
}
