package classes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import repositorios.bean.TimeBean;
import repositorios.dao.TimeDAO;

public class Time extends JFrame{
	
	private String NomeDoTime;
	private int Gols;
	private boolean Visitante;
	
	public String getNomeDoTime()
    {
        return NomeDoTime;
    }

    public void setNomeDoTime(String NomeDoTime)
    {
        this.NomeDoTime = NomeDoTime;
    }
    
	public int getGols ()
    {
        return Gols;
    }

    public void setGols(int Gols)
    {
        this.Gols = Gols;
    }
    
    public boolean getVisitante ()
    {
        return Visitante;
    }

    public void setVisitante(boolean Visitante)
    {
        this.Visitante = Visitante;
    }
	
	
	
	
	JLabel lblTitulo, lblNomeTime, lblCidade;
	JTextField txtNome, txtCidade;
	JButton btnCadastrar, btnAtletas,btnVoltar;
	
	public Time() {
		super("Cadastro de Times");
		Container tela = getContentPane();
		setLayout(null);
		
		lblTitulo = new JLabel ("--Cadastro de Times--");
		lblNomeTime = new JLabel ("Nome do Time:");
		lblCidade = new JLabel ("Cidade do Time:");
		
		txtNome = new JTextField (50);
		txtCidade = new JTextField (50);
		
		btnCadastrar = new JButton ("Cadastrar");
		btnAtletas = new JButton ("Cadastrar Jogador");
		btnVoltar = new JButton ("Voltar");
		
		lblTitulo.setFont(new Font("Arial",Font.BOLD,18));
		lblNomeTime.setFont(new Font("Arial",Font.BOLD,14));
		lblCidade.setFont(new Font("Arial",Font.BOLD,14));
		
		lblTitulo.setForeground(Color.WHITE);
		lblNomeTime.setForeground(Color.WHITE);
		lblCidade.setForeground(Color.WHITE);
		
		lblTitulo.setBounds(200,5,250,50);
		lblNomeTime.setBounds(30,70,150,20);
		lblCidade.setBounds(30,102,150,20);
		
		txtNome.setBounds(150,70,250,25);
		txtCidade.setBounds(150,100,250,25);
		
		btnCadastrar.setBounds(100,170,100,25);
		btnAtletas.setBounds(210,170,150,25);
		btnVoltar.setBounds(370,170,100,25);
		
		btnCadastrar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						
							TimeBean tm = new TimeBean();
							TimeDAO dao = new TimeDAO();
								
							tm.setNmTime(txtNome.getText());
							tm.setCidade(txtCidade.getText());
							dao.create(tm);
								
							JOptionPane.showMessageDialog(null,"Time Cadastrado!");
					
							txtNome.setText(null);
							txtCidade.setText(null);
					}
				}
			);
		
		btnAtletas.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
			
						CadJogador jogador = new CadJogador();
					}
				}
			);
		
		btnVoltar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				}
			);
		
		tela.add(lblTitulo);
		tela.add(lblNomeTime);
		tela.add(lblCidade);
		
		tela.add(txtNome);
		tela.add(txtCidade);
		
		tela.add(btnCadastrar);
		tela.add(btnAtletas);
		tela.add(btnVoltar);

		JDesktopPane desk = new JDesktopPane(){
	          Image im = (new ImageIcon("tim.jpg")).getImage(); 
	          public void paintComponent(Graphics g){        
	           g.drawImage(im,0,0,this);            }
	                                      };
	        tela.add(desk);
	        JLabel status = new JLabel();
	            status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	            status.setBounds(0, 0, 580, 250);
	            status.setIcon(new ImageIcon("tim.jpg"));
	            tela.add(status);
		
		setSize(580,270);
		setVisible(true);
		setLocationRelativeTo(null);
		//setResizable(false);
	}
	
}