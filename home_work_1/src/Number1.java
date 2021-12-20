public class Number1 {

    public static void main(String[] args) {
        // Задание 1.2
        byte x = 42;    //00101010
        byte y = 15;  //00001111
        byte z = 2;   //00000010
        System.out.println(~x); //11010101
        System.out.println(~y); //11110000
        System.out.println(x & y);    //00101010 & 00001111 = 00001010
        System.out.println(x &= y);   //00101010 & = 00001111 = 00001010
        x = 42;
        System.out.println(y &= x);   //00001111 & = 00101010 =00001010
        y = 15;
        System.out.println(x | y);    //00101010 |00001111 = 00101111
        System.out.println(x |= y);    //00101010 |= 00001111 =00101111
        x = 42;
        System.out.println(y |= x);    //00001111 |= 00101010 =00101111
        y = 15;
        System.out.println(x ^ y);    //00101010 ^ 00001111 = 00100101
        int c = (x << z);
        System.out.println(c);  //00101010 << 00000010 =10101000
        int d = (x >> z);
        System.out.println(d);  //00101010 >> 00000010 = 00001010
        int e = (x >>> z);
        System.out.println(e);  //00101010 >>> 00000010 = 00001010

        // Задание 1.3
        byte k = -42;   //11010110
        byte m = -15;   //11110001
        byte n = 2;   //00000010
        System.out.println(~k); //00101001
        System.out.println(~m); //00001110
        System.out.println(k & m);    // 11010110 & 11110001 = 11010000
        System.out.println(k &= m);   // 11010110 &= 11110001 = 11010000
        k = -42;
        System.out.println(m &= k);   //11110001 &= 11010110 = 11010000
        m = -15;
        System.out.println(k | m);    //11010110 | 11110001 = 11110111
        System.out.println(k |= m);    //11010110 |= 11110001 = 11110111
        k = -42;
        System.out.println(m |= k);    //11110001 |= 11010110 = 11110111
        m = -15;
        System.out.println(k ^ m);    //11010110 ^ 11110001 = 00100111
        int c1 = (k << n);
        System.out.println(c1);  //11010110 << 00000010 = 01011000
        int d1 = (k >> n);
        System.out.println(d1);  //11010110 >> 00000010 = 11110101
        int e1 = (k >>> n);
        System.out.println(e1);  //11010110 >>> 00000010 = 11110101

        // Задание 1.5
       // double l = 42.5;
       // System.out.println(~l);
        //java: illegal start of expression
        //Побитовые операторы работают с целыми числами

    }
}

