import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: "); // Digite um número que pode ou não estar na sequência
        int n = s.nextInt();
        s.close();

        boolean pass = fib(n);

        System.out.println(pass ? "Pertence a sequência!" : "Não pertence a sequência!");
    }

    public static boolean fib(int n) {
        int fib1 = 0;
        int fib2 = 1;

        if (n == 0 || n == 1) {
            return true;
        } else {
            for (int fib3=fib1+fib2; fib3<=n; fib3=fib1+fib2) {
                if (fib3 == n) {
                    return true;
                }
                fib1 = fib2;
                fib2 = fib3;
            }
        }

        return false;
    }
}
