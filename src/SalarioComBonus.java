import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String nome = input.next();

        double salarioFixo = input.nextDouble();
        double totalVendasEfetuadas = input.nextDouble();

        double reajusteSalarial = totalVendasEfetuadas * 0.15;

        double salarioTotal = salarioFixo + reajusteSalarial;

        System.out.printf("TOTAL = R$ %.2f\n" , salarioTotal);



    }


}
