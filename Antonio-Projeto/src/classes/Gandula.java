package classes;

public class Gandula {
	
	private String NomeDoGandula;
	public String Acao;
	public void PegarBola() {
		Acao="(Devolve a Bola)";
	}
	
	public void Irregularidade() {
		
	}
	
	 public String getNomeDoGandula()
	    {
	        return NomeDoGandula;
	    }

	    public void setNomeDoGandula(String NomeDoGandula)
	    {
	        this.NomeDoGandula = NomeDoGandula;
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
