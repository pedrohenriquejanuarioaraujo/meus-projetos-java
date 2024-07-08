import java.util.Scanner;
public class SomadosNúmerosÍmpares {
public static void main (String[]args) {
int n,soma=0;                     

Scanner scanner = new Scanner(System.in);

n = 0;
while (n <5 ) {
   System.out.println("Digite um numero de 1 a 5: ");
      n = scanner. nextInt();
    
    soma = soma + n;
     
    }
   System.out.println(" A soma dos numeros e : " + soma);
   }
}
