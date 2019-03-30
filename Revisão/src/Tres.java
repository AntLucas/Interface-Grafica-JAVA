import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
public class Tres extends JFrame{
JLabel cod,nome,end,bai,cid,est,cep,sex,cel,tel,datA,datC;
JFormattedTextField Cod,Nome,End,Bai,Cid,Cep,Cel,Tel,DatA,DatC;
JButton inc,limp,sair,cons,consT;
JMenu clientes,produtos,vendas,relatorios,ajuda;
MaskFormatter MaskCel,MaskTel,MaskDatC;
ImageIcon inclu,limpar,sai,consultar,consultarT;

JRadioButton homem,mulher;
ButtonGroup grupo;

JComboBox lis;
String cidade[] = {""};

public Tres() {
	super("Revisão 3");
	Container tela = getContentPane();
	setLayout(null);
	
	lis = new JComboBox(cidade);
	
	lis.setEditable(true);
	lis.setMaximumRowCount(5);
	lis.setBounds(200,175,200,20);
	
	
	homem = new JRadioButton("Masculino");
	mulher = new JRadioButton("Feminino");

	homem.setMnemonic(KeyEvent.VK_J);
	mulher.setMnemonic(KeyEvent.VK_C);

	grupo = new ButtonGroup();
	grupo.add(homem);
	grupo.add(mulher);
	
	homem.setBounds(300,230,100,20);
	mulher.setBounds(200,230,100,20);

	
	tela.add(homem);
	tela.add(mulher);
	
	
	JMenuBar barra = new JMenuBar();
	setJMenuBar(barra);
	
	
	clientes = new JMenu("Clientes");
	produtos = new JMenu("Produtos");
	vendas = new JMenu("Vendas");
	relatorios = new JMenu("Relatórios");
	ajuda = new JMenu("Ajuda");
	
	barra.add(clientes);
	barra.add(produtos);
	barra.add(vendas);
	barra.add(relatorios);
	barra.add(ajuda);
	
	
	cod = new JLabel("Código do cliente");
	nome = new JLabel("Nome completo");
	end = new JLabel("Endereço");
	bai = new JLabel("Bairro");
	cid = new JLabel("Cidade");
	est = new JLabel("Estado");
	cep = new JLabel("C.E.P.");
	sex = new JLabel("Sexo");
	tel = new JLabel("Telefone");
	datA = new JLabel("Data do Aniversário");
	datC = new JLabel("Data de Cadastro");
	cel = new JLabel("Celular");
	
	Cod = new JFormattedTextField();
	Nome = new JFormattedTextField();
	End = new JFormattedTextField();
	Bai = new JFormattedTextField();
	Cid = new JFormattedTextField();
	Cep = new JFormattedTextField();
	DatA = new JFormattedTextField();

	
	try {
		MaskCel = new MaskFormatter("(##).");
		MaskTel = new MaskFormatter("(##).");
		MaskDatC = new MaskFormatter("07/11/2008");
		
		
		
		MaskCel.setPlaceholderCharacter('X');
		MaskTel.setPlaceholderCharacter('X');
		MaskDatC.setPlaceholderCharacter('X');
	
	}
	catch(ParseException excp) {}
	
	Cel = new JFormattedTextField (MaskCel);
	Tel = new JFormattedTextField (MaskTel);
	DatC = new JFormattedTextField (MaskDatC);
			
	inclu = new ImageIcon("incluir.png");
	limpar = new ImageIcon("limpar.png");
	sai = new ImageIcon("sair.png");
	consultar = new ImageIcon("consultar.png");
	consultarT = new ImageIcon("consultarT.png");
	
	inc = new JButton("Incluir",inclu);
	limp = new JButton("Limpar",limpar);
	sair = new JButton("Sair",sai);
	cons = new JButton("Consultar",consultar);
	consT = new JButton("Consultar Todos",consultarT);
	
	cod.setBounds(20,20,100,20);
	nome.setBounds(20,50,100,20);
	end.setBounds(20,80,100,20);
	bai.setBounds(20,110,100,20);
	cid.setBounds(20,140,100,20);
	est.setBounds(20,170,100,20);
	cep.setBounds(20,200,100,20);
	sex.setBounds(20,230,100,20);
	cel.setBounds(20,260,100,20);
	tel.setBounds(20,290,100,20);
	datA.setBounds(20,320,150,20);
	datC.setBounds(20,350,100,20);
	
	Cod.setBounds(200,25,200,20);
	Nome.setBounds(200,55,200,20);
	End.setBounds(200,85,200,20);
	Bai.setBounds(200,115,200,20);
	Cid.setBounds(200,145,200,20);
	Cep.setBounds(200,205,200,20);
	Cel.setBounds(200,265,200,20);
	Tel.setBounds(200,295,200,20);
	DatA.setBounds(200,325,200,20);
	DatC.setBounds(200,355,200,20);
	
	inc.setBounds(20,380,150,20);
	limp.setBounds(180,380,160,20);
	sair.setBounds(350,380,150,20);
	cons.setBounds(20,410,150,20);
	consT.setBounds(180,410,160,20);
	
	
	tela.add(cod);
	tela.add(Cod);
	tela.add(nome);
	tela.add(Nome);
	tela.add(end);
	tela.add(End);
	tela.add(bai);
	tela.add(Bai);
	tela.add(cid);
	tela.add(Cid);
	tela.add(est);
	tela.add(cep);
	tela.add(Cep);
	tela.add(sex);
	tela.add(cel);
	tela.add(Cel);
	tela.add(Tel);
	tela.add(tel);
	tela.add(datA);
	tela.add(DatA);
	tela.add(datC);
	tela.add(DatC);
	tela.add(inc);
	tela.add(limp);
	tela.add(sair);
	tela.add(cons);
	tela.add(consT);
	tela.add(lis);
	
	setVisible(true);
	setSize(530,530);
}
public static void main (String[]args) {
	Tres app = new Tres();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
