import java.util.Scanner;
public class ExibirProduto {
    public static void main (String[]args) {
        int opcao=1, opcaoproduto ;
            
     Scanner scanner = new Scanner(System.in);



    while (opcao==1) {
     System.out.print("* CONSULTA DE PRODUTO *");
     System.out.print(" 1- consultar produto");
     System.out.print(" 2- Sair do programa");
     System.out.print(" Digite a opção: ");
     opcao = scanner.nextInt();
    
     if (opcao==1) {
        System.out.print("Digite o codigo do produto");
        opcaoproduto = scanner.nextInt();

        switch (opcaoproduto) {
            case 5478 : 
                System.out.println(" o produto selecionado foi arroz 5 kg");
                System.out.println("preço unitario: Rs 15,90");      
                break;
        
            case 3285 : 
                System.out.println(" o produto selecionado foi feijao 1 kg");
                System.out.println("preço unitario: Rs 7.50");        
                break;

            case 8097 : 
                System.out.println(" o produto selecionado foi macarrao 500g");
                System.out.println("preço unitario: Rs 4.20");        
                break;

            case 7314 : 
                System.out.println(" o produto selecionado foi leite 1L");
                System.out.println("preço unitario: Rs 3.80");        
                break;

            case 9801 : 
                System.out.println(" o produto selecionado foi pao frances kg");
                System.out.println("preço unitario: Rs 12");        
                break;

            case 8510 : 
                System.out.println(" o produto selecionado foi açucar 1 kg");
                System.out.println("preço unitario: Rs 2.90");        
                break;

            case 8503 : 
                System.out.println(" o produto selecionado foi cafe 500g");
                System.out.println("preço unitario: Rs 8.50");        
                break;

            case 2985 : 
                System.out.println(" o produto selecionado foi Óleo de Soja (900ml)");
                System.out.println("preço unitario: Rs 5.60");        
                break;  

            case 6141 : 
                System.out.println(" o produto selecionado foi Margarina (500g)");
                System.out.println("preço unitario: Rs 4.50");        
                break;

            case 1030 : 
                System.out.println(" o produto selecionado foi Sabão em Pó (1kg)");
                System.out.println("preço unitario: Rs 10.00");        
                break;

            case 9001 : 
                System.out.println(" o produto selecionado foiDetergente (500ml)");
                System.out.println("preço unitario: Rs 2.20");        
                break; 

            case 5002 : 
                System.out.println(" o produto selecionado foi Papel Higiênico (4un)");
                System.out.println("preço unitario: Rs 6.0");        
                break;

            case 7436 : 
                System.out.println(" o produto selecionado foi Shampoo (350ml)");
                System.out.println("preço unitario: Rs 9.90");        
                break;

            case 0274 : 
                System.out.println(" o produto selecionado foi Condicionador (350ml)");
                System.out.println("preço unitario: Rs 9.90");        
                break;
            
            case 7456 : 
                System.out.println(" o produto selecionado foi Pasta de Dente (90g)");
                System.out.println("preço unitario: Rs 3.50");        
                break;


            default:
                break;
        }
    }



    }
     


 }
}