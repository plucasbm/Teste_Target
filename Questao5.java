import java.util.Scanner;

public class Questao5 {
    public static void main(String [] args) {
        Scanner usuario = new Scanner(System.in);
        String entrada;
        String saida = "";

        System.out.println("Insira uma palavra qualquer: ");
        entrada = usuario.next();

        for(int i = entrada.length() - 1; i >= 0; i--){
            saida = saida + entrada.charAt(i);
        }

        System.out.println(saida);
    }
}
