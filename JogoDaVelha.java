import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JogoDaVelha {
    public static void main(String[] args) {

        // criar 02 variáveis do tipo String que receberão os nomes dos 2 jogadores
        String jogador1, jogador2;
        JOptionPane.showMessageDialog(null, " Começando o jogo da velha ");

        // exibir caixa de diálogo informando que entrou no Jogo da Velha
        jogador1 = JOptionPane.showInputDialog(null, "Digite o nome do jogador 1 ");
        jogador2 = JOptionPane.showInputDialog(null, "Digite o nome do jogador 2 ");


        // Exibir caixa de diálogo do tipo INPUT e solicitar o nome dos dois jogadores e colocar nas variáveis

        // criar a janela do jogo do tipo JFrame, com título Jogo da Velha, tamanho 400x400, centralizada na tela 
        JFrame janela = new JFrame();
        janela.setTitle("Jogo Da Velha");
        janela.setSize(400,400);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // definir o layout da janela como BorderLayout
        janela.setLayout (new BorderLayout());
        JLabel txtJogadores = new JLabel();
        txtJogadores.setText(jogador1 + " x " + jogador2);
        txtJogadores.setFont(new Font ( "Arial ", Font.PLAIN, 20 ));
        txtJogadores.setHorizontalAlignment(SwingConstants.CENTER);

        // criar um variável do tipo JLabel, que receberá o texto com o nome dos dois jogadores para exibir na tela do jogo - na fonte Arial, tamanho 20 e centralizado



        // criar um painel do Jogo do tipo JPanel com layout em GRID 3x3
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout( 3,3));


        // criar um array de botões do tipo JButton de 9 posições e outro array para marcar que o X começa o jogo
       JButton[] botoes = new JButton[9];
       boolean[] VezDox = {true};

        // fazer um loop do tipo FOR com 9 ciclos e criar um botão para cada posição acessada e mudar letra para aRial tamanho 40 e adiconar função para adicionar X ou O ao final adiciona o botão no painel
        for(int i = 0; i<9; i++){
            botoes[i] = new JButton("");
            botoes[i].setFont(new Font  ( "Arial " , Font.PLAIN, 40));
            botoes[i].setFocusPainted(false);

            botoes[i].addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e){
                       JButton buttonClicked = (JButton) e.getSource();
                       if (buttonClicked.getText().equals("")) {
                          buttonClicked.setText((VezDox[0] ? "x": "o"));
                          VezDox[0] = !VezDox[0];
                     
                           }   
                    }
                
             }
            
            );   
         painel.add(botoes[i]);
            }


        JButton btnResetar = new JButton();
        btnResetar.setText("Limpar Tela ");
        btnResetar.setFont(new Font ( "Arial", Font.PLAIN,20) );

        btnResetar.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                for (int i =0; i<9; i++){
                  botoes[i].setText(" ");
                }
                VezDox[0] = true;

                JOptionPane.showMessageDialog(null, " Jogo resetado com sucesso");

            }
        });
        
        janela.add(txtJogadores, BorderLayout.NORTH);
        janela.add(painel, BorderLayout.CENTER);
        janela.add(btnResetar, BorderLayout.SOUTH);
    
        janela.setVisible(true);
        // torna a janela visível para o usuário
        
    }



}