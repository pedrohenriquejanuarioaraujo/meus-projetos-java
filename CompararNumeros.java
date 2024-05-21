import java.util.Scanner;

public class CompararNumeros {
public static void main (String[]args) {
 Scanner scanner = new Scanner(System.in);
 int n1,n2;

System.out.print("digite um numero");
n1 = scanner.nextInt();

System.out.print("digite outro numero");
n2 = scanner.nextInt();

if (n1>n2){
    System.out.print(" n1 e maior que n2");
}

if (n1==n2){
   System.out.print("n1 e igual a n2");
}

if (n2>n1){
    System.out.print("n2 e maior que n1");
}


scanner.close();
}

}

