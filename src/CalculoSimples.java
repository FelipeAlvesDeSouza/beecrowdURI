import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String linha = input.nextLine();

        String[] valores = linha.split(" ");

        int codigoPeca1 = Integer.parseInt(valores[0]);
        int  quantidadeDePeca1 = Integer.parseInt(valores[1]);
        double valorDaPeca1 = Double.parseDouble(valores[2]);

        linha = input.nextLine();

        valores = linha.split(" ");

        valores = linha.split(" ");

        int codigoPeca2 = Integer.parseInt(valores[0]);
        int  quantidadeDePeca2 = Integer.parseInt(valores[1]);
        double valorDaPeca2 = Double.parseDouble(valores[2]);

        double valorTotalAPagar = (quantidadeDePeca1 * valorDaPeca1) + (quantidadeDePeca2 * valorDaPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valorTotalAPagar);

    }
}
