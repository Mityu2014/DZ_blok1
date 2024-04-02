//Задача: Написать программу, которая из имеющегося массива строк формирует новый массив из строк,
//        длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры,
//        либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями,
//        лучше обойтись исключительно массивами.
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину заполняемого массива: ");
        try {
            int arrayLen = Integer.parseInt(scanner.nextLine());
            String[] array = new String[arrayLen];
            int arrayResultLen = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.print("Ведите данные в элемент массива: ");
                array[i] = scanner.nextLine();
                if (array[i].length() <= 3) {
                    arrayResultLen++;
                }
            }
            String[] arrayResult = new String[arrayResultLen];
            int len = arrayResultLen;
            for (int i = 0; i < array.length; i++) {
                if (array[i].length() <= 3) {
                    arrayResult[arrayResultLen - len] = array[i];
                    len--;
                }
            }
            System.out.println(Arrays.toString(array) + "->" +Arrays.toString(arrayResult));
        }catch (NumberFormatException ex){
            System.out.println("Введено некорректное значение!");
        }
    }
}