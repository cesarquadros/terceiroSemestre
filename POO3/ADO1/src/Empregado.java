
public abstract class Empregado {

	protected String nome;
	
	public Empregado(String nome) {
		this.nome = nome;
	}

	final public String getNome() {
		return this.nome;

	}
	
	public abstract double calcularSalarioMensal();

}
