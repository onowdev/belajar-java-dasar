public class OperasiAritmatika {
    public static void main(String[] args) {
        int a = 1000;
        int b = 9000;

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);

        //Augmented Assignments operasi Aritmatika yang bertujuan
        // Mempersingkat Penulisan Perintah
        // cth= a=a+10 >> a+=10

        int C = 100;
        int D = 900;
        C += 90;
        D -= 20;

        System.out.println(C);
        System.out.println(D);

        // Kode Unary Operator

        int e = +100;
        int f = -10;

        e++;
        f--;

        System.out.println(e);
        System.out.println(f);
    }
}
