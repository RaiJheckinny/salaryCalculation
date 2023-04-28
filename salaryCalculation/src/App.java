import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int numeroDoFuncionario, horasTrabalhadas;
        double salario, valorHoraTrabalhada;
        
        System.out.printf("Qual seu número de funcionario: ");
        numeroDoFuncionario = sc.nextInt();
        
        System.out.printf("%nOlá, Funcionario %d, no último mês quantas horas você trabalhou? ", numeroDoFuncionario);
        horasTrabalhadas = sc.nextInt();
        
        valorHoraTrabalhada = 15.55;
        salario = valorHoraTrabalhada*horasTrabalhadas;
        
        System.out.printf("%nO Funcionario %d, trabalhadou %d horas, seu sálario e U$ %.2f%n", numeroDoFuncionario, horasTrabalhadas,  salario);
    }
}
