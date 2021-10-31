import java.io.IOException;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) throws IOException {
        //input do utilizador
        Scanner kb = new Scanner(System.in);
        int[][] array = new int[2][2];
        int maxI = 0, maxJ = 0;

        //numero de colunas
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //pergunta ao utilizador
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //comparação dos elementos do array
                if (array[i][j] > array[maxI][maxJ]) {
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("O maior valor é: " + array[maxI][maxJ]);
    }

}
