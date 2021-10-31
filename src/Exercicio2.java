public class Exercicio2 {
    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int inputNumberArray[] = { 10, 5, 350, 100, 45, 95, 560, 101 };
        int firstLargestNum = 0;
        int secondLargestNum = 0;

        for (int i = 0; i < inputNumberArray.length; i++) {

            if (firstLargestNum < inputNumberArray[i]) {
                secondLargestNum = firstLargestNum;
                firstLargestNum = inputNumberArray[i];

            } else if (secondLargestNum < inputNumberArray[i]) {
                secondLargestNum = inputNumberArray[i];
            }
        }
        System.out.println("O maior elemento Maior1 tem o tem o índice I: " + findIndex(inputNumberArray,firstLargestNum ));
        System.out.println("O maior elemento Maior2 tem o índice J: " + findIndex(inputNumberArray, secondLargestNum));
    }
}
