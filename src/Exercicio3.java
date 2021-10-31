import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        //TO DO
        String vetor[] = new String[6];

        vetor[0] = "João";
        vetor[1] = "Teresa";
        vetor[2] = "Pedro";
        vetor[3] = "Maria";
        vetor[4] = "Paulo";
        vetor[5] = "Beatriz";

        //com o .sort você ordena o vetor
        Arrays.sort(vetor);

        //Impressão
        System.out.print ("Os valores da lista ordenada alfabeticamente são: ");
        for (int i = 0 ; i<vetor.length;i++) {
            System.out.print(vetor[i] + ", ");
        }
    }
}
