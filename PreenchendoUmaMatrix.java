import java.security.SecureRandom;

public class PreenchendoUmaMatrix {
    public static void main (String[]args){
        int [][] aleatorio = new int [5][5];
    

    SecureRandom rd = new SecureRandom();
    
    for(int linha = 0; linha <5; linha++){
        for(int coluna = 0; coluna <5; coluna++){
            aleatorio[linha][coluna] = rd.nextInt(100);
        }
    }

    for(int linha = 0; linha <5; linha++){
        for(int coluna = 0; coluna <5; coluna++){
            System.out.print(aleatorio[linha][coluna]+"     -     ");
        }
        System.out.println("\n");
    }
    
    




 }
}