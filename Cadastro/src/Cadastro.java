import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.*;
public class Prova extends JFrame{
	JLabel rotulofor,rotulorazao,rotulofant,rotulocpf,rotulorepre,rotuloend,rotulobairro,rotulointer;
	JLabel rotulocid,rotulocep,rotuloemail,rotulofone,rotulofax,rotulonit,rotulofatura,rotuloaliquota,rotulopor;
	JFormattedTextField forn,razao,fant,cpf,repre,end,bairro,forne;
	JFormattedTextField cid,cep,email,fone,fax,nit,fatura,aliquota,vazio;
	JButton cadastrar,cancelar,inter;
	MaskFormatter maskcpf,maskcep,maskfone,maskfax,masknit;
	
	public Prova(){
		super("Cadastro");
		
		Container tela = getContentPane(); 
		setLayout(null);
		
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
		rotulofax = new JLabel("Fax:");
		rotulonit = new JLabel("NIT ou PIS/PASEP:");
		rotulofatura = new JLabel("Emite Fatura?");
		rotuloaliquota = new JLabel("Alíquota de imposto:");
		rotulointer = new JLabel("Internacional");
		rotulopor = new JLabel("%");
		forne = new JFormattedTextField("Cadastro de Fornecedor");

		
		forn = new JFormattedTextField();
		razao = new JFormattedTextField();
		fant = new JFormattedTextField();
		repre = new JFormattedTextField();
		end = new JFormattedTextField();
		bairro = new JFormattedTextField();
		cid = new JFormattedTextField();
		email = new JFormattedTextField();
		fatura = new JFormattedTextField();
		aliquota = new JFormattedTextField("0,00");
		vazio = new JFormattedTextField();
		
		inter = new JButton("");
		cadastrar = new JButton("Cadastrar");
		cancelar = new JButton("Cancelar");
		
		
		
		try{
			maskcpf = new MaskFormatter("#########-##");
			maskcep = new MaskFormatter("#####-###");
			maskfone = new MaskFormatter("(##)####-####");
			maskfax = new MaskFormatter("###");
			masknit = new MaskFormatter("#####-###");
			
			maskcpf.setPlaceholderCharacter('X');
			maskcep.setPlaceholderCharacter('X');
			maskfone.setPlaceholderCharacter('X');
			maskfax.setPlaceholderCharacter('X');
			masknit.setPlaceholderCharacter('X');
		}
		
		catch(ParseException excp) {
			
		}
		
		cpf = new JFormattedTextField(maskcpf);
		cep = new JFormattedTextField(maskcep);
		fone = new JFormattedTextField(maskfone);
		fax = new JFormattedTextField(maskfax);
		nit = new JFormattedTextField(masknit);
		
		rotulofor.setBounds(30,30,120,30);
		rotulorazao.setBounds(65,60,100,30);
		rotulofant.setBounds(60,90,100,30);
		rotulocpf.setBounds(80,120,100,30);
		rotulorepre.setBounds(60,150,100,30);
		rotuloend.setBounds(80,180,100,30);
		rotulobairro.setBounds(99,210,100,30);
		rotulocid.setBounds(95,240 ,100 ,30 );
		rotulocep.setBounds(115,270,100,30);
		rotuloemail.setBounds(107,300,100,30);
		rotulofone.setBounds(110,330,100,30);
		rotulofax.setBounds(115,360,100,30);
		rotulonit.setBounds(36,390,120,30);
		rotulofatura.setBounds(60,420,100,30);
		rotuloaliquota.setBounds(300,420,120,30);
		rotulointer.setBounds(395,210,100,30);
		rotulopor.setBounds(470,420,30,30);
		
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
		fax.setBounds(160,365,100,20);
		fatura.setBounds(160,425,50,20);
		aliquota.setBounds(430,425,35,20);
		nit.setBounds(160,395,100,20);
		vazio.setBounds(370,245,50,20);
		
		inter.setBounds(375,219,13,13);
		cadastrar.setBounds(270,455,100,20);
		cancelar.setBounds(390,455,100,20);

		forne.setBounds(1,1,600,30);
		
		forne.setMargin(new Insets(1,200,1,200));
		forne.setForeground(Color.white);

		forne.setBackground(Color.GRAY);
		tela.setBackground(Color.white);
		
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
		tela.add(rotulofax);
		tela.add(rotulonit);
		tela.add(rotulofatura);
		tela.add(rotuloaliquota);
		tela.add(rotulointer);
		tela.add(rotulopor);
		
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
		tela.add(fax);
		tela.add(nit);
		tela.add(fatura);
		tela.add(aliquota);
		tela.add(vazio);
		
		tela.add(inter);
		tela.add(cadastrar);
		tela.add(cancelar);

		tela.add(forne);
		
		setSize(600,520);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		Prova app = new Prova();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
