
final class Assalariado extends Empregado {

	private double salarioMensal;

	public Assalariado(String nome, double salarioMensal) {
		super(nome);
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return this.salarioMensal;
	}

	@Override
	public double calcularSalarioMensal() {
		return this.salarioMensal;
	}
	
	public double calcularSalarioMensal (int horasExtrasTrabalhadas) {
		return (((this.salarioMensal/160) * 2) * horasExtrasTrabalhadas) + this.salarioMensal;
	}
}
