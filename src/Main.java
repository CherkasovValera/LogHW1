import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 0};
        System.out.println("Массив №1" + Arrays.toString(arr1));
        System.out.println("Массив №2" + Arrays.toString(arr2));
        System.out.println("Разница массивов" + gapArray(arr1, arr2));
        System.out.println("Частное массивов" + delArray(arr1, arr2));
    }

    public static ArrayList<Integer> gapArray(int[] arrayOne, int[] arrayTwo) {
        ArrayList<Integer> finish = new ArrayList<>();
        if (arrayOne == null && arrayTwo == null) {
            throw new RuntimeException("Один из массив пуст");
        }
        if (arrayOne.length != arrayTwo.length) {
            throw new RuntimeException("Массивы не равны");
        }
        for (int i = 0; i < Math.min(arrayOne.length, arrayTwo.length); i++) {
            finish.add(arrayOne[i] - arrayTwo[i]);
        }

        return finish;
    }

    public static ArrayList<Integer> delArray(int[] arrayOne, int[] arrayTwo) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arrayOne == null && arrayTwo == null) {
            throw new RuntimeException("Один из массив пуст");
        }
        if (arrayOne.length != arrayTwo.length) {
            throw new RuntimeException("Массивы не равны");
        }
        for (int j = 0; j < Math.min(arrayOne.length, arrayTwo.length); j++) {
            if (arrayTwo[j] != 0)
                result.add(arrayOne[j] / arrayTwo[j]);
            else
                throw new RuntimeException("Делим на ноль!!!");
        }

        return result;
    }


}