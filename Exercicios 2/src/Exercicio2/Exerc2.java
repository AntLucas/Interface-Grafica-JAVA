package Exercicio2;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class Exerc2 extends JFrame{
	JButton botao1,botao2,botao3,cadastro;
	JLabel rotulocod,rotulonome,rotulocpf,rotulotel,rotulologra,rotulonum,rotulobairro,rotulocidade,rotuloestado;
	MaskFormatter maskcpf,masktel;
	JFormattedTextField cod,nome,cpf,tel,logra,num,bairro,cidade,estado; 
public Exerc2() {
	super("Exercicio 2");
	Container tela = getContentPane();
	setLayout(null);
	
	
	cadastro = new JButton("Cadastro Cliente");
	botao1 = new JButton("Buscar");
	botao2 = new JButton("Limpar");
	botao3 = new JButton("Inserir");
	
	cod = new JFormattedTextField();
	nome = new JFormattedTextField();
	logra = new JFormattedTextField();
	num = new JFormattedTextField();
	bairro = new JFormattedTextField();
	cidade = new JFormattedTextField();
	estado = new JFormattedTextField();
	 
	
	
	rotulocod = new JLabel("Código:");
	rotulonome = new JLabel("Nome:");
	rotulocpf = new JLabel("CPF:");
	rotulotel = new JLabel("Telefone:");
	rotulologra = new JLabel("Logradouro:");
	rotulonum = new JLabel("Nº:");
	rotulobairro = new JLabel("Bairro:");
	rotulocidade = new JLabel("Cidade:");
	rotuloestado = new JLabel("Estado:");
	
	cadastro.setBounds(10,10,558,20);
	botao1.setBounds(10,320,75,20);
	botao2.setBounds(420,320,75,20);
	botao3.setBounds(502,320,75,20);
	
	cadastro.setFont(new Font("Times New Roman",Font.BOLD,14));
	cadastro.setBackground(Color.LIGHT_GRAY);
	
	rotulocod.setBounds(10,60,100,20);
	rotulonome.setBounds(10,100,100,20);
	rotulocpf.setBounds(10,140,100,20);
	rotulotel.setBounds(250,140,100,20);
	rotulologra.setBounds(10,200,100,20);
	rotulonum.setBounds(515,200,100,20);
	rotulobairro.setBounds(10,240,100,20);
	rotulocidade.setBounds(10,280,100,20);
	rotuloestado.setBounds(408,280,100,20);
	
	try {
		maskcpf = new MaskFormatter("#########-##");
		masktel = new MaskFormatter("(##)####-####");
		
		maskcpf.setPlaceholderCharacter('_');
		masktel.setPlaceholderCharacter('_');
	}
	catch(ParseException excp) {
		
	}
	
	cpf = new JFormattedTextField(maskcpf);
	tel = new JFormattedTextField(masktel);
	
	cod.setBounds(70,60,100,20);
	nome.setBounds(70,100,508,20);
	cpf.setBounds(70,140,87,20);
	tel.setBounds(320,140,90,20);
	logra.setBounds(100,200,400,20);
	num.setBounds(542,200,35,20);
	bairro.setBounds(70,240,400,20);
	cidade.setBounds(70,280,330,20);
	estado.setBounds(458,280,120,20);
	
	
	rotulocpf.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotulonome.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotulotel.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotulologra.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotulobairro.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotulocidade.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotuloestado.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotulonum.setFont(new Font("Times New Roman",Font.BOLD,14));
	rotulocod.setFont(new Font("Times New Roman",Font.BOLD,14));
	
	
	cod.setFont(new Font("Times New Roman",Font.BOLD,14));
	nome.setFont(new Font("Times New Roman",Font.BOLD,14));
	tel.setFont(new Font("Times New Roman",Font.BOLD,14));
	cpf.setFont(new Font("Times New Roman",Font.BOLD,14));
	logra.setFont(new Font("Times New Roman",Font.BOLD,14));
	cidade.setFont(new Font("Times New Roman",Font.BOLD,14));
	num.setFont(new Font("Times New Roman",Font.BOLD,14));
	estado.setFont(new Font("Times New Roman",Font.BOLD,14));
	bairro.setFont(new Font("Times New Roman",Font.BOLD,14));
	
	
	

	
	
	tela.add(cadastro);
	tela.add(rotulocod);
	tela.add(rotulonome);
	tela.add(rotulocpf);
	tela.add(rotulotel);
	tela.add(rotulologra);
	tela.add(rotulonum);
	tela.add(rotulobairro);
	tela.add(rotulocidade);
	tela.add(rotuloestado);
	tela.add(cod);
	tela.add(nome);
	tela.add(cpf);
	tela.add(tel);
	tela.add(logra);
	tela.add(num);
	tela.add(bairro);
	tela.add(cidade);
	tela.add(estado);
	tela.add(botao1);
	tela.add(botao2);
	tela.add(botao3);
	
	setSize(600,400);
	setVisible(true);
}
public static void main(String args[]) {
	Exerc2 app = new Exerc2();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
