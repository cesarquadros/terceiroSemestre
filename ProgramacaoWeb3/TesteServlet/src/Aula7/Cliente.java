package Aula7;

public class Cliente {
	private String nome;
	private String sobreNome;
	private String nascimento;
	private String cpf;
	
	
	public Cliente(String nome, String sobreNome, String nascimento, String cpf) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.nascimento = nascimento;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
