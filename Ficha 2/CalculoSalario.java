public class CalculoSalario {
    public static void main(String[] args) {
        double valorHora = 148.00;
        int horasTrabalhadas = 168;
        double irpsPercentual = 9.14 / 100;

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIRPS = salarioBruto * irpsPercentual;
        double salarioLiquido = salarioBruto - descontoIRPS;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
