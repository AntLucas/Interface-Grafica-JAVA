package classes;

public class Bandeirinha {
	
	private String NomeDoBandeirinha;
	public String Acao;
	
public void Intervir() {
		Acao = "(Levanta a bandeira)";
	}
	
	public void Mensagem() {
		Acao = "Diz: \"O goleiro se adiantou\"";
	}
	
	 public String getNomeDoBandeirinha()
	    {
	        return NomeDoBandeirinha;
	    }

	    public void setNomeDoBandeirinha(String NomeDoBandeirinha)
	    {
	        this.NomeDoBandeirinha = NomeDoBandeirinha;
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
