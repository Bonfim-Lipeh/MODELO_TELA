package sccr;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
//fornece acesso a componentes visuais necessarios para a elaboração da interface gráfica

public class AWTTestSwing {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("AWT Test"); //cria uma nova janela com o titulo AWT Test
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comando para encerrar, ou fechar a página
		frame.setSize(400,200);// tamanho da tela
		frame.setLayout(new BorderLayout());//definição do gerenciador da tabela
		
		JLabel label1 = new JLabel("Label1");//instancia JLabel1
		JTextField textField1 = new JTextField(15);//campo de texto com 15 caracteres
		
		JPanel topPanel = new JPanel();// criação de um painel
		topPanel.setLayout(new FlowLayout()); // gerenciador do layout do painel || flowlayout organia os caracteres da esquerda para direita quebrando linhas quando não cabe
		topPanel.add(label1);//adiciona a instancia anterior ao painel
		topPanel.add(textField1);//Adiciona o campo de texto criado anteriormente
		
		
		JButton button1 = new JButton("Button 1");//atribuição de nome para nossos botões
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
		JPanel buttonPanel = new JPanel(); // adição de "Botão" no painel
		buttonPanel.setLayout(new FlowLayout());//gerenciador de layout do painel, onde chamamos para add o botão
		buttonPanel.add(button1);//adição de botões
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		
		frame.add(topPanel, BorderLayout.NORTH);//irá adicionar o painel a parte norte da tela
		frame.add(buttonPanel, BorderLayout.CENTER);//irá adicionar o botão ao centro do painel
		
		frame.setVisible(true);//comando final para exibir a tela ao ussuário

	}

}
