import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();

        System.out.print("%Digite o valor 1: ");
        n1.setValor(scan.nextInt());

        System.out.print("%Digite o valor 2: ");
        n2.setValor(scan.nextInt());

        res.setValor(n1.GetValor() + n2.GetValor());
        System.out.printf("A soma de %d com %d é igual a %d", n1.GetValor(), n2.GetValor(), res.GetValor());
    }
}
