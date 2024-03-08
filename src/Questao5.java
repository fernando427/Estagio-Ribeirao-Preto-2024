public class Questao5 {
    public static void main(String[] args) {
        String rev = "Estagio Ribeirao Preto 2024";
        String revertida = "";

        for (int i = rev.length() - 1; i>=0; i--){
            revertida = revertida + rev.charAt(i);
        }

        System.out.println(revertida);
    }
}
