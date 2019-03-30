package classes;

import java.util.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IniciarPartida extends JFrame {
	
	
	Batedor b1 = new Batedor();
	Batedor b2 = new Batedor();
	Batedor b3 = new Batedor();
	Batedor b4 = new Batedor();
	Batedor b5 = new Batedor();
	Batedor b6 = new Batedor();
	
	
	Time t1 = new Time();
	Time t2 = new Time();
	
	Goleiro g1 = new Goleiro();
	Goleiro g2 = new Goleiro();
	
	Tecnico tec1 = new Tecnico();
	Tecnico tec2 = new Tecnico();
	
	Gandula gan1 = new Gandula();
	
	Bandeirinha Ban1 = new Bandeirinha();
	
	Juiz Juiz1 = new Juiz();
	
	TorcedorEducado TE1 = new TorcedorEducado();
	TorcedorEducado TE2 = new TorcedorEducado();

	
	TorcedorMalEducado TME1 = new TorcedorMalEducado();
	TorcedorMalEducado TME2 = new TorcedorMalEducado();
	
	
	
	
	
	
	
	
	JLabel timeA, timeB, placar, nomeJogador, torcedorA1, torcedorB1, torcedorA2, torcedorB2,nomeGoleiro, torcidaAtitulo, torcidaBtitulo, 
	tecnicoAtitulo, tecnicoBtitulo, tecnicoA, tecnicoB, titulo, labelAcao,labelJuiz,labelBandeirinha,labelGandula;
	JButton botaoVoltar, botaoAcao;
	int result1=0,result2=0,time=0, jogador1=0,jogador2=0,goleiro=0,chutes1=0,chutes2=0;
	public IniciarPartida(){
		super("Tela da Partida");
		Container tela = getContentPane();
		setLayout(null);
		
		
		
		

		// setando 
		
		Ban1.setNomeDoBandeirinha("Robert");
	
		gan1.setNomeDoGandula("Nelson");
		
		Juiz1.setNomeDoJuiz("Cleber");
		
		t1.setNomeDoTime("Etec Zona Lost");
		t2.setNomeDoTime("Real Madrid");
		
		t1.setVisitante(false);
		t2.setVisitante(true);
		
		b1.setNomeDoJogador("James");
		b1.setNomeDoTime("Etec Zona Lost");
		b2.setNomeDoTime("Etec Zona Lost");
		b2.setNomeDoJogador("Pedro");
		b3.setNomeDoTime("Etec Zona Lost");
		b3.setNomeDoJogador("Sulivan");
		b4.setNomeDoTime("Real Madrid");
		b4.setNomeDoJogador("Cristiano");
		b5.setNomeDoTime("Real Madrid");
		b5.setNomeDoJogador("Ronaldo");
		b6.setNomeDoTime("Real Madrid");
		b6.setNomeDoJogador("Silva");
		
		g1.setNomeDoTime("Real Madrid");
		g1.setNomeDoGoleiro("Douglas");
		g2.setNomeDoTime("Etec Zona Lost");
		g2.setNomeDoGoleiro("Julio");
		
		tec1.setNomeDoTime("Etec Zona Lost");
		tec2.setNomeDoTime("Real Madrid");
		
		TE1.setNomeDoTime("Etec Zona Lost");
		TE1.setNome("Denise");
		TE2.setNomeDoTime("Real Madrid");
		TE2.setNome("Italo");

		
		tec1.setNome("Gustavo Bois");
		tec2.setNome("Hebert");
		
		TME1.setNomeDoTime("Etec Zona Lost");
		TME1.setNome("Gustavo");
		TME2.setNomeDoTime("Real Madrid");
		TME2.setNome("Carlos");
		
		
		labelJuiz = new JLabel("");
		labelJuiz.setFont(new Font("Arial", Font.BOLD, 15));
		labelJuiz.setForeground(Color.WHITE);
		
		labelGandula = new JLabel("");
		labelGandula.setFont(new Font("Arial", Font.BOLD, 15));
		labelGandula.setForeground(Color.WHITE);
		
		labelBandeirinha = new JLabel("");
		labelBandeirinha.setFont(new Font("Arial", Font.BOLD, 15));
		labelBandeirinha.setForeground(Color.WHITE);
		
		
		timeA = new JLabel (t1.getNomeDoTime());
		timeA.setFont(new Font("Arial", Font.BOLD, 15));
		timeA.setForeground(Color.WHITE);
		
		
		timeB = new JLabel (t2.getNomeDoTime());
		timeB.setFont(new Font("Arial", Font.BOLD, 15));
		timeB.setForeground(Color.WHITE);
		
		
		titulo = new JLabel ("PLACAR ATUAL");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setForeground(Color.WHITE);
		
		
		placar = new JLabel ("");
		placar.setFont(new Font("Arial", Font.BOLD, 20));
		placar.setForeground(Color.WHITE);
		
		
		nomeJogador = new JLabel ("");
		nomeJogador.setFont(new Font("Arial", Font.BOLD, 16));
		nomeJogador.setForeground(Color.WHITE);
		labelAcao = new JLabel ("");
		
		
		labelAcao.setFont(new Font("Arial", Font.BOLD, 12));
		labelAcao.setForeground(Color.WHITE);
		nomeGoleiro = new JLabel ("");
		
		
		nomeGoleiro.setFont(new Font("Arial", Font.BOLD, 16));
		nomeGoleiro.setForeground(Color.WHITE);
		torcidaAtitulo = new JLabel ("");
		
		
		torcidaAtitulo.setFont(new Font("Arial", Font.BOLD, 13));
		torcidaAtitulo.setForeground(Color.WHITE);
		torcidaBtitulo = new JLabel ("");
		
		
		torcidaBtitulo.setFont(new Font("Arial", Font.BOLD, 13));
		torcidaBtitulo.setForeground(Color.WHITE);
		
		
		timeB.setFont(new Font("Arial", Font.BOLD, 15));
		timeB.setForeground(Color.WHITE);
		
		
		torcedorA1= new JLabel ("");
		torcedorA1.setForeground(Color.WHITE);
		
		
		torcedorB1 = new JLabel ("");
		torcedorB1.setForeground(Color.WHITE);
		
		
		torcedorA2 = new JLabel("");
		torcedorA2.setForeground(Color.WHITE);
		
		
		torcedorB2 = new JLabel("");
		torcedorB2.setForeground(Color.WHITE);
		
		
		tecnicoAtitulo = new JLabel ("");
		tecnicoAtitulo.setFont(new Font("Arial", Font.BOLD, 13));
		tecnicoAtitulo.setForeground(Color.WHITE);
		
		
		tecnicoBtitulo = new JLabel ("TÉCNICO DO TIME B");
		tecnicoBtitulo.setFont(new Font("Arial", Font.BOLD, 13));
		tecnicoBtitulo.setForeground(Color.WHITE);
		
		
		tecnicoA = new JLabel ("");
		tecnicoA.setForeground(Color.WHITE);
		
		
		tecnicoB = new JLabel ("");
		tecnicoB.setForeground(Color.WHITE);
		
		
		labelJuiz.setBounds(30,100,500,500);
		labelGandula.setBounds(30,200,500,500);
		labelBandeirinha.setBounds(30,150,500,500);
		timeA.setBounds(30, 30, 500, 30);
		torcidaAtitulo.setBounds(30, 90, 500, 30);
		timeB.setBounds(670, 30, 100, 30);
		torcidaBtitulo.setBounds(630, 90, 500, 30);
		torcedorA1.setBounds(30, 120, 500, 30);
		torcedorB1.setBounds(620, 120, 500, 30);
		torcedorA2.setBounds(30, 150, 500, 30);
		torcedorB2.setBounds(620, 150, 500, 30);
		titulo.setBounds(350, 30, 500, 30);
		placar.setBounds(400, 60, 500, 30);
		nomeJogador.setBounds(325, 180, 500, 30);
		labelAcao.setBounds(325, 230, 500, 30);
		nomeGoleiro.setBounds(325, 280, 500, 30);
		tecnicoAtitulo.setBounds(30, 200, 500, 30);
		tecnicoBtitulo.setBounds(630, 200, 500, 30);
		tecnicoA.setBounds(30, 230, 500, 30);
		tecnicoB.setBounds(630, 230, 500, 30);
		
		botaoVoltar = new JButton ("Voltar");
		botaoAcao = new JButton ("Próxima ação!");
		
		botaoAcao.setBounds(350, 120, 160, 25);
		botaoVoltar.setBounds(560, 400, 100, 25);
		botaoVoltar.setMargin(new Insets(1,1,1,1));
		
		torcedorA1.setText("Torcedor "+TE1.getNome());
		torcedorA2.setText("Torcedor "+TME1.getNome());
		
		torcedorB1.setText("Torcedor "+TE2.getNome());
		torcedorB2.setText("Torcedor "+TME2.getNome());
		
		
		tecnicoAtitulo.setText( "Técnico de  "+t1.getNomeDoTime());
		tecnicoBtitulo.setText( "Técnico de  "+t2.getNomeDoTime());
		
		

		tecnicoA.setText("Tecnico "+tec1.getNome());
		tecnicoB.setText("Tecnico "+tec2.getNome());
		
		placar.setText(t1.getGols()+ " x " +t2.getGols() );
		
		labelJuiz.setText("Juiz " + Juiz1.getNomeJuiz());
		
		labelBandeirinha.setText("Bandeirinha " + Ban1.getNomeDoBandeirinha());
		
		labelGandula.setText("Gandula " + gan1.getNomeDoGandula());
		
		
		botaoAcao.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ed) {
						labelGandula.setText("Gandula " + gan1.getNomeDoGandula());
						labelBandeirinha.setText("Bandeirinha "+Ban1.getNomeDoBandeirinha());
						labelAcao.setText("");
						botaoAcao.setVisible(false);
						Juiz1.Apitar();
						labelJuiz.setText("Juiz " + Juiz1.getNomeJuiz() + " " + Juiz1.getAcao());
						
			
						torcedorA1.setText("Torcedor "+TE1.getNome());
						torcedorA2.setText("Torcedor "+TME1.getNome());
						
						torcedorB1.setText("Torcedor "+TE2.getNome());
						torcedorB2.setText("Torcedor "+TME2.getNome());
						
						
						tecnicoAtitulo.setText( "Técnico de  "+t1.getNomeDoTime());
						tecnicoBtitulo.setText( "Técnico de  "+t2.getNomeDoTime());
						
					

						
						tecnicoA.setText("Tecnico "+tec1.getNome());
						tecnicoB.setText("Tecnico "+tec2.getNome());
						
					
					      
						//decidindo que jogador está jogando do time 1
						if(time == 0) {

				        	 if(jogador1 >=3) {
				        		jogador1=0;
				        	}
	       		
				        	 if(jogador1 == 0) {
				        		 nomeJogador.setText("Batedor "+b1.getNomeJogador()+" de "+t1.getNomeDoTime());
		        		jogador1+=1;
		        		
		        		}
		        		
		        		else if(jogador1 == 1) {
		        			nomeJogador.setText("Batedor "+b2.getNomeJogador()+" de "+t1.getNomeDoTime());
			        		jogador1+=1;
			        		}
		        		
		        		else if(jogador1 == 2) {
		        			nomeJogador.setText("Batedor "+b3.getNomeJogador()+" de "+t1.getNomeDoTime());
			        		jogador1+=1;
			        		}
				        	 
				        	 nomeGoleiro.setText("Goleiro "+g2.getNomeGoleiro()+" de " +t2.getNomeDoTime());
				        	 goleiro=0;
			        	
				        	 chutes1 +=1;
				        	 time=1;
			        	}
						
						//decidindo que jogador está jogando do time 2
						else	if(time == 1) {

				        	 if(jogador2 >=3) {
				        		jogador2=0;
				        	}
	      		
				        	 if(jogador2 == 0) {
				        		 nomeJogador.setText("Batedor "+b4.getNomeJogador()+" de "+t2.getNomeDoTime());
		        		jogador2+=1;
		        		}
		        		
		        		else if(jogador2 == 1) {
		        			nomeJogador.setText("Batedor "+b5.getNomeJogador()+" de "+t2.getNomeDoTime());
			        		jogador2+=1;
			        		}
		        		
		        		else if(jogador2 == 2) {
		        			nomeJogador.setText("Batedor "+b6.getNomeJogador()+" de "+t2.getNomeDoTime());
			        		jogador2+=1;
			        		}
				        	 
				        	 nomeGoleiro.setText("Goleiro "+g1.getNomeGoleiro()+" de " +t1.getNomeDoTime());
	      		
			        	goleiro=1;
			        	
			        	chutes2 +=1;
			        	
			        	time =0;
			        	}
						
						ActionListener taskPerforme = new ActionListener() {
					        @Override
					        public void actionPerformed(ActionEvent aee) {
					        	
					        	labelAcao.setText("Batedor se prepara para chutar");
					        	
					        	
					        	ActionListener taskPerform = new ActionListener() {
							        @Override
							        public void actionPerformed(ActionEvent aee) {
							        	labelJuiz.setText("Juiz " + Juiz1.getNomeJuiz());
					        	
							        }
								};
								 Timer timerrr = new Timer(1000, taskPerform);
								    timerrr.setRepeats(false);
								    timerrr.start();
					        	
					        }
						};
						 Timer timerr = new Timer(500, taskPerforme);
						    timerr.setRepeats(false);
						    timerr.start();
						
						ActionListener taskPerformer = new ActionListener() {
					        @Override
					        public void actionPerformed(ActionEvent ae) {
					        	
					        	
						
						if(chutes1<=5 && chutes2 <=5) {
						
						//gerando a ação aleatoria do chute
						 Random radom  = new Random();
						    int numeroTmp = 0;
						    for(int i=0;i<1; i++) {
						    	
				
						        numeroTmp=radom.nextInt(2);
						        System.out.println(">"+numeroTmp);
						        
						      //If caso a bola não entre
						        if(numeroTmp == 0) {
						        	placar.setText(t1.getGols()+ " x " +t2.getGols() );
						        	labelAcao.setText("Bola não entrou");
						        	// if caso o time 1 não tenha marcado gol
						        	if(time ==1) {
						        		//acao do torcedor educado
						        		TE2.Apoiar();
						        		torcedorB1.setText("Torcedor "+TE2.getNome()+" "+TE2.getAcao());
						        		
						        		//acao do torcedor mal educado
						        		TME1.Insultar();
						        		torcedorA2.setText("Torcedor "+TME1.getNome()+" "+TME1.getAcao());
						        		
						        		//acao do tecnico
						        		tec1.Reclamar();
						        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
										
						        		
						        	
						        	
						        	}
						        	//if caso o time 2 não tenha acertado
						        	else if(time==0) {
						        	
						        		//acao do torcedor educado
						        		TE1.Apoiar();
						        		torcedorA1.setText("Torcedor "+TE1.getNome()+" "+TE1.getAcao());
						        		
						        		//acao do torcedor mal educado
						        		TME2.Insultar();
						        		torcedorB2.setText("Torcedor "+TME2.getNome()+""+TME2.getAcao());
						        		
						        		//acao do tecnico
						        		tec2.Reclamar();
						        		tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
						        		
						        	}
						        	
						        	//por que a bola nao entrou
						        	 int numero = 0;
						     	    for(int j=0;j<1; j++) {
						     	        numero=radom.nextInt(4);
						     	        System.out.println(">"+numero);
						     	        
						     	        if(numero == 0 ) {
						     	        	if(goleiro==0) {
						     	        		tec1.Apoiar();
						     	        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
						     	        		labelAcao.setText(g1.getNomeGoleiro()+" Defendeu");
						     	        	}
						     	        }
						     	        	
						     	        	if(goleiro==1) {
						     	        	tec2.Apoiar();
						     	        	tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
						     	        	labelAcao.setText(g2.getNomeGoleiro()+" Defendeu");
						     	        	}
						     	        	
						     	       if(numero == 1 ) {
						     	    	  labelAcao.setText("Bola na Trave");
					    	        	}
						     	       
						     	      if(numero == 2 ) {
						     	    	 labelAcao.setText("Bola pra fora");
					   	        	}
						     	      
						     	     if(numero == 3 ) {
						     	    	
						     	    	Ban1.Intervir();
						     	    	labelBandeirinha.setText("Bandeirinha "+Ban1.getNomeDoBandeirinha()+" "+ Ban1.getAcao());
						     	    	
						     	    	ActionListener taskPerformerrr = new ActionListener() {
						     	           @Override
						     	           public void actionPerformed(ActionEvent ae) {
						     	        	   	Ban1.Mensagem();
								     	    	labelBandeirinha.setText("Bandeirinha "+Ban1.getNomeDoBandeirinha()+" "+ Ban1.getAcao());
						     	        	   
						     	        	   
						     	          }
							     	       };
							     	       Timer timerrrr = new Timer(2000, taskPerformerrr);
							     	       timerrrr.setRepeats(false);
							     	       timerrrr.start();
						     	          
							     	      ActionListener taskPerformerrrr = new ActionListener() {
							     	           @Override
							     	           public void actionPerformed(ActionEvent ae) {
							     	      Juiz1.Irregularidade();
					     	        	  labelJuiz.setText("Juiz " + Juiz1.getNomeJuiz() + " " + Juiz1.getAcao());
					     	        	 labelAcao.setText("Goleiro se adiantou");
					     	        	 
							     	          }
							     	       };
							     	       Timer timerrrrr = new Timer(3000, taskPerformerrrr);
							     	       timerrrrr.setRepeats(false);
							     	       timerrrrr.start();
							     	    	 
						     	        
						     	    	 //voltando os status
						     	    	 if(goleiro==0) {
						     	    		 
						     	    		 if(jogador2 == 1) {
						     	    			 jogador2=0;
						     	    			 
						     	    		 }
						     	    		 
						     	    		 if(jogador2 == 2) {
						     	    			 jogador2=1;
						     	    			 
						     	    		 }
						     	    		 
						     	    		 if(jogador2 == 3) {
						     	    			 jogador2=1;
						     	    			 
						     	    		 }
						     	    		 goleiro = 0;
							     	    	 chutes2 -=1;
							     	    	 time=1;
						     	    	 }
						     	    	 
						     	    	 //voltando os status
						     	    	 if(goleiro==1) {
						     	    		 if(jogador1 == 1) {
						     	    			 jogador1=0;
						     	    			 
						     	    		 }
						     	    		 
						     	    		 if(jogador1 == 2) {
						     	    			 jogador1=1;
						     	    			 
						     	    		 }
						     	    		 
						     	    		 if(jogador1 == 3) {
						     	    			 jogador1=1;
						     	    			 
						     	    		 }
						     	    		 
						     	    		 goleiro = 1;
							     	    	 chutes1 -=1;
							     	    	 time=0;
						     	    	 }
					   	        	}
						     	           
						     	           
						     	  
						     	    	 
						     	           
						     	    
						        }
						        
						     	   
						     	    	 
						      
						        }
						     	  
						        //caso tenha acertado
						        if(numeroTmp == 1) {
						        	placar.setText(t1.getGols()+ " x " +t2.getGols() );
						        	labelAcao.setText("Batedor acertou");
						        	if(time==1) {
						        		
				     	        		//acao do torcedor educado
						        		TE1.Torcer();	
						        		torcedorA1.setText("Torcedor "+TE1.getNome()+" "+TE1.getAcao());
						        		
						        		//acao do torcedor mal educado
						        		TME2.Vaiar();
						        		torcedorB2.setText("Torcedor "+ TME2.getNome()+" "+TME2.getAcao());
						        		
						        		//acao do tecnico
						        		tec1.Instruir();
				     	        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
						        	
						        		result1 +=1;
						        		t1.setGols(result1);
						     
						        
						        	
						        	if(t1.getGols() == 5) {
						        		 
						        		
						        		placar.setText(t1.getGols()+ " x " +t2.getGols() );
						        		JOptionPane.showMessageDialog(null,t1.getNomeDoTime()+ " venceu, fez "+t1.getGols());
						        		t1.setGols(0);
						        		t2.setGols(0);
						        		result1=0;
						        		result2=0;
						        		
						        		jogador1=0;
						        		jogador2=0;
						        		time=0;
						        		
						        		//acao do torcedor educado
				     	        		TE1.Comemorar();
				     	        		torcedorA1.setText("Torcedor "+TE1.getNome()+" "+TE1.getAcao());
				     	        		
				     	        		//acao do torcedor mal educado
				     	        		TME1.Comemorar();
				     	        		torcedorA2.setText ("Torcedor "+TME1.getNome()+" "+TME1.getAcao());
				     	        		
				     	        		//acao do tecnico
				     	        		tec1.Comemorar();
				     	        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
				     	        		
				     	        		
						        	}
						        	
						        	}
						        	
						        	else if (time ==0) {
						        		
						        		//acao do torcedor educado
						        		TE2.Torcer();	 
						        		torcedorB1.setText("Torcedor "+TE2.getNome()+" "+TE2.getAcao());
						        		
						        		//acao do torcedor mal educado
						        		TME1.Vaiar();
						        		torcedorA2.setText("Torcedor "+ TME1.getNome()+" "+TME1.getAcao());
						        		
						        		//acao do tecnico
						        		tec2.Instruir();
				     	        		tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
				     	        		
						        		result2 +=1;
						        		t2.setGols(result2);
						        		
		
						        		
						        		if(t2.getGols() == 5) {
						        			placar.setText(t1.getGols()+ " x " +t2.getGols() );
							        		JOptionPane.showMessageDialog(null,t2.getNomeDoTime()+ " venceu, fez "+t2.getGols());
							        		t1.setGols(0);
							        		t2.setGols(0);
							        		result2=0;
							        		result1=0;
							        		
							        		jogador1=0;
							        		jogador2=0;
							        		time=0;
							        		
							        		
							        		//acao do torcedor educado
					     	        		TE2.Comemorar();
					     	        		torcedorB1.setText("Torcedor "+ TE2.getNome()+" "+TE2.getAcao());
					     	        		
					     	        		//acao do torcedor mal educado
					     	        		TME2.Comemorar();
					     	        		torcedorB2.setText("Torcedor "+TME2.getNome()+" "+TME2.getAcao());
					     	        		
					     	        		//acao do tecnico
					     	        		tec2.Comemorar();
					     	        		tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
							        	}
						        	}
						        	placar.setText(t1.getGols()+ " x " +t2.getGols() );
						        }
						    }
						    
						    
					}
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						//ação caso os dois times ja tenham chutado 5x
						
						else if(chutes1 > 5 && chutes2 > 5) {
							
							
							 Random radom  = new Random();
							    int nume = 0;
							    for(int i=0;i<1; i++) {
							
							    	  
							 
							  
							  	
				        		
							  if(chutes1 != chutes2 ) {
								   
							    	nume=radom.nextInt(2);
							        System.out.println(">"+nume);
							        
							      //If caso a bola não entre
							        if(nume == 0) {
							        	placar.setText(t1.getGols()+ " x " +t2.getGols() );
							        	labelAcao.setText("Bola não entrou");
							        	// if caso o time 1 não tenha marcado gol
							        	if(time ==1) {
							        		
							        		//acao do torcedor educado
							        		TE2.Apoiar();
							        		torcedorB1.setText("Torcedor "+"Torcedor "+TE2.getNome()+" "+TE2.getAcao());
							        		
							        		//acao do torcedor mal educado
							        		TME1.Insultar();
							        		torcedorA2.setText("Torcedor "+"Torcedor "+TME1.getNome()+" "+TME1.getAcao());
							        		
							        		//acao do tecnico
							        		tec1.Reclamar();
							        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
							        		
							        		
							        		
							        	}
							        	
							        	//if caso o time 2 não tenha marcado o gol
							        	
							        	else if(time==0) {
							        	
							        		//acao do torcedor educado
							        		TE1.Apoiar();
							        		torcedorA1.setText("Torcedor "+TE1.getNome()+" "+TE1.getAcao());
							        		
							        		//acao do torcedor mal educado
							        		TME2.Insultar();
							        		torcedorB2.setText("Torcedor "+ TME2.getNome()+""+TME2.getAcao());
							        		
							        		//acao do tecnico
							        		tec2.Reclamar();
							        		tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
							        		
							        	}
							        	
							        	 int numero = 0;
							     	    for(int j=0;j<1; j++) {
							     	        numero=radom.nextInt(4);
							     	        System.out.println(">"+numero);
							     	        
							     	        //por que a bola nao entrou
							     	        if(numero == 0 ) {
							     	        	if(goleiro==0) {
							     	        		tec1.Apoiar();
							     	        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
							     	        		labelAcao.setText(g1.getNomeGoleiro()+" Defendeu");
							     	        	}
							     	        }
							     	        	
							     	        	if(goleiro==1) {
							     	        		tec2.Apoiar();
							     	        		tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
							     	        		labelAcao.setText(g2.getNomeGoleiro()+" Defendeu");
							     	        	}
							     	        	
							     	       if(numero == 1 ) {
							     	    	  labelAcao.setText("Bola na Trave");
						    	        	}
							     	       
							     	      if(numero == 2 ) {
							     	    	 labelAcao.setText("Bola pra fora");
						   	        	}
							     	      
							     	     if(numero == 3 ) {
							     	    	Ban1.Intervir();
							     	    	labelBandeirinha.setText("Bandeirinha "+Ban1.getNomeDoBandeirinha()+" "+ Ban1.getAcao());
							     	    	
							     	    	ActionListener taskPerformerrrrr = new ActionListener() {
							     	           @Override
							     	           public void actionPerformed(ActionEvent ae) {
							     	        	   	Ban1.Mensagem();
									     	    	labelBandeirinha.setText("Bandeirinha "+Ban1.getNomeDoBandeirinha()+" "+ Ban1.getAcao());
							     	        	   
							     	        	   
							     	          }
								     	       };
								     	       Timer timerrrrrr = new Timer(2000, taskPerformerrrrr);
								     	       timerrrrrr.setRepeats(false);
								     	       timerrrrrr.start();
							     	          
								     	      ActionListener taskPerformerrrrrrr = new ActionListener() {
								     	           @Override
								     	           public void actionPerformed(ActionEvent ae) {
								     	      Juiz1.Irregularidade();
						     	        	  labelJuiz.setText("Juiz " + Juiz1.getNomeJuiz() + " " + Juiz1.getAcao());
						     	        	 labelAcao.setText("Goleiro se adiantou");
						     	        	 
								     	          }
								     	       };
								     	       Timer timerrrrrrrr = new Timer(3000, taskPerformerrrrrrr);
								     	       timerrrrrrrr.setRepeats(false);
								     	       timerrrrrrrr.start();
							     	    	 
							     	    	 //voltando os status
							     	    	 if(goleiro==0) {
							     	    		 
							     	    		 if(jogador2 == 1) {
							     	    			 jogador2=0;
							     	    			 
							     	    		 }
							     	    		 
							     	    		 if(jogador2 == 2) {
							     	    			 jogador2=1;
							     	    			 
							     	    		 }
							     	    		 
							     	    		 if(jogador2 == 3) {
							     	    			 jogador2=1;
							     	    			 
							     	    		 }
							     	    		 
							     	    		 goleiro =0;
							     	    		 chutes2 -=1;
							     	    		 time=1;
							     	    	 }
							     	    	 
							     	    	 //voltando os status
							     	    	 if(goleiro==1) {
							     	    		 if(jogador1 == 1) {
							     	    			 jogador1=0;
							     	    			 
							     	    		 }
							     	    		 
							     	    		 if(jogador1 == 2) {
							     	    			 jogador1=1;
							     	    			 
							     	    		 }
							     	    		 
							     	    		 if(jogador1 == 3) {
							     	    			 jogador1=1;
							     	    			 
							     	    		 }
							     	    	 }
							     	    	 goleiro = 1;
							     	    	 chutes1 -=1;
							     	    	 time=0;
						   	        	}
							     	    
							        }
							        
							      
							        }
							        if(nume == 1) {
							        
							        	placar.setText(t1.getGols()+ " x " +t2.getGols() );
							        	labelAcao.setText("Batedor acertou");
							        	if(time==1) {
							        		//acao do torcedor educado
							        		TE1.Torcer();	
							        		torcedorA1.setText ("Torcedor "+TE1.getNome()+" "+TE1.getAcao());
							        		
							        		//acao do torcedor mal educado
							        		TME2.Vaiar();
							        		torcedorB2.setText ("Torcedor "+TME2.getNome()+" "+TME2.getAcao());
							        		
							        		//acao do tecnico
							        		tec1.Instruir();
					     	        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
							        	
							        		
									        	 
							        	
							        		result1 +=1;
							        		t1.setGols(result1);

							        	
							        	
							        	}
							        	
							        	else if (time ==0) {
							        		//acao do torcedor educado
							        		TE2.Torcer();	
							        		torcedorB1.setText ("Torcedor "+ TE2.getNome()+" "+TE2.getAcao());
							        		
							        		//acao do torcedor mal educado
							        		TME1.Vaiar();
							        		torcedorA2.setText ("Torcedor "+TME1.getNome()+" "+TME1.getAcao());
							        		
							        		//acao do tecnico
							        		tec2.Instruir();
					     	        		tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
							        	
							        		result2 +=1;
							        		t2.setGols(result2);
							        		
							        		
							        	}
							        placar.setText(t1.getGols()+ " x " +t2.getGols() );
							        }
							    	
							    	
								   }
							      
							    	
							    	
							    	
							 
							  
							  
							  
							  
							  
							  
							  
							  
							    	
							  
							  else if(chutes1 == chutes2 && t1.getGols() > t2.getGols()) {
								  
								//acao do torcedor educado
			     	        		TE1.Comemorar();
			     	        		torcedorA1.setText ("Torcedor "+TE1.getNome()+" "+TE1.getAcao());
			     	        		
			     	        		//acao do torcedor mal educado
			     	        		TME1.Comemorar();
			     	        		torcedorA2.setText ("Torcedor "+TME1.getNome()+" "+TME1.getAcao());
			     	        		
			     	        		//acao do tecnico
			     	        		tec1.Comemorar();
			     	        		tecnicoA.setText("Tecnico "+tec1.getNome()+" "+tec1.getAcao());
			     	        		
								  
			     	        		placar.setText(t1.getGols()+ " x " +t2.getGols() );
					        		JOptionPane.showMessageDialog(null,t1.getNomeDoTime()+ " venceu, fez "+t1.getGols());
					        		
					        	
					        		
					        		t1.setGols(0);
					        		t2.setGols(0);
					        		result1=0;
					        		result2=0;
					        		
					        		jogador1=0;
					        		jogador2=0;
					        		placar.setText(t1.getGols()+ " x " +t2.getGols() );
					        		chutes1=0;
					        		chutes2=0;
					        		time=0;
					        		 
							  }
							  
							  else if (chutes1 == chutes2 && t2.getGols() > t1.getGols()) {
								  
								  	//acao do torcedor educado
			     	        		TE2.Comemorar();
			     	        		torcedorB1.setText ("Torcedor "+TE2.getNome()+" "+TE2.getAcao());
			     	        		
			     	        		//acao do torcedor mal educado
			     	        		TME2.Comemorar();
			     	        		torcedorB2.setText("Torcedor "+ TME2.getNome()+" "+TME2.getAcao());
			     	        		
			     	        		//acao do tecnico
			     	        		tec2.Comemorar();
			     	        		tecnicoB.setText("Tecnico "+tec2.getNome()+" "+tec2.getAcao());
								  
			     	        		placar.setText(t1.getGols()+ " x " +t2.getGols() );
					        	  JOptionPane.showMessageDialog(null,t2.getNomeDoTime()+ " venceu, fez "+t2.getGols());
					        		
					        		
								  
					        		t1.setGols(0);
					        		t2.setGols(0);
					        		result1=0;
					        		result2=0;
					        		
					        		jogador1=0;
					        		jogador2=0;
					        		placar.setText(t1.getGols()+ " x " +t2.getGols() );
					        		 
					        		chutes1=0;
					        		chutes2=0;
					        		time=0;
					        		
							  }
							  }
							  
					    
						}
						
						
					
						
						
						
						ActionListener taskPerforr = new ActionListener() {
					        @Override
					        public void actionPerformed(ActionEvent ae) {
					        	
						gan1.PegarBola();
						labelGandula.setText("Gandula " + gan1.getNomeDoGandula()+" "+gan1.Acao);
						botaoAcao.setVisible(true);
					        }
					    };
					    Timer tin = new Timer(3500, taskPerforr);
					    tin.setRepeats(false);
					    tin.start();
						
					    
					        }
					    };
					    Timer timer = new Timer(3000, taskPerformer);
					    timer.setRepeats(false);
					    timer.start();
					
						
						
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
		tela.add(labelGandula);
		tela.add(labelBandeirinha);
		tela.add(labelJuiz);
		tela.add(timeA);
		tela.add(timeB);
		tela.add(torcidaAtitulo);
		tela.add(torcidaBtitulo);
		tela.add(torcedorA1);
		tela.add(torcedorB1);
		tela.add(torcedorA2);
		tela.add(torcedorB2);
		tela.add(titulo);
		tela.add(placar);
		tela.add(nomeJogador);
		tela.add(nomeGoleiro);
		tela.add(labelAcao);
		tela.add(tecnicoAtitulo);
		tela.add(tecnicoBtitulo);
		tela.add(tecnicoA);
		tela.add(tecnicoB);
		tela.add(botaoVoltar);	
		tela.add(botaoAcao);
		
		JDesktopPane desk = new JDesktopPane(){
	          Image im = (new ImageIcon("ini.jpg")).getImage(); 
	          public void paintComponent(Graphics g){        
	           g.drawImage(im,0,0,this);            }
	                                      };
	        tela.add(desk);
	        JLabel status = new JLabel();
	            status.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	            status.setBounds(0, -100, 1500, 700);
	            status.setIcon(new ImageIcon("ini.jpg"));
	            tela.add(status);    
		
		setSize(900, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);

	}
	
	public static void main(String[] args) {
		IniciarPartida app = new IniciarPartida();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}