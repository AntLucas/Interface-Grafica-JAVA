import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculadoraS extends JFrame{
	JLabel rotulo1,rotulo2,exibir;
	JTextField texto1,texto2;
	JButton somar,subt,mult,div;
	
	public CalculadoraS() {
		super("Exemplo de soma");
		Container tela = getContentPane();
		setLayout(null);
		rotulo1 = new JLabel("1º  Número: ");
		rotulo2 = new JLabel("2º Número: ");
		texto1 = new JTextField(10);
		texto2 = new JTextField(10);
		exibir = new JLabel("");
		somar = new JButton("Somar");
		subt = new JButton("Subtrair");
		mult = new JButton("Multiplicar");
		div = new JButton("Dividir");
		
		rotulo1.setBounds(50,20,100,20);
		rotulo2.setBounds(50,60,100,20);
		texto1.setBounds(120,20,100,20);
		texto2.setBounds(120,60,100,20);
		exibir.setBounds(50,160,200,20);
		somar.setBounds(50,100,100,20);
		subt.setBounds(200,100,100,20);
		mult.setBounds(50,140,100,20);
		div.setBounds(200,140,100,20);
		
		somar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double numero1,numero2,soma;
						soma = 0;
						numero1=Double.parseDouble(texto1.getText());
						numero2 = Double.parseDouble(texto2.getText());
						soma = numero1+numero2;
						exibir.setVisible(true);
						exibir.setText("A soma é: "+soma);
					}
				}
				);
		
		subt.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int numero1,numero2,subt;
						subt = 0;
						numero1=Integer.parseInt(texto1.getText());
						numero2 = Integer.parseInt(texto2.getText());
						subt = numero1-numero2;
						exibir.setVisible(true);
						exibir.setText("A subtração é: "+subt);
					}
				}
				);
		
		mult.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double numero1,numero2,mult;
						mult = 0;
						numero1=Double.parseDouble(texto1.getText());
						numero2 = Double.parseDouble(texto2.getText());
						mult = numero1*numero2;
						exibir.setVisible(true);
						exibir.setText("A multiplicação é: "+mult);
					}
				}
				);
		
		div.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double numero1,numero2,div;
						div = 0;
						numero1=Double.parseDouble(texto1.getText());
						numero2 = Double.parseDouble(texto2.getText());
						div = numero1/numero2;
						if(numero2 ==0) {
							exibir.setVisible(true);
							exibir.setText("Não existe número divisivel por 0");
						}
						else {
						exibir.setVisible(true);
						exibir.setText("A divisão é: "+div);
						}
					}
				}
				);
		
		exibir.setVisible(false);
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(texto1);
		tela.add(texto2);
		tela.add(exibir);
		tela.add(somar);
		tela.add(subt);
		tela.add(mult);
		tela.add(div);
		
		setSize(360,220);
		setVisible(true);
	}
	public static void main(String args[]) {
		CalculadoraS app = new CalculadoraS();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
