
public class Comissionado extends Empregado {

	private double taxaComissao;

	public Comissionado(String nome, double taxaComissao) {
		super(nome);
		this.taxaComissao = taxaComissao;
	}

	public double getTaxaComissao() {
		return this.taxaComissao;
	}

	@Override
	public double calcularSalarioMensal() {
		return 500;
	}
	
	public double calcularSalarioMensal(double valorVendasMes){
		return (calcularSalarioMensal() + (valorVendasMes * this.taxaComissao));
	}
}
