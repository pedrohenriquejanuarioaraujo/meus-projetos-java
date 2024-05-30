import java.util.Scanner;

public class CalcularMediaNota {
public static void main (String[]args) {
int nota1,nota2,nota3,nota4, media=0;
       
Scanner scanner = new Scanner(System.in);

System.out.println( "Digite a primeira nota"   );
nota1 = scanner.nextInt();

System.out.println( "Digite a segunda nota"   );
nota2 = scanner.nextInt();

System.out.println( "Digite a terceira nota"   );
nota3 = scanner.nextInt();

System.out.println( "Digite a quarta nota"   );
nota4 = scanner.nextInt();

media = nota1 + nota2 + nota3 + nota4/4;

if (media<5) {
    System.out.println("Reprovado");

}
 else if (media < 7) {
    System.out.println("Recuperacao");
    
 }

 else {
    System.out.println("Aprovado");
 }


 scanner.close();
}
}
