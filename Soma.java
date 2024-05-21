import java.util.Scanner;

public class Soma{

public static void main (String[]args) {
    int n1,n2 ; 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro numero:");
    n1 = scanner.nextInt();

    System.out.print("Digite o segundo numero");
    n2 = scanner.nextInt();

    System.out.print(" A soma e: " + n1 + n2);

    System.out.print(" A multiplicacao e: "+  n1 * n2);

    System.out.print(" A subtracao e: " + (n1 - n2));

    System.out.print("A divisao e: " + n1 / n2);

    scanner.close();
}
}