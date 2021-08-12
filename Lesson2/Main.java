package Lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "6", "13", "2"},
                {"3", "5", "22", "14"},
                {"8", "28", "38", "48"},
                {"14", "56", "34", "51"}
        };
        String[][] array2 = {
                {"1", "6", "13", "2"},
                {"3", "5", "22", "14"},
                {"8", "28", "38", "48"},
        };
        String[][] array3 = {
                {"5", "6", "13", "2"},
                {"3", "4", "h", "9"},
                {"8", "2", "fd", "48"},
                {"u", "56", "78", "51"}
        };

        java.util.List<String[][]> inputs = new ArrayList<>(List.of(array1, array2, array3));

        for (String[][] input : inputs) {
            try {
                System.out.println("Сумма элементов массива =" + sumArrayElements(input));
            } catch (MyArraySizeException e) {
                System.out.println("Не корректный размеер массива. Должен быть 4Х4");
            } catch (MyArrayDataException e) {
                System.out.println("Не возможно преобразовать элемент массива " + e.i + ":" + e.j + ". Измените данные в этой ячейке");
            }
        }
    }

    public static int sumArrayElements(final String[][] inputArr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (inputArr.length != 4) {
            throw new MyArraySizeException("Не корректный размер массива, должен быть 4Х4");
        }
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr.length; j++) {
                try {
                    sum += Integer.parseInt(inputArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new MyArraySizeException("Не верный размер массива, должен быть 4Х4");
                }
            }
        }
        return sum;
    }

}
