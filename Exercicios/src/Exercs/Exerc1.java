package Exercs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exerc1 extends JFrame{
	JLabel valorA,valorB,valorC,form,formula,x1,x2;
	JButton calcular;
	JTextField valA,valB,valC,xUm,xDois;
	
	public Exerc1(){
		super("Fórmula de Bhaskara");
		Container tela = getContentPane();
		
		valorA = new JLabel("Valor de A: ");
		valorB = new JLabel("Valor de B: ");
		valorC = new JLabel("Valor de C: ");
		form = new JLabel("Fórmula de Bhaskara");
		formula = new JLabel("ax² + bx + c = 0");
		x1 = new JLabel("x¹: ");
		x2 = new JLabel("x²: ");
		
		
		calcular = new JButton("Calcular");
		
		valA = new JTextField();
		valB = new JTextField();
		valC = new JTextField();
		xUm = new JTextField();
		xDois = new JTextField();
		
		setLayout(null);
		
		form.setBounds(50,5,200,30);
		formula.setBounds(70,20,100,30);
		valorA.setBounds(30,50,100,30);
		valorB.setBounds(30,80,100,30);
		valorC.setBounds(30,110,100,30);
		x1.setBounds(75,170,100,30);
		x2.setBounds(75,200,100,30);	
		calcular.setBounds(30,145,170,20);
		
		valA.setBounds(100,55,100,20);
		valB.setBounds(100,85,100,20);
		valC.setBounds(100,115,100,20);
		xUm.setBounds(100,175,100,20);
		xDois.setBounds(100,205,100,20);
		
		
		calcular.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						double vA,vB,vC,res1=0,res2=0 ,delta;
						
						vA = Double.parseDouble(valA.getText());
						vB = Double.parseDouble(valB.getText());
						vC = Double.parseDouble(valC.getText());
						
						delta = Math.pow(vB, 2) - 4*vA*vB;
						
						res1 = (-vB+ Math.sqrt(delta))/2*vA;
						res2 = (-vB- Math.sqrt(delta))/2*vA;
						
						xUm.setVisible(true);
						xUm.setText(""+res1);
						
						xDois.setVisible(true);
						xDois.setText(""+res2);
					}
				}
				);
		
		tela.add(form);
		tela.add(formula);
		tela.add(valA);
		tela.add(valB);
		tela.add(valC);
		tela.add(valorA);
		tela.add(valorB);
		tela.add(valorC);
		tela.add(calcular);
		tela.add(xUm);
		tela.add(xDois);
		tela.add(x1);
		tela.add(x2);
		
	
		setVisible(true);
		setSize(250,300);
	}
	public static void main(String[]args) {
		Exerc1 app = new Exerc1();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
