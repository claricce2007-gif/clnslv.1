
import java.util.Scanner;
public class somaN{

    public static void main( String[] args) {
       Scanner scanner = new Scanner (System.in);

       System.out.print( "Digite o primeiro número: ");
       int num1 = scanner.nextInt();

       System.out.print("Digite o segundo número:");
       int num2 = scanner.nextInt();

       int resultado = somar(num1, num2);
       System.out.print("Resultado da soma:" + resultado);

       scanner.close();

    }
public static int somar( int a, int b) {
     return a + b;}
}
