import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
public class Dois extends JFrame{
JLabel nome, end, cid, est,titulo;
JTextField Nome, End, Cid, Est;
JButton ins,cons,fec;
JTable tabela;
String[] coluna = {"Ttile 1","Title 2","Title 3","Title 4"};
String  produtos[][] = {{""},{""},{""},{""} };

public Dois() {
	super("Revisão 2");
	Container tela = getContentPane();
	setLayout(null);
	
	titulo = new JLabel("Cadastro de Clientes");
	nome = new JLabel("Nome");
	end = new JLabel("Endereço");
	cid = new JLabel("Cidade");
	est = new JLabel("Estado");
	
	Nome = new JTextField ();
	End = new JTextField ();
	Cid = new JTextField ();
	Est = new JTextField ();
	
	ins = new JButton("Inserir");
	cons = new JButton("Consulta");
	fec = new JButton("Fechar");
	
	
	titulo.setBounds(100,10,200,50);
	
	nome.setBounds(20,50,200,50);
	end.setBounds(20,80,200,50);
	cid.setBounds(20,110,200,50);
	est.setBounds(20,140,200,50);
	Nome.setBounds(70,65,300,20);
	End.setBounds(80,95,290,20);
	Cid.setBounds(70,125,300,20);
	Est.setBounds(70,155,300,20);
	
	
	ins.setBounds(20,300,90,20);
	cons.setBounds(150,300,90,20);
	fec.setBounds(280,300,90,20);
	
	
	titulo.setFont(new Font("Times New Roman",Font.BOLD,18));
	
	tabela = new JTable();
	tabela.setModel(new DefaultTableModel(produtos,coluna));
    JScrollPane Barra = new JScrollPane(tabela);
    
    Barra.setBounds(20,180,350,100);
	
	tela.add(titulo);
	tela.add(nome);
	tela.add(Nome);
	tela.add(end);
	tela.add(End);
	tela.add(cid);
	tela.add(Cid);
	tela.add(est);
	tela.add(Est);
	tela.add(ins);
	tela.add(cons);
	tela.add(fec);
	tela.add(Barra);
	
	setVisible(true);
	setSize(400,400);
	
}
public static void main (String[] args) {
	Dois app = new Dois();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
