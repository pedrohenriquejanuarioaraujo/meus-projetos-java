import java.util.Scanner;
public class diadasemana {
public static void main (String[]args) {
int dia; 

Scanner scanner = new Scanner(System.in);

System.out.println("Digite o dia da semana");
dia = scanner.nextInt();
 
switch (dia) {
    case 1:
       System.out.println(" O dia e Domingo"); 
        break;
 
    case 2:
       System.out.println(" O dia e Segunda"); 
        break;
    
    case 3:
       System.out.println(" O dia e terça"); 
        break;
    
    case 4:
       System.out.println(" O dia e quarta"); 
        break;

    case 5:
       System.out.println(" O dia e quinta"); 
        break;

    case 6:
       System.out.println(" O dia e sexta"); 
        break;

    case 7:
       System.out.println(" O dia e sabado"); 
        break;
    
    default:
        break;
 }
 }

}