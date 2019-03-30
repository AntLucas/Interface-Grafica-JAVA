	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.JOptionPane.*;
	import java.text.*;
	import java.util.*;
	import javax.swing.text.*;
	import javax.swing.Timer;
	import java.text.DecimalFormat;
public class SistCad extends JFrame{
	
	JLabel sist;
	JButton CadCli,CadForn,CadProd,CadUser,sair;
	JLabel rotuloHora;
	int hh,mm,ss,m;
	Calendar hora;
	DecimalFormat formato;
	ImageIcon client,fornec,produt,usu,fec;

public SistCad() {
	super("SistCad");
	Container tela = getContentPane();
	
	setLayout(null);
	
	
	sist = new JLabel("Sistema de Cadastro");
	
	rotuloHora = new JLabel("");

	rotuloHora.setBounds(40,200,280,20);
	ActionListener tarefa = (new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			HORAS();
		}
	});
	javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
	time.start();
	tela.add(rotuloHora);
	
	
	
	client = new ImageIcon("cliente.png");
	fornec = new ImageIcon("fornecedor.png");
	produt = new ImageIcon("produto.png");
	usu = new ImageIcon("usuario.png");
	fec = new ImageIcon("sair.png");
	//instanciando botões
	CadCli = new JButton("Cadastro de Cliente",client);
	CadForn = new JButton("Cadastro de Fornecedor",fornec);
	CadProd = new JButton("Cadastro de Produtos",produt);
	CadUser = new JButton("Cadastro de Usuário",usu);
	sair = new JButton("Sair",fec);
	
	

	
	//definindo posições e dimensões
	sist.setBounds(180,20,200,20);
	
	CadCli.setBounds(40,70,210,30);
	CadForn.setBounds(280,70,210,30);
	CadProd.setBounds(40,130,210,30);
	CadUser.setBounds(280,130,210,30);
	sair.setBounds(390,190,100,20);
	
	//Ajustando as fontes
	
	sist.setFont(new Font("Times New Roman",Font.BOLD,20));
	CadCli.setFont(new Font("Times New Roman",Font.BOLD,14));
	CadForn.setFont(new Font("Times New Roman",Font.BOLD,14));
	CadProd.setFont(new Font("Times New Roman",Font.BOLD,14));
	CadUser.setFont(new Font("Times New Roman",Font.BOLD,14));
	sair.setFont(new Font("Times New Roman",Font.BOLD,14));
	
	//adicionando cores
	
	tela.setBackground(Color.WHITE);
	
	CadCli.setBackground(Color.WHITE);
	CadForn.setBackground(Color.WHITE);
	CadProd.setBackground(Color.WHITE);
	CadUser.setBackground(Color.WHITE);
	sair.setBackground(Color.WHITE);
	
	rotuloHora.setForeground(Color.WHITE);
	sist.setForeground(Color.WHITE);

	
	CadCli.setForeground(Color.BLACK);
	CadForn.setForeground(Color.BLACK);
	CadProd.setForeground(Color.BLACK);
	CadUser.setForeground(Color.BLACK);
	sair.setForeground(Color.BLACK);
	
	//Adicionando Ações aos botões
	
	//botão cliente
	CadCli.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CadCli app2 = new CadCli();
					app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					dispose();
				}
			}
			);
	
	//botão fornecedor
	CadForn.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CadForn app3 = new CadForn();
					app3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					dispose();
				}
			}
			);
	
	//botão produto
		CadProd.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						CadProd prod = new CadProd();
						prod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				}
				);
		
		//botão usuario
		CadUser.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CadUser app4 = new CadUser();
						app4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dispose();
					}
				}
				);
		
	
	sair.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
						
				setVisible(false);
				}
			}
			);
	
	
	//adicionando os objetos a tela
	tela.add(sist);
	tela.add(CadCli);
	tela.add(CadForn);
	tela.add(CadProd);
	tela.add(CadUser);
	tela.add(sair);
	
	JDesktopPane desk = new JDesktopPane(){
        Image im = (new ImageIcon("blj.png")).getImage(); 
        public void paintComponent(Graphics g){        
         g.drawImage(im,0,0,this);            }
                                    };
      tela.add(desk);
      JLabel status = new JLabel();
          status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
          status.setBounds(1, 1,600, 300);
          status.setIcon(new ImageIcon("blj.png"));
          tela.add(status);
	
    setUndecorated(true);
	setVisible(true);
	setSize(530,250);
	setLocationRelativeTo(null); 
	
}
		public static void main(String[]Args) {
	SistCad app = new SistCad();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
