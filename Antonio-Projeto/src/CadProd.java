	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
import java.sql.Statement;

import javax.swing.JOptionPane.*;
	import java.text.*;

import javax.swing.plaf.basic.BasicSliderUI;
	import javax.swing.table.DefaultTableModel;
	import java.util.*;
	import javax.swing.text.*;
	import javax.swing.Timer;
	import java.text.DecimalFormat;
	import javax.swing.text.MaskFormatter;

import java.text.ParseException;
public class CadProd extends JFrame{
	JTable tabela;
	String[] coluna = {"ID","Produto","Descrição","Data","Quantidade","Preço","Total"};
	Object[][][][][][][] produtos = { };
	JTextField Nome,Quant,Prec,Id;
	JFormattedTextField Data;
	JLabel nome,quant,prec,Produ,id,desc;
	JTextArea Desc;
	JButton Cadas,Limpar,Excluir;
	JLabel rotuloHora,data;
	MaskFormatter maskData;
	int hh,mm,ss,m;
	JPanel painel;
	Calendar hora;
	DecimalFormat formato;
	JPopupMenu opcoesMouse;
	JMenuItem recortar,copiar,colar;
	JMenu opcoes,telas;
	JMenuItem SistCad,sair,CadCli,CadForn,CadUser;
	JMenuBar barra;
	ImageIcon limp,cads,fec;
	public CadProd(){
		super("Cadastro de Produtos");
		Container tela = getContentPane();
		setLayout(null);
		
		limp = new ImageIcon("limpar.png");
		cads = new ImageIcon("cadastrar.png");
		fec = new ImageIcon("sair.png");
		//horas
		
		rotuloHora = new JLabel("");

		rotuloHora.setBounds(30,520,280,20);
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
		CadUser = new JMenuItem("Cadastro de Usuários");
		
		telas.setMnemonic(KeyEvent.VK_T);
		opcoes.setMnemonic(KeyEvent.VK_O);
		sair.setMnemonic(KeyEvent.VK_S);
		SistCad.setMnemonic(KeyEvent.VK_I);
		CadCli.setMnemonic(KeyEvent.VK_C);
		CadForn.setMnemonic(KeyEvent.VK_F);
		CadUser.setMnemonic(KeyEvent.VK_U);
		
		
		opcoes.add(telas);
		telas.add(SistCad);
		telas.add(CadCli);
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
		nome = new JLabel("Nome do Produto ");
		quant = new JLabel("Quantidade ");
		prec = new JLabel("Preço ");
		id = new JLabel("Código ");
		desc = new JLabel("Descrição do produto ");
		
		Nome = new JTextField();
		Quant = new JTextField();
		Prec = new JTextField();
		Id = new JTextField();
				
		Desc = new JTextArea(6,20);
		
		Produ = new JLabel("Cadastro de Produtos");
		
		
		Cadas = new JButton("Cadastrar",cads);
		Limpar = new JButton("Limpar",limp);
		Excluir = new JButton("Excluir",fec);
		
		
		maskData = new MaskFormatter();
		
		data = new JLabel("Data de Fabricação:");
		
		try{
			maskData = new MaskFormatter("##/##/####");
			
			maskData.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {}
		
		Data = new JFormattedTextField(maskData);
		
		
		
		
		Desc.addMouseListener(new MouseAdapter() {
			public void MouseReleased(MouseEvent e) {
				if(e.isPopupTrigger())
					opcoesMouse.show(e.getComponent(), e.getX(),e.getY());
			}
		}
				
				);
		
	
		Tratador tratmenu = new Tratador();
		
		opcoesMouse = new JPopupMenu();
		recortar = new JMenuItem("Recortar");
		copiar  = new JMenuItem("Copiar");
		colar= new JMenuItem("Colar");
	
		
		recortar.setMnemonic(KeyEvent.VK_R);
		copiar.setMnemonic(KeyEvent.VK_C);
		colar.setMnemonic(KeyEvent.VK_L);
		
		recortar.addActionListener(tratmenu);
		copiar.addActionListener(tratmenu);
		colar.addActionListener(tratmenu);
		opcoesMouse.add(recortar);
		opcoesMouse.add(copiar);
		opcoesMouse.addSeparator();
		opcoesMouse.add(colar);
		
		
		JScrollPane painelDeTexto = new JScrollPane(Desc);
		painelDeTexto.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		painel = new JPanel();
		
		painel.add(painelDeTexto);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(produtos,coluna));
        JScrollPane Barra = new JScrollPane(tabela);
        
        
		
        
		
		//definindo posições e dimensões
		Produ.setBounds(160,20,200,20);
		
		id.setBounds(30,60,200,20);
		nome.setBounds(120,60,200,20);
		quant.setBounds(30,120,200,20);
		prec.setBounds(120,120,200,20);
		desc.setBounds(260,60,200,20);
		data.setBounds(30,180,200,20);
		
		Data.setBounds(30,200,80,20);
		Id.setBounds(30,80,50,20);
		Nome.setBounds(120,80,120,20);
		Quant.setBounds(30,140,79,20);
		Prec.setBounds(120,140,79,20);
		
		
		
		painel.setBounds(260,80,260,120);

	
		Cadas.setBounds(170,480,130,20);
		Limpar.setBounds(30,480,120,20);
		
		Excluir.setBounds(320,480,120,20);
		
		Barra.setBounds(30,250,500,200);
		
		
		
		Cadas.setBackground(Color.WHITE);
		Limpar.setBackground(Color.WHITE);
		Excluir.setBackground(Color.WHITE);
		
		//ações dos botões
		
		
		Cadas.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					    
						
						  DefaultTableModel model =  (DefaultTableModel) tabela.getModel();
						  	String datas = Data.getText();
						  	String descri = Desc.getText();
			                int cod = Integer.parseInt( Id.getText());
			                String produto = Nome.getText();
			                int qtd = Integer.parseInt( Quant.getText());
			                float preco = Float.parseFloat(Prec.getText());
			                float total = qtd*preco;
			                
			                Object[] linha = new String[]{ Integer.toString(cod),produto,descri,datas,Integer.toString(qtd), 
			                Float.toString(preco), Float.toString(total)};
			                model.addRow(linha);
			               
			             
			                Id.setText("");
				            Nome.setText("");
				            Quant.setText("");
				            Prec.setText("");
				            Desc.setText("");
				            Data.setText("");
					}
					}
				

				);
		Limpar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						 	Id.setText("");
				            Nome.setText("");
				            Quant.setText("");
				            Prec.setText("");
				            Desc.setText("");
				            Data.setText("");
						
					}
				}
				);
		
		
	
		
			
			Excluir.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
					        if (tabela.getSelectedRow() >= 0){
					            dtm.removeRow(tabela.getSelectedRow());
					            tabela.setModel(dtm);
					        }else{
					            JOptionPane.showMessageDialog(null, "Favor selecionar um item");
					        }
						}
					}
					);
			
			/*public void limpa(){
	            Id.setText("");
	            Nome.setText("");
	            Quant.setText("");
	            Prec.setText("");
	        
	    }*/
			
			//definindo cores e fontes
			
			
			Nome.setFont(new Font("Times New Roman",Font.BOLD,15));
			Quant.setFont(new Font("Times New Roman",Font.BOLD,15));
			Prec.setFont(new Font("Times New Roman",Font.BOLD,15));
			Id.setFont(new Font("Times New Roman",Font.BOLD,15));
			Data.setFont(new Font("Times New Roman",Font.BOLD,15));
			Desc.setFont(new Font("Times New Roman",Font.BOLD,15));
			
			rotuloHora.setFont(new Font("Times New Roman",Font.BOLD,15));
			
			
			rotuloHora.setForeground(Color.WHITE);
			
			
			data.setFont(new Font("Times New Roman",Font.BOLD,15));
			nome.setFont(new Font("Times New Roman",Font.BOLD,15));
			quant.setFont(new Font("Times New Roman",Font.BOLD,15));
			prec.setFont(new Font("Times New Roman",Font.BOLD,15));
			Produ.setFont(new Font("Times New Roman",Font.BOLD,20));
			id.setFont(new Font("Times New Roman",Font.BOLD,15));
			desc.setFont(new Font("Times New Roman",Font.BOLD,15));
			
			
			data.setForeground(Color.WHITE);
			nome.setForeground(Color.WHITE);
			quant.setForeground(Color.WHITE);
			prec.setForeground(Color.WHITE);
			Produ.setForeground(Color.WHITE);
			id.setForeground(Color.WHITE);
			desc.setForeground(Color.WHITE);
			
			
			
			
			
			
		tela.add(nome);
		tela.add(Nome);
		tela.add(quant);
		tela.add(Quant);
		tela.add(prec);
		tela.add(Prec);
		tela.add(id);
		tela.add(Id);
			
		tela.add(Barra);
	
		tela.add(Cadas);
		tela.add(Limpar);

		tela.add(Produ);
		tela.add(Excluir);
		tela.add(desc);
		tela.add(painel);
		tela.add(Data);
		tela.add(data);
		tela.add(opcoesMouse);
		
		JDesktopPane desk = new JDesktopPane(){
	        Image im = (new ImageIcon("blj.png")).getImage(); 
	        public void paintComponent(Graphics g){        
	         g.drawImage(im,0,0,this);            }
	                                    };
	      tela.add(desk);
	      JLabel status = new JLabel();
	          status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	          status.setBounds(1, 1,1000, 1000);
	          status.setIcon(new ImageIcon("blj.png"));
	          tela.add(status);
	          
		setSize(560,570);
		 setUndecorated(true);
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
class Tratador implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == recortar) 
			Desc.cut();
		
		if(e.getSource() == copiar) 
			Desc.copy();
		
		if(e.getSource() == colar) 
			Desc.paste();
		
		repaint();
	}
	
	
}
}

