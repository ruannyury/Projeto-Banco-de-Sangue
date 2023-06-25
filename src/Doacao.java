
public class Doacao {
	
	private int quantBolsas;
	private String tipoSangue;
	private Doador doador;

	public Doacao(int quantBolsas, Sangue sangue, String nomeDoador) {
		this.quantBolsas = quantBolsas;
		this.tipoSangue = sangue.retornaTipoSanguineo();
	}
	
	public int retornaQuantBolsas() {
		return this.quantBolsas;
	}

}
