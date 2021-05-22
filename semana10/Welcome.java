package semana10;

import javax.swing.*;
import java.awt.*;

public class Welcome{

    private JFrame tela;
    private JPanel painel;

    private JLabel boas;

    public Welcome(){
        
        tela = new JFrame();
        painel = new JPanel();

        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        painel.setLayout(new GridLayout(0,1));
        
        boas = new JLabel("Bem Vindo");
        painel.add(boas);

        tela.add(painel, BorderLayout.CENTER);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("Tela de Login");
        tela.setSize(400,400);
        tela.pack();
        tela.setVisible(true);

    }

    public static void main(String[] args) {
        new Welcome();
    }
}
