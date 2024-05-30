import java.util.Random;

import java.util.Scanner;

public class AdivinharNumero {
public static void main (String[]args) {
Random rd = new Random ();
Scanner scanner = new Scanner(System.in);
int aleatorio;
int numerousuario = 0;
aleatorio = rd.nextInt(11);

while (aleatorio!=numerousuario) {
    
System.out.println("Digite um numero de 0 a 10: ");
aleatorio = scanner. nextInt();

if (aleatorio == numerousuario) {
    System.out.println("Voce acertou");

}else{
    System.out.println("Voce errou");
}

}

}
}









