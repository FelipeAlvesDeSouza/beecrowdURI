import java.util.Scanner;

public class  CalculoSimples {
    public static void main(String[] args)
    {
        /*

        Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
        o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        Após, calcule e mostre o valor a ser pago.

        Entrada
        O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
        respectivamente dois inteiros e um valor com 2 casas decimais.

        Saída
        A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
        lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
        O valor deverá ser apresentado com 2 casas após o ponto.

        */


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
