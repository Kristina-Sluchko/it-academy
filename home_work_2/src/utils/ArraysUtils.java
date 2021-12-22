package utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("какого размера создать массив: ");
        int j = scan.nextInt();
        int[] data = new int[j];
        for (int i = 0; i < data.length; i++){
            System.out.println("введите элемент № " + i + " массива;");
            data[i] = scan.nextInt();
        }
        return data;
    }
    public static int [] arrayRandom (int size, int maxValueExclusion){
        Random random = new Random();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        //System.out.println(container[1]);
        //int [] container = arrayRandom(5,100);
        for (int i = 0; i < container.length; i++){
            System.out.println(container[i]);
        }
    }
}
