package Exercicio1;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;

public class Exerc1 extends JFrame {
JTextField visor;
JLabel exibir,editar,ajuda;
JButton mc,mr,ms,mmais,mmenos,seta,ce,c;
JButton raiz,div,porc,mult,menos,mais,igual,virgula,maismenos,umx;
JButton zero,um,dois,tres,quatro,cinco,seis,sete,oito,nove;

public Exerc1() {
	super("Calculadora");
	
	Container tela = getContentPane();
	setLayout(null);
	
	exibir = new JLabel("Exibir");
	editar = new JLabel("Editar");
	ajuda = new JLabel("Ajuda");
	
	
	visor = new JTextField("0");
	mc = new JButton("MC");
	mr = new JButton("MR");
	ms = new JButton("MS");
	mmais = new JButton("M+");
	mmenos = new JButton("M-");
	seta = new JButton("←");
	ce = new JButton("CE");
	c = new JButton("C");
	
	raiz = new JButton("√");
	div = new JButton("/");
	porc = new JButton("%");
	mult = new JButton("*");
	menos = new JButton("-");
	mais = new JButton("+");
	igual = new JButton("=");
	virgula = new JButton(",");
	maismenos = new JButton("±");
	umx = new JButton("1/x");
	
	zero = new JButton("0");
	um = new JButton("1");
	dois = new JButton("2");
	tres = new JButton("3");
	quatro = new JButton("4");
	cinco = new JButton("5");
	seis = new JButton("6");
	sete = new JButton("7");
	oito = new JButton("8");
	nove = new JButton("9");
	
	
	mc.setMargin(new Insets(1,1,1,1));
	mr.setMargin(new Insets(1,1,1,1));
	ms.setMargin(new Insets(1,1,1,1));
	mmais.setMargin(new Insets(1,1,1,1));
	mmenos.setMargin(new Insets(1,1,1,1));
	seta.setMargin(new Insets(1,1,1,1));
	ce.setMargin(new Insets(1,1,1,1));
	c.setMargin(new Insets(1,1,1,1));
	
	raiz.setMargin(new Insets(1,1,1,1));
	div.setMargin(new Insets(1,1,1,1));
	porc.setMargin(new Insets(1,1,1,1));
	mult.setMargin(new Insets(1,1,1,1));
	menos.setMargin(new Insets(1,1,1,1));
	mais.setMargin(new Insets(1,1,1,1));
	igual.setMargin(new Insets(1,1,1,1));
	virgula.setMargin(new Insets(1,1,1,1));
	maismenos.setMargin(new Insets(1,1,1,1));
	umx.setMargin(new Insets(1,1,1,1));
	
	zero.setMargin(new Insets(1,1,1,1));
	um.setMargin(new Insets(1,1,1,1));
	dois.setMargin(new Insets(1,1,1,1));
	tres.setMargin(new Insets(1,1,1,1));
	quatro.setMargin(new Insets(1,1,1,1));
	cinco.setMargin(new Insets(1,1,1,1));
	seis.setMargin(new Insets(1,1,1,1));
	sete.setMargin(new Insets(1,1,1,1));
	oito.setMargin(new Insets(1,1,1,1));
	nove.setMargin(new Insets(1,1,1,1));
	
	
	visor.setMargin(new Insets(1,150,1,1));
	
	mc.setBounds(16,70,30,30);
	mr.setBounds(51,70,30,30);
	ms.setBounds(86,70,30,30);
	mmais.setBounds(121,70,30,30);
	mmenos.setBounds(156,70,30,30);
	seta.setBounds(16,105,30,30);
	ce.setBounds(51,105,30,30);
	c.setBounds(86,105,30,30);
	
	
	raiz.setBounds(156,105,30,30);
	div.setBounds(121,140,30,30);
	porc.setBounds(156,140,30,30);
	mult.setBounds(121,175,30,30);
	menos.setBounds(121,210,30,30);
	mais.setBounds(121,245,30,30);
	igual.setBounds(156,210,30,65);
	virgula.setBounds(86,245,30,30);
	maismenos.setBounds(121,105,30,30);
	umx.setBounds(156,175,30,30);
	

	exibir.setBounds(16,1,50,20);
	editar.setBounds(66,1,50,20);
	ajuda.setBounds(116,1,50,20);
	
	exibir.setForeground(Color.GRAY);
	editar.setForeground(Color.GRAY);
	ajuda.setForeground(Color.GRAY);
	
	exibir.setFont(new Font("Arial",Font.BOLD,11));
	editar.setFont(new Font("Arial",Font.BOLD,11));
	ajuda.setFont(new Font("Arial",Font.BOLD,11));
	
	
	zero.setBounds(16,245,65,30);
	um.setBounds(16,210,30,30);
	dois.setBounds(51,210,30,30);
	tres.setBounds(86,210,30,30);
	quatro.setBounds(16,175,30,30);
	cinco.setBounds(51,175,30,30);
	seis.setBounds(86,175,30,30);
	sete.setBounds(16,140,30,30);
	oito.setBounds(51,140,30,30);
	nove.setBounds(86,140,30,30);
	
	visor.setFont(new Font("Arial",Font.BOLD,17));
	
	visor.setBounds(16,25,170,40);
	
	visor.setBackground(Color.white);
	

	
	tela.add(exibir);
	tela.add(editar);
	tela.add(ajuda);
	
	tela.add(visor);
	
	tela.add(mc);
	tela.add(mr);
	tela.add(ms);
	tela.add(mmais);
	tela.add(mmenos);
	tela.add(seta);
	tela.add(ce);
	tela.add(c);
	
	tela.add(raiz);
	tela.add(div);
	tela.add(porc);
	tela.add(mult);
	tela.add(menos);
	tela.add(mais);
	tela.add(igual);
	tela.add(virgula);
	tela.add(maismenos);
	tela.add(umx);
	
	tela.add(zero);
	tela.add(um);
	tela.add(dois);
	tela.add(tres);
	tela.add(quatro);
	tela.add(cinco);
	tela.add(seis);
	tela.add(sete);
	tela.add(oito);
	tela.add(nove);
	
	setSize(220,322);
	setVisible(true);
	
}
public static void main(String[] args) {
	Exerc1 app = new Exerc1();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
