import java.util.ArrayList;

public class ProgramaPrincipalEmpregado {

	public static void main(String[] args) {

		Assalariado e01 = new Assalariado("Jose", 1000.00);
		Comissionado e02 = new Comissionado("Du", 0.23);
		FixoComissionado e03 = new FixoComissionado("Bill", 0.23, 1000);
		Horista e04 = new Horista("Cesar", 10.00);

		System.out.printf("Nome:%20s\n","Salario: R$");

		ArrayList<Empregado> array = new ArrayList<>();
		array.add(e01);
		array.add(e02);
		array.add(e03);
		array.add(e04);

		for (Empregado empregado : array) {
			imprimeHolerite(empregado);
		}

	}

	public static void imprimeHolerite(Empregado empregado) {
		System.out.printf("%s%20s\n",empregado.getNome(),empregado.calcularSalarioMensal());
	}
}
