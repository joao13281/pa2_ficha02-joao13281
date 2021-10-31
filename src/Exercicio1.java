public class Exercicio1 {
    public static void main(String[] args) {
        int tamanhoVetor;
        double media = 0;
        //TO DO

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculo da soma de todos os elementos do vetor
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculo da media
        media = sum / numbers.length;
        System.out.println("A media dos valores do vetor é: " + media);
    }
}

