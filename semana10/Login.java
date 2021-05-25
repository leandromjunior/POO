package semana10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener {

    private JFrame tela;
    private JPanel painel;

    private JLabel lblTituloLog;
    private JLabel lblTituloPass;
    private JLabel lblStatus;

    private JTextField txtLog;

    private JPasswordField txtPass;

    private JButton btnEntrar;

    private String senhaCorreta = "123";

    public Login(){
        
        tela = new JFrame();
        painel = new JPanel();

        painel.setBorder(BorderFactory.createEmptyBorder(35, 35, 20, 30));
        painel.setLayout(new GridLayout(0,1));
        
        lblTituloLog = new JLabel("Login:");
        painel.add(lblTituloLog);

        txtLog = new JTextField();
        painel.add(txtLog);

        lblTituloPass = new JLabel("Senha:");
        painel.add(lblTituloPass);

        txtPass = new JPasswordField();
        painel.add(txtPass);

        lblStatus = new JLabel();
        painel.add(lblStatus); 

        btnEntrar = new JButton("Entrar");
        btnEntrar.addActionListener(this);
        painel.add(btnEntrar);

        tela.add(painel, BorderLayout.CENTER);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("Tela de Login");
        tela.setSize(400,450);
        tela.pack();
        tela.setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(txtPass.getText().equals(senhaCorreta)){
            lblStatus.setText("Senha Correta");
            lblStatus.setFont(new Font("Verdana", Font.BOLD, 18));
            lblStatus.setForeground(Color.BLUE);
            new Welcome();
        }else{
            lblStatus.setText("Senha Incorreta. Tente 123");
            lblStatus.setFont(new Font("Verdana", Font.BOLD, 18));
            lblStatus.setForeground(Color.RED);
        }
    }
}