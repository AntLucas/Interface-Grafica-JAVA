package Exercs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exerc2 extends JFrame{
 JLabel hip,cat1,cat2,form,formula;
 JTextField hipo,cate1,cate2;
 JButton calc;
 
 public Exerc2() {
	 setLayout(null);
	 Container tela = getContentPane();
	 
	 hip = new JLabel("Hipotenusa: ");
	 cat1 = new JLabel("Cateto 1: ");
	 cat2 = new JLabel("Cateto 2: ");
	 form = new JLabel("Teorema de Pitágoras");
	 formula = new JLabel("H² = C² + C²");
	 
	 hipo = new JTextField();
	 cate1 = new JTextField();
	 cate2 = new JTextField();
	 
	 calc = new JButton("Calcular");
	 
	 
	 form.setBounds(50,5,200,30);
	formula.setBounds(75,20,100,30);
	hip.setBounds(30,50,100,30);
	cat1.setBounds(30,80,100,30);
	cat2.setBounds(30,110,100,30);
	

	
	hipo.setBounds(100,55,100,20);
	cate1.setBounds(100,85,100,20);
	cate2.setBounds(100,115,100,20);

	calc.setBounds(30,145,170,20);
	
	
	calc.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				double x1,x2,x3;
				
				//x1 = Double.parseDouble(hipo.getText());
				x2 = Double.parseDouble(cate1.getText());
				x3 = Double.parseDouble(cate2.getText());
				
				x1 = Math.pow(x2, 2) + Math.pow(x3, 2);
				
				hipo.setVisible(true);
				hipo.setText(""+x1);
				}
			}
			);
	
	tela.add(form);
	tela.add(formula);
	tela.add(hip);
	tela.add(hipo);
	tela.add(cat1);
	tela.add(cate1);
	tela.add(cat2);
	tela.add(cate2);
	tela.add(calc);
	
	
	setVisible(true);
	setSize(250,300);
	
	
 }
 public static void main(String [] args) {
	 Exerc2 app = new Exerc2();
	 app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
