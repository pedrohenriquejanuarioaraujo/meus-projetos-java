import java.util.Scanner;
public class fatorial {
   
public static void main (String[]args){
int numero=0, fat=1;

Scanner scanner = new Scanner(System.in);
  
 System.out.print("Digite um numero: ");

 numero = scanner.nextInt();

10

for (int i = numero; i>1; i--){
    fat = fat * i;
}


System.out.print("Fatorial de  " + numero + " e " + fat);

scanner.close();
}

   
}
