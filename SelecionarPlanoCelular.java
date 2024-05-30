import java.util.Scanner;

public class SelecionarPlanoCelular {
 public static void main (String[]args) {
 int opcao;

Scanner scanner = new Scanner(System.in);

System.out.println( "Selecione o plano de celular que voce deseja"   );

System.out.println( "1- Plano basico 5GB youtube"   );

System.out.println( "2- Plano plus 5GB youtube"   );

System.out.println( "3- Plano premium + 100 minutos de ligacao"   );

System.out.print("opcao: ");
opcao = scanner.nextInt();

switch (opcao){
    case 1: System.out.println(" parabens, o plano selecionado foi : \n Plano basico (5GB yt)");
    break;
    
    case 2: System.out.println(" parabens, o plano selecionado foi: \n Plano plus (5GB youtube)");

    break; 
    
    case 3: System.out.println(" parabens, o plano selecionado foi: \n Plano premium ( * 100 minutos de ligacao)");
    break; 

    case 4: System.out.println(" Sinto muito, opcao nao corrrespondida");
    default:
}
scanner.close();

 }
}