import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import java.util.*;
import javax.swing.text.*;
import javax.swing.Timer;
import java.text.DecimalFormat;
public class CadForn extends JFrame{
	
	JLabel rotulofor,rotulorazao,rotulofant,rotulocpf,rotulorepre,rotuloend,rotulobairro,rotulointer;
	JLabel rotulocid,rotulocep,rotuloemail,rotulofone,forne;
	JLabel rotuloHora;
	JFormattedTextField forn,razao,fant,cpf,repre,end,bairro;
	JFormattedTextField cid,cep,email,fone;
	JButton cadastrar,Limpar;
	MaskFormatter maskcpf,maskcep,maskfone;
	int hh,mm,ss,m;
	Calendar hora;
	DecimalFormat formato;
	JComboBox lis;
	String cidade[] = {"São Paulo","Rio de Janeiro","Minas Gerais","Santa Catarina","Bahia","Acre","Espirito Santo",
			"Rio Grande do Sul","Acre"};
	JMenu opcoes,telas;
	JMenuItem SistCad,sair,CadCli,CadProd,CadUser;
	JMenuBar barra;
	ImageIcon limp,cads;
	CadForn(){
		
		super("Cadastro de fornecedor");
		
		Container tela = getContentPane(); 
		setLayout(null);
		limp = new ImageIcon("limpar.png");
		cads = new ImageIcon("cadastrar.png");
		//hora
		

		rotuloHora = new JLabel("");

		rotuloHora.setBounds(30,410,280,20);
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
		CadProd = new JMenuItem("Cadastro de Produtos");
		CadUser = new JMenuItem("Cadastro de Usuários");
		
		telas.setMnemonic(KeyEvent.VK_T);
		opcoes.setMnemonic(KeyEvent.VK_O);
		sair.setMnemonic(KeyEvent.VK_S);
		SistCad.setMnemonic(KeyEvent.VK_I);
		CadCli.setMnemonic(KeyEvent.VK_C);
		CadProd.setMnemonic(KeyEvent.VK_P);
		CadUser.setMnemonic(KeyEvent.VK_U);
		
		
		opcoes.add(telas);
		telas.add(SistCad);
		telas.add(CadCli);
		telas.add(CadProd);
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
		
		CadCli.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CadCli app5 = new CadCli();
						
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
		CadUser.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CadUser app5 = new CadUser();
						
						app5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dispose();
						
					}
				}
				);
		
		
		//instanciando
		rotulofor = new JLabel("Tipo do Fornecedor: *");
		rotulorazao = new JLabel("Razão Social: *");
		rotulofant = new JLabel("Nome Fantasia:");
		rotulocpf = new JLabel("CPF/CNPJ: *");
		rotulorepre = new JLabel("Representante:");
		rotuloend = new JLabel("Endereço: *");
		rotulobairro = new JLabel("Bairro: *");
		rotulocid = new JLabel("Cidade: *");
		rotulocep = new JLabel("CEP:");
		rotuloemail = new JLabel("Email:");
		rotulofone = new JLabel("Fone:");	
		forne = new JLabel("Cadastro de Fornecedor");
		
	
		
		forn = new JFormattedTextField();
		razao = new JFormattedTextField();
		fant = new JFormattedTextField();
		repre = new JFormattedTextField();
		end = new JFormattedTextField();
		bairro = new JFormattedTextField();
		cid = new JFormattedTextField();
		email = new JFormattedTextField();
		
		
	
		cadastrar = new JButton("Cadastrar",cads);
		
		
		Limpar = new JButton("Limpar",limp);
		
		lis = new JComboBox(cidade);
		
		lis.setEditable(true);
		lis.setMaximumRowCount(5);
		lis.setBounds(300,275,150,20);
		
		//mascaras
		try{
			maskcpf = new MaskFormatter("#########-##");
			maskcep = new MaskFormatter("#####-###");
			maskfone = new MaskFormatter("(##)####-####");
			
			
			maskcpf.setPlaceholderCharacter('_');
			maskcep.setPlaceholderCharacter('_');
			maskfone.setPlaceholderCharacter('_');
		
		}
		
		catch(ParseException excp) {
			
		}
		
		cpf = new JFormattedTextField(maskcpf);
		cep = new JFormattedTextField(maskcep);
		fone = new JFormattedTextField(maskfone);
		
		//.setMargin(new insets(1,1,1,1));
		//definindo posições e dimensões
		rotulofor.setBounds(25,30,150,30);
		rotulorazao.setBounds(65,60,100,30);
		rotulofant.setBounds(60,90,100,30);
		rotulocpf.setBounds(80,120,100,30);
		rotulorepre.setBounds(55,150,100,30);
		rotuloend.setBounds(80,180,100,30);
		rotulobairro.setBounds(99,210,100,30);
		rotulocid.setBounds(95,240 ,100 ,30 );
		rotulocep.setBounds(115,270,100,30);
		rotuloemail.setBounds(107,300,100,30);
		rotulofone.setBounds(110,330,100,30);
	
		
		forn.setBounds(160,35,350,20);
		razao.setBounds(160,65,400,20);
		fant.setBounds(160,95,400,20);
		cpf.setBounds(160,125,150,20);
		repre.setBounds(160,155,400,20);
		end.setBounds(160,185,400,20);
		bairro.setBounds(160,215,200,20);
		cid.setBounds(160,245,200,20);
		cep.setBounds(160,275,100,20);
		email.setBounds(160,305,200,20);
		fone.setBounds(160,335,100,20);
		
		
		
		cadastrar.setBounds(170,380,130,20);
		
		Limpar.setBounds(30,380,120,20);
		forne.setBounds(200,1,600,30);
		

		
		//definindo fontes, margins e cores
		
		tela.setBackground(Color.WHITE);
		
		rotulofor.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulorazao.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulofant.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulocpf.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulorepre.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotuloend.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulobairro.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulocid.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulocep.setFont(new Font("Times New Roman",Font.BOLD,14));
		rotulofone.setFont(new Font("Times New Roman",Font.BOLD,14));
		
		
		rotulofor.setForeground(Color.WHITE);
		rotulorazao.setForeground(Color.WHITE);
		rotulofant.setForeground(Color.WHITE);
		rotulocpf.setForeground(Color.WHITE);
		rotulorepre.setForeground(Color.WHITE);
		rotuloend.setForeground(Color.WHITE);
		rotulobairro.setForeground(Color.WHITE);
		
		
		rotulocid.setForeground(Color.WHITE);
		rotulocep.setForeground(Color.WHITE);
		rotuloemail.setForeground(Color.WHITE);
		rotulofone.setForeground(Color.WHITE);
		
		forne.setForeground(Color.WHITE);
		forne.setForeground(new Color (255,255,255));
		
		rotuloHora.setForeground(Color.WHITE);
		
		forn.setForeground(Color.BLACK);
		razao.setForeground(Color.BLACK);
		fant.setForeground(Color.BLACK);
		cpf.setForeground(Color.BLACK);
		repre.setForeground(Color.BLACK);
		end.setForeground(Color.BLACK);
		bairro.setForeground(Color.BLACK);
		
		fant.setForeground(Color.BLACK);
		
		cid.setForeground(Color.BLACK);
		cep.setForeground(Color.BLACK);
		email.setForeground(Color.BLACK);
		fone.setForeground(Color.BLACK);
		
		Limpar.setFont(new Font("Times New Roman",Font.BOLD,14));
		
		Limpar.setBackground(Color.WHITE);
		cadastrar.setFont(new Font("Times New Roman",Font.BOLD,14));
		cadastrar.setBackground(Color.WHITE);
		forne.setFont(new Font("Times New Roman",Font.BOLD,20));
		
		
		forne.setForeground(Color.WHITE);

		forn.setFont(new Font("Arial",Font.BOLD,14));
		razao.setFont(new Font("Arial",Font.BOLD,14));
		fant.setFont(new Font("Arial",Font.BOLD,14));
		cpf.setFont(new Font("Arial",Font.BOLD,14));
		repre.setFont(new Font("Arial",Font.BOLD,14));
		end.setFont(new Font("Arial",Font.BOLD,14));
		bairro.setFont(new Font("Arial",Font.BOLD,14));
		fant.setFont(new Font("Arial",Font.BOLD,14));
		cid.setFont(new Font("Arial",Font.BOLD,14));
		cep.setFont(new Font("Arial",Font.BOLD,14));
		email.setFont(new Font("Arial",Font.BOLD,14));
		fone.setFont(new Font("Arial",Font.BOLD,14));
		
		
		tela.setBackground(Color.white);
		
		
		
		
		
		cadastrar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						JOptionPane.showMessageDialog(null,"Fornecedor: "+forn.getText()+"\nRazão: "
						+razao.getText()+"\nNome Fantasia: "+fant.getText()+"\nCPF: "+cpf.getText()+
						"\nRepresentante: "+repre.getText()+"\nEndereço: "+end.getText()+
						"\nBairro: "+bairro.getText()+"\nCidade: "+cid.getText()+
						"\nCEP: "+cep.getText()+"\nEmail: "+email.getText()+
						"\nTelefone: "+fone.getText()+"\nEstado: "+lis.getSelectedItem().toString());
						
						
						
						
						
					}
				}
				);
		
		
		Limpar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						forn.setText("");
						razao.setText("");
						fant.setText("");
						cpf.setText("");
						repre.setText("");
						end.setText("");
						bairro.setText("");
						cid.setText("");
						cep.setText("");
						email.setText("");
						fone .setText("");	
						
						
					}
				}
				);
		
		
		tela.add(rotulofor);
		tela.add(rotulorazao);
		tela.add(rotulofant);
		tela.add(rotulocpf);
		tela.add(rotulorepre);
		tela.add(rotuloend);
		tela.add(rotulobairro);
		tela.add(rotulocid);
		tela.add(rotulocep);
		tela.add(rotuloemail);
		tela.add(rotulofone);

	
		
		tela.add(forn);
		tela.add(razao);
		tela.add(fant);
		tela.add(cpf);
		tela.add(repre);
		tela.add(end);
		tela.add(bairro);
		tela.add(cid);
		tela.add(cep);
		tela.add(email);
		tela.add(fone);
		
	
	
		tela.add(cadastrar);
	
	
		tela.add(Limpar);

		tela.add(forne);
		
		tela.add(lis);
		
		JDesktopPane desk = new JDesktopPane(){
	        Image im = (new ImageIcon("blj.png")).getImage(); 
	        public void paintComponent(Graphics g){        
	         g.drawImage(im,0,0,this);            }
	                                    };
	      tela.add(desk);
	      JLabel status = new JLabel();
	          status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	          status.setBounds(1, 1,600, 470);
	          status.setIcon(new ImageIcon("blj.png"));
	          tela.add(status);
	 		 setUndecorated(true);

		setSize(600,470);
		setVisible(true);

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
