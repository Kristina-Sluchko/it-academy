package loops;

public class Number1 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        long a = Integer.parseInt(args[0]);
        long b = 1;
        for (int i = 1; i <= a; i++){
            b = b * i;
            System.out.print(i);
            if (i < a){
                System.out.print(" * ");
            }
        }
        System.out.print(" = ");
        System.out.print(b);

    }
}
