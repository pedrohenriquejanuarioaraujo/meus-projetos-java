
import java.util.Scanner;
public class ExibirTabuada {
    public static void main (String[]args){
    int i,numero=0,total;
        
    Scanner scan = new Scanner(System.in);
          
    System.out.print("Digite um valor para tabuada");
    numero = scan.nextInt();

    for ( i=1; i<=10; i++){
        total = numero * i;
        
     System.out.println (numero + "x" + i + "=" + total);
    }


 }
}