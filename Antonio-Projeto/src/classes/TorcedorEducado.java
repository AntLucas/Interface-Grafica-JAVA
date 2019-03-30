package classes;


public class TorcedorEducado {
	private String NomeDoTorcedorEducado;
	private String NomeDoTime;
	public String Acao;
	public void Apoiar() {
	
		Acao = "Diz: \"Na próxima você acerta\"";
		
	}
	public void Comemorar() {
		Acao = "Diz: \" Boa jogo time! \"";
	}
	public void Torcer() {
		Acao = "Diz: \"Belo chute\"";
	}
	
	public String getNome()
    {
        return NomeDoTorcedorEducado;
    }

    public void setNome(String NomeDoTorcedorEducado)
    {
        this.NomeDoTorcedorEducado = NomeDoTorcedorEducado;
    }
	
	public String getNomeDoTime()
    {
        return NomeDoTime;
    }

    public void setNomeDoTime(String NomeDoTime)
    {
        this.NomeDoTime = NomeDoTime;
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
