import java.util.Scanner;

public class VerificarObrigVoto{

public static void main (String[]args) {
Scanner scanner = new Scanner(System.in);
int idade;

System.out.print("Digite sua idade");
idade = scanner.nextInt();

if (idade<=15 ){
    System.out.print( " o cidadao nao precisa votar");
}
if (idade>=16 || idade>70){
    System.out.print("o cidadao tem voto facultativo");
}
if(idade>=18 && idade <=70){
    System.out.print("O cidadao e obrigado a votar");
}

scanner.close();

}
}