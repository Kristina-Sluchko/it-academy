package loops;

public class Number2 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        long a = Integer.parseInt(args[0]);
        long b;
        for (int i = 0; a > 0; i++){
            b = a % 10;
            System.out.print(b);
            a = a / 10;
            if (i < a){
                System.out.print(" * ");
            }

        }


    }
}
