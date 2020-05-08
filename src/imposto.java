import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, servico, capital, gastosMedicos, gastosEducacionais, impSalario, impServicos, impCapital, impostoTotal;
		double salarioMensal, deducao, maximoDedutivel, impostoDevido;
		
		//Leitura dos dados
		
		System.out.print("Renda anual com salário: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviços: ");
		servico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();
		
		//Calculos
		
		salarioMensal = salario / 12;
		if(salarioMensal < 3000.00) {
			impSalario = 0.00;
		}
			else if(salarioMensal >= 3000.00 && salarioMensal <= 5000.00) {
				impSalario = (salario * 10) / 100;
			}
			else {
				impSalario = (salario * 10) / 100;
			}
		impServicos = (servico * 15) / 100;
		impCapital = (capital * 20) / 100;
		
		impostoTotal = impSalario + impServicos + impCapital;
		deducao = gastosMedicos + gastosEducacionais;
		
		maximoDedutivel = (impostoTotal * 30) / 100;
		
		//Relatorio
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA:");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário = %.2f%n", impSalario);
		System.out.printf("Imposto sobre serviços = %.2f%n", impServicos);
		System.out.printf("Imposto sobre ganho de capital = %.2f%n", impCapital);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", deducao);
		
		sc.close();
	}

}
