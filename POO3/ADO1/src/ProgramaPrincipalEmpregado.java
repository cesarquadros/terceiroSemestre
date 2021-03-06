import java.text.DecimalFormat;

public class ProgramaPrincipalEmpregado {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("00.00");
		
		Horista horista1 = new Horista("Pablo", 12.00);
		Assalariado assalariado1 = new Assalariado("Cesar", 2000.00);
		FixoComissionado fixoComissionado1 = new FixoComissionado("Adolfo", 0.25, 1200);
		Comissionado comissionado1 = new Comissionado("Lilian", 0.28);
		
		System.out.println("Horista: "+horista1.getNome() + " - Sal�rio: R$"+df.format(horista1.calcularSalarioMensal()));
		System.out.println("Assalariado: "+assalariado1.getNome() + " - Sal�rio: R$"+df.format(assalariado1.getSalarioMensal()));
		System.out.println("Fixo Comissionado: "+fixoComissionado1.getNome() + " - Sal�rio: R$"+df.format(fixoComissionado1.calcularSalarioMensal()));
		System.out.println("Comissionado: "+comissionado1.getNome() + " - Sal�rio: R$"+df.format(comissionado1.calcularSalarioMensal()));
	}
}

