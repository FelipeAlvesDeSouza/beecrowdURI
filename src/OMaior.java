import java.util.Scanner;

public class OMaior {
    public static void main(String[] args)
    {
        /*

        Faça um programa que leia três valores
        e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

        Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
        Um segundo passo, portanto é necessário para chegar no resultado esperado.

        Entrada
        O arquivo de entrada contém três valores inteiros.

        Saída
        Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

        */

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = ( a + b + Math.abs(a - b))  / 2;
        int maiorAC = ( a + c + Math.abs(a - c))  / 2;

        if (maiorAB > maiorAC )
            System.out.println(maiorAB + " eh o maior");
        else
            System.out.println(maiorAC + " eh o maior");

    }
}
