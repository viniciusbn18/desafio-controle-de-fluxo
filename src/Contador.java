import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o primeiro.");
        }

        sc.close();
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        } else {
            int resultado = num2 - num1;
            System.out.println("Laço: ");
            for (int i = 1; i <= resultado; i++) {
                System.out.println(i);
            }
        }
    }

}
