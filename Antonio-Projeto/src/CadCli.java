	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.JOptionPane.*;
	import java.text.*;
	import java.util.*;
	import javax.swing.text.*;
	import javax.swing.Timer;
	import java.text.DecimalFormat;
public class CadCli extends JFrame{
	JLabel cpf,nome,end,tel,clie,cep,email;
	JFormattedTextField Cpf,Nome,End,Tel,Cep,Email;
	MaskFormatter maskCpf,maskTel,maskCep;
	JButton Cadas,Limpar;
	JRadioButton homem,mulher;
	JLabel escolha;
	ButtonGroup grupo;
	int hh,mm,ss,m;
	Calendar hora;
	DecimalFormat formato;
	JLabel rotuloHora;
	JMenu opcoes,telas;
	JMenuItem SistCad,sair,CadProd,CadForn,CadUser;
	JMenuBar barra;
	ImageIcon limp,cads;
	public CadCli() {
		
		super("CadCli");
		Container tela = getContentPane();
		setLayout(null);
		limp = new ImageIcon("limpar.png");
		cads = new ImageIcon("cadastrar.png");
		//horas
		
				rotuloHora = new JLabel("");

				rotuloHora.setBounds(30,400,280,20);
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
				CadProd = new JMenuItem("Cadastro de Produtos");
				CadForn = new JMenuItem("Cadastro de Fornecedores");
				CadUser = new JMenuItem("Cadastro de Usuários");
				
				telas.setMnemonic(KeyEvent.VK_T);
				opcoes.setMnemonic(KeyEvent.VK_O);
				sair.setMnemonic(KeyEvent.VK_S);
				SistCad.setMnemonic(KeyEvent.VK_I);
				CadProd.setMnemonic(KeyEvent.VK_P);
				CadForn.setMnemonic(KeyEvent.VK_F);
				CadUser.setMnemonic(KeyEvent.VK_U);
				
				
				opcoes.add(telas);
				telas.add(SistCad);
				telas.add(CadProd);
				telas.add(CadForn);
				telas.add(CadUser);
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
				
				CadProd.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CadProd app5 = new CadProd();
								
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
				CadUser.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CadUser app5 = new CadUser();
								
								app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								dispose();
								
							}
						}
						);
				
	//instanciando objetos
		
		
		escolha = new JLabel("Selecione o seu Sexo:");
		escolha.setBounds(30,250,200,20);
	
		homem = new JRadioButton("Masculino");
		mulher = new JRadioButton("Feminino");

		homem.setMnemonic(KeyEvent.VK_J);
		mulher.setMnemonic(KeyEvent.VK_C);

		grupo = new ButtonGroup();
		grupo.add(homem);
		grupo.add(mulher);
		
		homem.setBounds(30,280,100,20);
		mulher.setBounds(130,280,100,20);

		

	

		tela.add(escolha);
		tela.add(homem);
		tela.add(mulher);

		
	clie = new JLabel("Cadastro de Cliente");	
	cep = new JLabel("CEP:");
	email = new JLabel("E-Mail:");
	cpf = new JLabel("CPF: ");
	nome = new JLabel("Nome: ");
	end = new JLabel("Endereço: ");
	tel = new JLabel("Telefone: ");
	
	Cpf = new JFormattedTextField();
	Nome = new JFormattedTextField();
	End = new JFormattedTextField();
	Tel = new JFormattedTextField();
	Cep = new JFormattedTextField();
	Email = new JFormattedTextField();
	
	
	Cadas = new JButton("Cadastrar",cads);
	Limpar = new JButton("Limpar",limp);
	
	
	
	
	//mascaras
	try {
		maskCpf = new MaskFormatter("#########-##");
		maskTel = new MaskFormatter("(##)#####-####");
		maskCep = new MaskFormatter("#####-###");
		
		
		
		maskCpf.setPlaceholderCharacter('_');
		maskTel.setPlaceholderCharacter('_');
		maskCep.setPlaceholderCharacter('_');
	
	}
	catch(ParseException excp) {}
	
	Cpf = new JFormattedTextField (maskCpf);
	Tel = new JFormattedTextField (maskTel);
	Cep = new JFormattedTextField (maskCep);
	
	//definindo posições e dimensões
	
		clie.setBounds(30,20,200,20);
		cpf.setBounds(180,100,150,20);
		nome.setBounds(30,50,150,20);
		end.setBounds(30,200,150,20);
		tel.setBounds(30,100,150,20);
		email.setBounds(30,150,150,20);
		cep.setBounds(210,200,150,20);
		
		
		Cpf.setBounds(180,120,110,20);
		Nome.setBounds(30,70,260,20);
		End.setBounds(30,220,150,20);
		Tel.setBounds(30,120,110,20);
		Email.setBounds(30,170,260,20);
		Cep.setBounds(210,220,80,20);
		
		
		Cadas.setBounds(170,340,130,20);
		Limpar.setBounds(30,340,120,20);
		
	
	//definindo cores
	tela.setBackground(Color.WHITE);
	
	
	

	Cadas.setForeground(Color.BLACK);
	Limpar.setForeground(Color.BLACK);
	
	
	Cadas.setBackground(Color.WHITE);
	Limpar.setBackground(Color.WHITE);
	SistCad.setBackground(Color.WHITE);
	
	clie.setForeground(Color.WHITE);
	cpf.setForeground(Color.WHITE);
	nome.setForeground(Color.WHITE);
	tel.setForeground(Color.WHITE);
	end.setForeground(Color.WHITE);
	cep.setForeground(Color.WHITE);
	email.setForeground(Color.WHITE);
	escolha.setForeground(Color.WHITE);
	
	
	//definindo fontes
	
	clie.setFont(new Font("Times New Roman",Font.BOLD,20));
	
	cpf.setFont(new Font("Times New Roman",Font.BOLD,15));
	nome.setFont(new Font("Times New Roman",Font.BOLD,15));
	tel.setFont(new Font("Times New Roman",Font.BOLD,15));
	end.setFont(new Font("Times New Roman",Font.BOLD,15));
	cep.setFont(new Font("Times New Roman",Font.BOLD,15));
	email.setFont(new Font("Times New Roman",Font.BOLD,15));
	
	escolha.setFont(new Font("Times New Roman",Font.BOLD,15));
	homem.setFont(new Font("Times New Roman",Font.BOLD,15));
	mulher.setFont(new Font("Times New Roman",Font.BOLD,15));
	
	Cpf.setFont(new Font("Arial",Font.BOLD,14));
	Cep.setFont(new Font("Arial",Font.BOLD,14));
	Nome.setFont(new Font("Arial",Font.BOLD,14));
	Tel.setFont(new Font("Arial",Font.BOLD,14));
	End.setFont(new Font("Arial",Font.BOLD,14));
	Email.setFont(new Font("Arial",Font.BOLD,14));
	
	rotuloHora.setFont(new Font("Times New Roman",Font.BOLD,15));
	
	
	rotuloHora.setForeground(Color.WHITE);
	
	Cadas.setFont(new Font("Times New Roman",Font.BOLD,14));
	Limpar.setFont(new Font("Times New Roman",Font.BOLD,14));
	SistCad.setFont(new Font("Times New Roman",Font.BOLD,14));
	
	//ações dos botões

	Cadas.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					
					if(homem.isSelected()==true){ 
					JOptionPane.showMessageDialog(null,"Cadastrado com sucesso. \nDados:"
							+ "\nNome: "+Nome.getText()+"\nCpf: "+Cpf.getText()+"\nTelefone: "
									+ ""+Tel.getText()+"\nEndereço: "+End.getText()+"\nEmail: "+Email.getText()+
									"\nCep: "+Cep.getText()+"\nSexo: "+homem.getText());
				}
					else if(mulher.isSelected()==true){
						JOptionPane.showMessageDialog(null,"Cadastrado com sucesso. \nDados:"
								+ "\nNome: "+Nome.getText()+"\nCpf: "+Cpf.getText()+"\nTelefone: "
										+ ""+Tel.getText()+"\nEndereço: "+End.getText()+"\nEmail: "+Email.getText()+
										"\nCep: "+Cep.getText()+"\nSexo: "+mulher.getText());
					
					}
					else{
						JOptionPane.showMessageDialog(null,"Cadastrado com sucesso.\nDados:\n" + 
												"+ \nNome: "+Nome.getText()+"\nCpf: "+Cpf.getText()+"\nTelefone: " + 
												Tel.getText()+"\nEndereço: "+End.getText()+"\nEmail: "+Email.getText()+  
												"\nCep: "+Cep.getText()+"\nO sexo não foi selecionado");
					}
				}
			}
			);
	Limpar.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				Cpf.setText(null);
				Nome.setText(null);
				End.setText(null);
				Tel.setText(null);
				Cep.setText(null);
				Email.setText(null);
					
				}
			}
			);
	
		
	
	
	
	tela.add(cpf);
	tela.add(nome);
	tela.add(tel);
	tela.add(end);
	tela.add(Cpf);
	tela.add(Nome);
	tela.add(Tel);
	tela.add(End);
	
	tela.add(Cadas);
	tela.add(clie);
	tela.add(email);
	tela.add(Email);
	tela.add(cep);
	tela.add(Cep);
	tela.add(Limpar);
	
	JDesktopPane desk = new JDesktopPane(){
        Image im = (new ImageIcon("blj.png")).getImage(); 
        public void paintComponent(Graphics g){        
         g.drawImage(im,0,0,this);            }
                                    };
      tela.add(desk);
      JLabel status = new JLabel();
          status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
          status.setBounds(1, 1,350, 470);
          status.setIcon(new ImageIcon("blj.png"));
          tela.add(status);
 		 setUndecorated(true);
   
	setVisible(true);
	setSize(350,480);
	 
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