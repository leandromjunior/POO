import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;


public class CalcSimples implements ActionListener {

    private JFrame janela;
    private JPanel painel;

    private JLabel labeltitulo;
    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelResultado;

    private JTextField textNum1;
    private JTextField textNum2;

    private JButton btnSomar;

    public CalcSimples(){
        janela = new JFrame();

        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        painel.setLayout(new GridLayout(0,1));

        //Componentes da tela
        labeltitulo = new JLabel("Calculadora");
        labeltitulo.setFont(new Font("Verdana", Font.BOLD,20));
        painel.add(labeltitulo);

        labelNum1 = new JLabel("Primeiro Valor: ");
        painel.add(labelNum1);

        textNum1 = new JTextField("0"); //inicializa a caixa de texto com valor 0
        painel.add(textNum1);

        labelNum2 = new JLabel("Primeiro Valor: ");
        painel.add(labelNum2);

        textNum2 = new JTextField("0"); //inicializa a caixa de texto com valor 0
        painel.add(textNum2);

        btnSomar = new JButton("Somar");
        btnSomar.addActionListener(this);
        painel.add(btnSomar);

        labelResultado = new JLabel("Resultado: ");
        labelResultado.setFont(new Font("Verdana", Font.BOLD, 18));
        labelResultado.setForeground(Color.GREEN);
        painel.add(labelResultado);


        janela.add(painel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Libera memoria ao fechar janela
        janela.setTitle("Calculadora Simples");
        janela.setSize(300,300);
        janela.pack();
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        new CalcSimples();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Matematica mat = new Matematica();

        Integer num1 = Integer.parseInt( textNum1.getText());
        Integer num2 = Integer.parseInt( textNum2.getText());

        labelResultado.setText("Resultado: " + mat.somar(num1, num2));
    }
}
