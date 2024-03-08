public class Questao3 {
    public static void main(String[] args) {
        System.out.println("Questão a) lógica: aumenta de 2 em 2 começando em 1");
        for (int i=1; i<=9; i+=2) {
            System.out.print(i + ", ");
        }
        System.out.println("");

        System.out.println("Questão b) lógica: dobra cada número começando em 2");
        for (int i=2; i<=128; i*=2) {
            System.out.print(i + ", ");
        }
        System.out.println("");

        System.out.println("Questão c) lógica: soma-se cada número ímpar ao valor anterior começando em 0");
        int n = 0;
        for (int i=0; i<14; i++) {
            if(i == 0 || i % 2 != 0) {
                n = n+i;
                System.out.print(n + ", ");
            }
        }
        System.out.println("");

        System.out.println("Questão d) lógica: é a do quadrado dos números pares");
        for (int i=2; i<11; i++) {
            n = i;
            if(i % 2 == 0) {
                n = n*n;
                System.out.print(n + ", ");
            }
        }
        System.out.println("");

        System.out.println("Questão e) lógica: é a sequência de fibonacci");
        int fib1 = 0;
        int fib2 = 1;
        System.out.print(1 + ", ");
        for (int fib3=fib1+fib2; fib3<=13; fib3=fib1+fib2) {
            System.out.print(fib3 + ", ");
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println("");

        System.out.println("Questão f) lógica: todos os números começam com a letra D, o próximo seria 200");

    }
}
