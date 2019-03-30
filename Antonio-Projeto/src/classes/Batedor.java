package classes;


public class Batedor {
	private String NomeDoTime;
	private String NomeDoJogador;
	public String Acao;
	
	public void Chutar() {
		Acao =  "";
	}
	
	public void Comemorar() {
		Acao =  "";
	}
	
	public void Reclamar() {
		Acao =  "";
	}
	
	public void Apoiar() {
		Acao =  "";
	}
	
	public void Arrumar() {
		Acao =  "";
	}
	
	public String getTime()
    {
        return NomeDoTime;
    }

    public void setNomeDoTime(String NomeDoTime)
    {
        this.NomeDoTime = NomeDoTime;
    }
    
    public String getNomeJogador()
    {
        return NomeDoJogador;
    }

    public void setNomeDoJogador(String NomeDoJogador)
    {
        this.NomeDoJogador = NomeDoJogador;
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
