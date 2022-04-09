import java.util.Scanner;

public class SistemaProjeto2 {
    public static void main(String[] args) {
        // criar um scanner
        Scanner input = new Scanner(System.in);
        int numero1; //primeiro somar
        int numero2; // segundo numero a somar
        int Sum; // soma de numemo1 e numero2

        System.out.println( "digite o primeiro inteiro: "); //prompt
        numero1 = input.nextInt(); // lê primeiro o numero do fornecido pelo usuario

        System.out.println( "digite o segundo inteiro: "); //prompt
        numero2 = input.nextInt(); // lê segundo o numero do fornecido pelo usuario

        Sum = numero1 - numero2;// soma dos numeros , depois armazena o total sem soma
        System.out.println(Sum);// exibe a divisão

    }

}
