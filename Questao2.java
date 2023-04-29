import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    
    public static void main(String [] args){
        int anterior = 0, atual = 1, aux, numeroTeste;
        Scanner usuario = new Scanner(System.in);
        List<Integer> fibonacci = new ArrayList<>();

        System.out.println("Insira um número qualquer: ");
        numeroTeste = usuario.nextInt();

        for(int i = 0; i < 100; i++){
            aux = atual;
            atual = atual + anterior;
            anterior = aux;

            fibonacci.add(i, atual);
        }

        System.out.println(fibonacci.contains(numeroTeste));
        
    }

}
