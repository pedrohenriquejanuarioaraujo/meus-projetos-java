import java.awt.event.*;
import javax.swing.*;
public class CriandoJanela {
    public static void main(String[] args){
    
JFrame janela = new JFrame();

janela.setVisible(true);
janela.setSize(800, 500);
janela.setTitle("aula sobre interface grafica");


janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
janela.setResizable(false);
janela.setLocationRelativeTo(null);


janela.setLayout(null);
JButton botao = new JButton();
botao.setText("Pressione aqui"); 
botao.setBounds(100, 200,200,70);  
janela.add(botao);


botao.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(janela, "Deu tudo certo");
        
    }
} );

janela.setLayout(null);
JButton botao2 = new JButton();
botao2.setText(" ok "); 
botao2.setBounds(400, 200,200,70);  
janela.add(botao2);


botao2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(janela, "Voce clicou em OK");
        
    }
} );



 }

}
