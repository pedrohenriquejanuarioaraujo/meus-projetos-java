import java.util.Scanner;

public class ContagemdeNúmerosPares {
public static void main (String[]args) {
int quantidade=0;
                
Scanner scanner = new Scanner(System.in);
    
for (int i= 1; i<=19; i++){
    if (i%2 == 0) {
        System.out.print (i + " - ");
        quantidade++;
    }
        
    }

    System.out.println("existem: " + quantidade + " numeros pares de 0 a 20");


 }
}