package loops;

public class Number15 {
    public static void main(String[] args) {
        int m;
        for (int i = 1; i <= 10; i++) {
            String s = " ";
            for (int j = 2; j <= 5; j++) {
                m = i * j;
                if (i < 10 && m < 10) {
                    System.out.print(j + " * " + i + " =  " + m + "  | ");
                } else {
                    if (i < 10) {
                        System.out.print(j + " * " + i + " = " + m + "  | ");
                    } else {
                        System.out.print(j + " * " + i + " = " + m + " | ");
                    }
                }
            }
            System.out.println(" ");
        }
        System.out.println("______________________________________________________________");
        for (int i = 1; i <= 10; i++) {
            String s = " ";
            for (int j = 6; j <= 9; j++) {
                m = i * j;
                if (i < 10 && m < 10) {
                    System.out.print(j + " * " + i + " =  " + m + "  | ");
                } else {
                    if (i < 10) {
                        System.out.print(j + " * " + i + " = " + m + "  | ");
                    } else {
                        System.out.print(j + " * " + i + " = " + m + " | ");
                    }
                }
            }
            System.out.println(" ");
        }
    }

}
