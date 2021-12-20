package loops;

import java.util.Scanner;

public class Number144 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = 1;
        System.out.println("Введите целочисленоое число ");
        long exp = scan.nextLong();
        boolean x = true;
        while(x == true){
            try {
                a = Math.multiplyExact(a,exp);
            }
            catch (ArithmeticException ext){
                System.out.println("Максимальное значение до переполнения: " + a);
                a = a * exp;
                x = false;
                System.out.println("Максимальное значение после переполнения: " + a);
            }
        }
    }
}
