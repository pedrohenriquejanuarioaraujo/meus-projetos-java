import java.util.Scanner;

public class VerificaçãodeIdade {
    public static void main (String[]args) {
    int idade;
            
Scanner scanner = new Scanner(System.in);

System.out.println(" Digite sua idade seu pamonha oa quadrado");
idade = scanner.nextInt();

if (idade<=12 ) {
    System.out.println(" Sua idade e: " + idade + " voçe é uma criança ainda");
} 
if (idade>=13 && idade <=17) {
    System.out.println(" Sua idade e: " + idade + " voce ja é um adolecente");
}
    
if (idade >=18 ) {
    System.out.println(" Sua idade e: " + idade +  " voce ja e um adulto");
    
  }
    
 
}

    
 }