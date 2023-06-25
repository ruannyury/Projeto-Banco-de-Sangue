public class Conta {
	
	private String numero;
	private double saldo;

	public Conta(String numero) {
		// TODO Auto-generated constructor stub
	    this.numero = numero;
	    saldo = 0;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		saldo = saldo - valor;
	}
	
	public String numero() {
		return numero;
	}
	
	public double saldo() {
		return saldo;
	}
	

}
