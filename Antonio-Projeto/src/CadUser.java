	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.JOptionPane.*;
	import java.text.*;
	import java.util.*;
	import javax.swing.text.*;
	import javax.swing.Timer;
	import java.text.DecimalFormat;
public class CadUser extends JFrame{
	//atributos
	JLabel sist,login,nome,sobrenome,email,senha,repita;
	JFormattedTextField Login,Nome,Sobrenome,Email;
	JPasswordField Senha,Repita;
	JButton Cadas,Limpar;
	JLabel rotuloHora;
	int hh,mm,ss,m;
	Calendar hora;
	DecimalFormat formato;
	JMenu opcoes,telas;
	JMenuItem SistCad,sair,CadCli,CadForn,CadProd;
	JMenuBar barra;
	ImageIcon limp,cads;
	
	public CadUser() {
		super("Cadastro de Usuário");
		Container tela = getContentPane();
		setLayout(null);
		
		limp = new ImageIcon("limpar.png");
		cads = new ImageIcon("cadastrar.png");
		
		//horas
		
				rotuloHora = new JLabel("");

				rotuloHora.setBounds(30,280,280,20);
				ActionListener tarefa = (new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						HORAS();
					}
				});
				javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
				time.start();
				tela.add(rotuloHora);
				
				//menu
				barra = new JMenuBar();
				setJMenuBar(barra);
				opcoes = new JMenu("Opções");
				barra.add(opcoes);
				telas = new JMenu("Telas");
				SistCad = new JMenuItem("Tela Inicial");
				sair = new JMenuItem("sair");
				CadCli = new JMenuItem("Cadastro de Clientes");
				CadForn = new JMenuItem("Cadastro de Fornecedores");
				CadProd = new JMenuItem("Cadastro de Produtos");
				
				telas.setMnemonic(KeyEvent.VK_T);
				opcoes.setMnemonic(KeyEvent.VK_O);
				sair.setMnemonic(KeyEvent.VK_S);
				SistCad.setMnemonic(KeyEvent.VK_I);
				CadCli.setMnemonic(KeyEvent.VK_C);
				CadForn.setMnemonic(KeyEvent.VK_F);
				CadProd.setMnemonic(KeyEvent.VK_P);
				
				
				opcoes.add(telas);
				telas.add(SistCad);
				telas.add(CadCli);
				telas.add(CadForn);
				telas.add(CadProd);
				opcoes.add(sair);
				
				sair.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								setVisible(false);
							}
						}
						);
				
				SistCad.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								SistCad app5 = new SistCad();
								
								app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								dispose();
								
							}
						}
						);
				
				CadCli.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CadCli app5 = new CadCli();
								
								app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								dispose();
								
							}
						}
						);
				CadForn.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CadForn app5 = new CadForn();
								
								app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								dispose();
								
							}
						}
						);
				CadProd.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CadProd app5 = new CadProd();
								
								app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								dispose();
								
							}
						}
						);
		
		//instanciando objetos
		sist = new JLabel("Cadastro Usuário");
		login = new JLabel("Login:");
		nome = new JLabel("Nome:");
		sobrenome = new JLabel("Sobrenome:");
		email = new JLabel("Email:");
		senha = new JLabel("Senha:");
		repita = new JLabel("Repita a Senha:");
		
		Login = new JFormattedTextField();
		Nome = new JFormattedTextField();
		Sobrenome = new JFormattedTextField();
		Email = new JFormattedTextField();
		
		Senha = new JPasswordField();
		Repita = new JPasswordField();
		
		
		Cadas = new JButton("Cadastrar",cads);
		Limpar = new JButton("Limpar",limp);
		
		
		//definindo as posições e dimensões
		sist.setBounds(100,10,200,20);
		login.setBounds(85,30,120,30);
		nome.setBounds(85,60,100,30);
		sobrenome.setBounds(50,90,100,30);
		email.setBounds(85,120,100,30);
		senha.setBounds(83,150,100,30);
		repita.setBounds(25,180,200,30);
		
		
		Login.setBounds(130,35,150,20);
		Nome.setBounds(130,65,150,20);
		Sobrenome.setBounds(130,95,150,20);
		Email.setBounds(130,125,150,20);
		Senha.setBounds(130,155,150,20);
		Repita.setBounds(130,185,150,20);
		
	
		Cadas.setBounds(170,230,130,20);
		Limpar.setBounds(30,230,120,20);
		
		
		//cores e fontes

		tela.setBackground(Color.WHITE);
		
		sist.setFont(new Font("Times New Roman",Font.BOLD,20));
		login.setFont(new Font("Times New Roman",Font.BOLD,15));
		nome.setFont(new Font("Times New Roman",Font.BOLD,15));
		sobrenome.setFont(new Font("Times New Roman",Font.BOLD,15));
		email.setFont(new Font("Times New Roman",Font.BOLD,15));
		senha.setFont(new Font("Times New Roman",Font.BOLD,15));
		repita.setFont(new Font("Times New Roman",Font.BOLD,15));
		
		Login.setFont(new Font("Times New Roman",Font.BOLD,14));
		Nome.setFont(new Font("Times New Roman",Font.BOLD,14));
		Sobrenome.setFont(new Font("Times New Roman",Font.BOLD,14));
		Email.setFont(new Font("Times New Roman",Font.BOLD,14));
		Senha.setFont(new Font("Times New Roman",Font.BOLD,14));
		Repita.setFont(new Font("Times New Roman",Font.BOLD,14));
		
		
		Cadas.setFont(new Font("Times New Roman",Font.BOLD,14));
		Limpar.setFont(new Font("Times New Roman",Font.BOLD,14));
		SistCad.setFont(new Font("Times New Roman",Font.BOLD,14));
		
		rotuloHora.setForeground(Color.WHITE);
		sist.setForeground(Color.WHITE);
		login.setForeground(Color.WHITE);
		nome.setForeground(Color.WHITE);
		sobrenome.setForeground(Color.WHITE);
		email.setForeground(Color.WHITE);
		senha.setForeground(Color.WHITE);
		repita.setForeground(Color.WHITE);
		
		Cadas.setBackground(Color.WHITE);
		Limpar.setBackground(Color.WHITE);
		
		
		//ações dos botões
	
		
		Cadas.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						/*if(Nome.getText() == null || Cpf.getText() == null || Tel.getText() == null || 
						Cep.getText() == null || End.getText() == null || Email.getText() == null) {
							JOptionPane.showMessageDialog(null, "Erro de Cadastro.\nÉ necessario preencher todos os campos.");
						}
						else {*/
					
						JOptionPane.showMessageDialog(null,"Cadastrado com sucesso. \nDados:"
								+ "\nNome: "+Nome.getText()+"\nLogin: "+Login.getText()+"\nEmail: "+Email.getText()/*+
										"\nSenha: "+Senha.getText()*/);;
						//}
						
					}
				}
				);
		Limpar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					Login.setText(null);
					Nome.setText(null);
					Senha.setText(null);
					Repita.setText(null);
					Sobrenome.setText(null);
					Email.setText(null);
						
					}
				}
				);
	
		
		
		
		//adicionando na tela
		
		tela.add(login);
		tela.add(Login);
		tela.add(nome);
		tela.add(Nome);
		tela.add(Sobrenome);
		tela.add(sobrenome);
		tela.add(email);
		tela.add(Email);
		tela.add(senha);
		tela.add(Senha);
		tela.add(repita);
		tela.add(Repita);
		
		tela.add(Cadas);
		tela.add(Limpar);
		
		tela.add(sist);
		
		JDesktopPane desk = new JDesktopPane(){
	        Image im = (new ImageIcon("blj.png")).getImage(); 
	        public void paintComponent(Graphics g){        
	         g.drawImage(im,0,0,this);            }
	                                    };
	      tela.add(desk);
	      JLabel status = new JLabel();
	          status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	          status.setBounds(1, 1,340, 340);
	          status.setIcon(new ImageIcon("blj.png"));
	          tela.add(status);
	 		 setUndecorated(true);

		setVisible(true);
		setSize(340,340);

		setLocationRelativeTo(null);
		
	}

private void HORAS(){
	hora = Calendar.getInstance();
	hh = hora.get(Calendar.HOUR_OF_DAY);
	mm = hora.get(Calendar.MINUTE);
	ss = hora.get(Calendar.SECOND);
	formato = new DecimalFormat("00");
	rotuloHora.setText("Hora: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
}

private String formatar(int num){
	formato = new DecimalFormat("00");
	return formato.format(num);
}
}

