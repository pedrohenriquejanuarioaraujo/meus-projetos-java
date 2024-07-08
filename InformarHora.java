import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class InformarHora {
    public static void main(String[] args) {
        // Passo 1: Perguntar o nome do usuário
        // criar variável nome do tipo String e usar um showInputDialog para adicionar o nome
        String nome;
        nome = JOptionPane.showInputDialog("Qual seu NickName?");

        // Passo 2: Perguntar se o usuário quer saber a hora atual
        // criar variável resposta do tipo int e inserir a respostar com um showConfirmDialog
        int resposta;
        resposta= JOptionPane.showConfirmDialog(null, nome + ", voce quer saber a hora atual? ");

        // Passo 3: Mostrar a hora atual ou mensagem de despedida
        // Se o usuário clicar em SIM
        
            // Obter a hora atual
            // -> Criar variavel horaAtual do tipo LocalTime recebendo a hora atual com o método LocalTime();
            // Criar a variável formatador para receber o modelo que deseja formatar a hora HH:mm:ss
            // criar variável do tipo String para receber a hora atual já formatada com o método horaAtual.format(formatador);
            if (resposta == JOptionPane.YES_OPTION) {
               LocalTime horaAtual = LocalTime.now(); 
               DateTimeFormatter formatador = DateTimeFormatter.ofPattern("hh,mm,ss");
               String HoraFormatada = horaAtual.format(formatador);
               JOptionPane.showMessageDialog(null, "A hora atual é : " + HoraFormatada);
                
               } else {
                JOptionPane.showMessageDialog(null, " Sayonara...... motherfucker :)");
        
            }


            // Após formatá-la, mostra a hora atual em um PopUp showMessageDialog

            
    
        // se o usuário clicar em NÃO
        // Mostrar mensagem de despedida em um PopUp showMessageDialog



    }
}
