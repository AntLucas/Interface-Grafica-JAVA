import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.text.MaskFormatter;
public class um extends JFrame{
	JLabel nome, curso, disciplina, comentarios,titulo;
	JFormattedTextField Nome,Curso,Disciplina,Comentarios;
	MaskFormatter maskNome,maskCurso,maskDisciplina;
	
	public um() {
		super("Revisão 1");
		Container tela = getContentPane();
		setLayout(null);
		
		nome = new JLabel("Nome do Aluno:");
		curso = new JLabel("Curso:");
		disciplina = new JLabel("Disciplina:");
		comentarios = new JLabel("Comentários:");
		titulo = new JLabel("Matrícula em Disciplina:");
		
		try {
			maskNome = new MaskFormatter("Digite o seu nome!");
			maskCurso = new MaskFormatter("Sistemas de informação");
			maskDisciplina = new MaskFormatter("Linguagens e Técnicas de Programação");
			
		
		
		}
		catch(ParseException excp) {}
		
		Nome = new JFormattedTextField(maskNome);
		Curso = new JFormattedTextField(maskCurso);
		Disciplina = new JFormattedTextField(maskDisciplina);
		Comentarios = new JFormattedTextField();
		
		titulo.setBounds(100,10,200,50);
		nome.setBounds(20,50,200,50);
		curso.setBounds(20,80,200,50);
		disciplina.setBounds(20,110,200,50);
		comentarios.setBounds(40,170,200,50);
		Nome.setBounds(120,65,200,20);
		Curso.setBounds(70,95,250,20);
		Disciplina.setBounds(85,125,235,20);
		Comentarios.setBounds(40,215,250,80);
		
		
		titulo.setFont(new Font("Times New Roman",Font.BOLD,18));
		
		titulo.setForeground(Color.BLUE);
		
		Nome.setForeground(Color.BLUE);
		Curso.setForeground(Color.BLUE);
		Disciplina.setForeground(Color.BLUE);
		Comentarios.setForeground(Color.BLUE);
		
		tela.add(comentarios);
		JPanel Painel = new JPanel();
		Painel.setBounds(20,180,300,120);
		Painel.setBackground(Color.yellow);
		tela.add(Painel);
		
		
		tela.add(titulo);
		tela.add(nome);
		tela.add(Nome);
		tela.add(curso);
		tela.add(Curso);
		tela.add(disciplina);
		tela.add(Disciplina);
		tela.add(Comentarios);
		
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String[] args) {
		um app = new um();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
