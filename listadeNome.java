
import java.util.Scanner;
public class listadeNome {
public static void main (String[]args) {
String [] nome = new String[5];
int i;       
Scanner scanner = new Scanner(System.in);

for ( i= 0; i<5; i++){ 
System.out.println("Digite um Nome");
nome[i] = scanner.nextLine();
}

for ( i= 0; i<5; i++){ 
    System.out.println("Nome" + i + ": " + nome[i]);
}



 }
}