package classes;


public class TorcedorMalEducado {
	private String NomeDoTorcedorMalEducado;
	private String NomeDoTime;
	public String Acao;
	
	public void Vaiar() {
		Acao =  "Diz: \"Volta Juiz lixo\"";
	}
	
	public void Insultar() {
		Acao =  "Diz: \"Batedor Animal\"";
	}
	public void Comemorar() {
		Acao =  "Diz: \"Aeeeee !@#$&!\"";
	}
	public void Torcer() {
		Acao =  "Diz: \"Gooool\"";
	}

	public String getNomeDoTime()
    {
        return NomeDoTime;
    }

    public void setNomeDoTime(String NomeDoTime)
    {
        this.NomeDoTime = NomeDoTime;
    }
    
    public String getNome()
    {
        return NomeDoTorcedorMalEducado;
    }

    public void setNome(String NomeDoTorcedorMalEducado)
    {
        this.NomeDoTorcedorMalEducado= NomeDoTorcedorMalEducado;
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
