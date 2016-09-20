
public class FixoComissionado extends Comissionado {

	private double salarioBase;
	
	public FixoComissionado(String nome, double taxaComissao, double salarioBase) {
		super(nome, taxaComissao);
		this.salarioBase = salarioBase;
	}
	
	@Override
	public double calcularSalarioMensal() {
		return super.calcularSalarioMensal() + this.salarioBase;
	}

}
