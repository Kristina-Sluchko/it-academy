package loops;

public class Number142 {
    public static void main(String[] args) {
        long a = 1;
        long exp = 188;
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
