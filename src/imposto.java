import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, servico, capital, gastosMedicos, gastosEducacionais;
		
		
		//Leitura dos dados
		
		System.out.print("Renda anual com sal�rio: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�os: ");
		servico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();
		
		
		
		sc.close();
	}

}
