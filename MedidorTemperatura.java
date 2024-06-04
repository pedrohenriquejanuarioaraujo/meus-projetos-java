

import java.util.Scanner;

public class MedidorTemperatura {
   public static void main (String[]args) {
   int celsius=0;
       
Scanner scanner = new Scanner(System.in);

System.out.print("digite a temperatura em celsius");
celsius = scanner.nextInt();

if (celsius <0) {
    System.out.print(" Cuidado! podera nevar na sua regiao");
}
if (celsius >0 && celsius<20 ) {
    System.out.print("Tempo frio! Possibilidade de ventos fortes. ");
}
if (celsius >21 && celsius <30) {
    System.out.print("Tempo agradável durante todo o dia.");
}
if (celsius >30 ) {
    System.out.print(" Calor excessivo! Risco de insolação.");
}

scanner.close();

}
}
