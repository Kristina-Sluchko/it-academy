package loops;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите число которое нужно возвести в степень");
        double vozvodim = scn.nextDouble();
        int step;
        System.out.println("Укажите степень в которую нужно возвести чило");
        do {
            while (!scn.hasNextInt()) {
                if (scn.hasNextDouble()) {
                    System.out.println("Введено не целое число ");
                } else  {
                    System.out.println("Введено не число");
                }
                scn.next();
            }
            step = scn.nextInt();
        } while (step <= 0);
        double n = 1;
        double chislItog = 1;

        for (int i = 1; i < step; i++) {
            n = vozvodim * n;
            chislItog = vozvodim * n;
        }
        System.out.println(vozvodim + " ^ " + step + " = " + chislItog);

    }
}
