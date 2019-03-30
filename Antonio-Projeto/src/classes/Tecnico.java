package classes;


public class Tecnico {
	private String NomeDoTime;
	private String NomeDoTecnico;
	public String Acao;
	
	
	public void Instruir() {
		Acao =  "Diz: \"Bom chute!\"";
	}
	
	public void Reclamar() {
		Acao =  "Diz: \"Volta a jogada juiz!\"";
	}
	
	public  void Comemorar() {
		Acao =  "Diz: \"Boa time!\"";
	}
	
	public void Apoiar() {
		Acao= "Diz: \"Boa Defesa\"";
	}
	
	public String getTime()
    {
        return NomeDoTime;
    }

    public void setNomeDoTime(String NomeDoTime)
    {
        this.NomeDoTime = NomeDoTime;
    }
    
    public String getNome()
    {
        return NomeDoTecnico;
    }

    public void setNome(String NomeDoTecnico)
    {
        this.NomeDoTecnico = NomeDoTecnico;
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
