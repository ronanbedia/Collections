package collections;

public class Collections {

	private String nome;
	private String validade;
	private int quant;
	private int Lote;

	public Collections(String nome, String validade, int quant, int Lote) {
		this.nome = nome;
		this.validade = validade;
		this.Lote = Lote;
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	@Override
	public String toString() {
		return nome + " | Validade: " + validade + "| Unidades: " + quant + " |  Lote n°: " + Lote;
	}

}

