package classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import repositorios.bean.BatedorBean;
import repositorios.bean.GoleiroBean;
import repositorios.dao.BatedorDAO;
import repositorios.dao.GoleiroDAO;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class CadJogador extends JFrame {
	
	JLabel lblTitulo,lblNome,lblNasc,lblNatural,lblNacio,lblPosicao, lblIdTime;
	JTextField txtNome,txtNatural,txtNacio, txtIdTime;
	JButton botaoLimpar,botaoVoltar,botaoCadastrar,botaoDeletar;
	JTable tabela;
	JComboBox lista;
	String posicao[] = {"Goleiro", "Batedor"};
	String[] coluna = {"Nome","Idade","Natural","Nacionalidade","Posição"};
    Object[][][] dados = {};
    JFormattedTextField txtNasc;
	MaskFormatter mascaranasc;	
	
	public CadJogador(){
		super("Cadastro de Jogador");
		Container tela = getContentPane();
		setLayout(null);		
		
		lblTitulo = new JLabel ("Cadastro de Jogador");
		lblNome = new JLabel ("Nome:");
		lblNasc = new JLabel ("Nascimento:");
		lblNatural = new JLabel ("Natural De:");
		lblNacio = new JLabel ("Nacionalidade: ");
		lblPosicao = new JLabel ("Posição: ");
		lblIdTime = new JLabel ("Id do Time:");
		
		txtNome = new JTextField ();
		txtNasc = new JFormattedTextField ();
		txtNatural = new JTextField ();
		txtNacio = new JTextField ();
		txtIdTime = new JTextField();
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(dados,coluna));
		
		lista= new JComboBox(posicao);
		lista.setMaximumRowCount(10);
		lista.setSelectedItem(null);
		
		JScrollPane barra = new JScrollPane(tabela);
		
		try {
			mascaranasc = new MaskFormatter("##/##/####");
			
			mascaranasc.setPlaceholderCharacter('_');
		
		}
		catch(ParseException excp) {}
		
		txtNasc = new JFormattedTextField(mascaranasc);
		
		
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		lblNome.setFont(new Font("Arial", Font.BOLD, 14)); 
		lblNasc.setFont(new Font("Arial", Font.BOLD, 14));
		lblNatural.setFont(new Font("Arial", Font.BOLD, 14));
		lblNacio.setFont(new Font("Arial", Font.BOLD, 14));
		lblPosicao.setFont(new Font("Arial", Font.BOLD, 14));
		lblIdTime.setFont(new Font("Arial", Font.BOLD, 14));
		
		lblTitulo.setForeground(Color.WHITE);
		lblNome.setForeground(Color.WHITE);
		lblNasc.setForeground(Color.WHITE);
		lblNatural.setForeground(Color.WHITE);
		lblNacio.setForeground(Color.WHITE);
		lblPosicao.setForeground(Color.WHITE);
		lblIdTime.setForeground(Color.WHITE);
	
		botaoVoltar = new JButton ("Voltar");
		botaoLimpar = new JButton ("Limpar");
		botaoCadastrar = new JButton ("Cadastrar");
		botaoDeletar = new JButton("Deletar");
		
		lblTitulo.setBounds(240, 10, 290, 20);
		lblNome.setBounds(30, 35, 300, 20);
		lblNasc.setBounds(30, 65, 300, 20);
		lblNatural.setBounds(30, 95, 300, 20);
		lblNacio.setBounds(30, 125, 300, 20);
		lblPosicao.setBounds(30, 155, 300, 20);
		lblIdTime.setBounds(410,35,90,20);
		
		txtNome.setBounds(90, 35, 300, 20);
		txtNasc.setBounds(130, 65, 70, 20);
		txtNatural.setBounds(120, 95, 320, 20); 
		txtNacio.setBounds(140, 125, 300, 20);
		txtIdTime.setBounds(490,35,80,20);
		
		botaoLimpar.setBounds(340, 405, 100, 25);
		botaoLimpar.setMargin(new Insets(1,1,1,1));
		
		botaoVoltar.setBounds(450, 405, 100, 25);
		botaoVoltar.setMargin(new Insets(1,1,1,1));
		
		botaoCadastrar.setBounds(120,405, 100, 25);
		botaoCadastrar.setMargin(new Insets(1,1,1,1));
		
		botaoDeletar.setBounds(230,405,100,25);
		botaoDeletar.setMargin(new Insets(1,1,1,1));
		
		lista.setBounds(100,155,120,23);
		barra.setBounds(10,195,530,200);
	 
		botaoCadastrar.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e) {
							
							DefaultTableModel model = (DefaultTableModel) tabela.getModel();
			                
							String nome = txtNome.getText();
							String idade = txtNasc.getText();
							String natural = txtNatural.getText();
						    String Nacio = txtNacio.getText(); 
			                Object posicao = lista.getSelectedItem(); 
			                
			                Object[] linha = new String[]{nome,idade,natural,Nacio, (String) posicao};
			                model.addRow(linha);
							
			                String x = lista.getSelectedItem().toString();
			                if(x == "Batedor") {
							
			                	BatedorBean bb = new BatedorBean();
			                	BatedorDAO dao = new BatedorDAO();
			                	
			                	bb.setIdTime(Integer.parseInt(txtIdTime.getText()));
			                	bb.setNmBatedor(txtNome.getText());
			                	bb.setNascimento(txtNasc.getText());
			                	bb.setNaturalidade(txtNatural.getText());
			                	bb.setNacionalidade(txtNacio.getText());
			                	dao.create(bb);
			                	
			                	JOptionPane.showMessageDialog(null,"Batedor cadastrado!");
			                	
			                	txtNome.setText(null);
								txtNasc.setText(null);								
								txtNatural.setText(null);				                
								txtNacio.setText(null);
								lista.setSelectedItem(null);								
								txtNome.requestFocus();
								
								x = null;
			                }
			                
			                else {
			                	
			                	GoleiroBean gb = new GoleiroBean();
			                	GoleiroDAO dao = new GoleiroDAO();
			                	
			                	//bb.setIdTime(Integer.parseInt(txtIdTime.getText()));
			                	gb.setNmGoleiro(txtNome.getText());
			                	gb.setNascimento(txtNasc.getText());
			                	gb.setNaturalidade(txtNatural.getText());
			                	gb.setNacionalidade(txtNacio.getText());
			                	dao.create(gb);
			                	
			                	JOptionPane.showMessageDialog(null,"Goleiro cadastrado!");
			                	
			                	txtNome.setText(null);
								txtNasc.setText(null);								
								txtNatural.setText(null);				                
								txtNacio.setText(null);
								lista.setSelectedItem(null);								
								txtNome.requestFocus();
								
								x = null;
			                }
						} 
					}
				);
	       
	       botaoLimpar.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							txtNome.setText(null);
							txtNasc.setText(null);
							txtNatural.setText(null); 
							txtNacio.setText(null);
						}
					}
				
					);
	
		botaoVoltar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				}
			
			);
		
		botaoDeletar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						
						((DefaultTableModel) tabela.getModel()).removeRow(tabela.getSelectedRow());
						
						txtNome.requestFocus();
					} 
				}
			);
		
		tela.add(lblTitulo);
		tela.add(botaoLimpar);
		tela.add(botaoVoltar);
		tela.add(botaoCadastrar);
		tela.add(botaoDeletar);
		
		tela.add(lblNome); 
		tela.add(lblNasc);
		tela.add(lblNatural); 
		tela.add(lblNacio);
		tela.add(lblPosicao);
		tela.add(lblIdTime);
		
		tela.add(txtNome);
		tela.add(txtNasc);
		tela.add(txtNatural);
		tela.add(txtNacio);	
		tela.add(txtIdTime);
		
		tela.add(lista);
		tela.add(barra);
		
		JDesktopPane desk = new JDesktopPane(){
	          Image im = (new ImageIcon("futebol2.jpg")).getImage(); 
	          public void paintComponent(Graphics g){        
	           g.drawImage(im,0,0,this);            }
	                                      };
	        tela.add(desk);
	        JLabel status = new JLabel();
	            status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	            status.setBounds(0, 0, 710, 444);
	            status.setIcon(new ImageIcon("futebol2.jpg"));
	            tela.add(status);     

		setSize(710, 480);
		setVisible(true);
		setLocationRelativeTo(null);
		//setResizable(false);  
	} 
	public static void main(String[] args) {
			
			CadJogador app = new CadJogador();
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}