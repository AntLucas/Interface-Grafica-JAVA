package classes;

public class Juiz {
	
	private String NomeDoJuiz;
	public String Acao;
	
	public void Apitar() {
		Acao = "(Apita)";
	}
	
	public void Expulsar() {
		
	}
	
	public void Irregularidade() {
		Acao = "Diz: \"Volta a jogada, goleiro se adiantou\"";
	}
	
	public void Cartao(){
		
	}
	
	public void Anular() {
		
	}
	
    public String getNomeJuiz()
    {
        return NomeDoJuiz;
    }

    public void setNomeDoJuiz(String NomeDoJuiz)
    {
        this.NomeDoJuiz = NomeDoJuiz;
    }
	
    public String getAcao()
    {
    	
        return Acao;
       
    }

    public void setAcao(String Acao)
    {
        this.Acao = Acao;
    }
}
