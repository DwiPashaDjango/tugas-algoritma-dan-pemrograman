import java.util.Scanner;

public class soal_2 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner cek = new Scanner(System.in);

        System.out.println("Masukan Bilangan : ");
        a = cek.nextInt();
        System.out.print("Masukan Bailangan Kedua : ");
        b = cek.nextInt();

        if (a + b < 10) {
            c = a - b;
            System.out.println("Jumlah Bilangan Adalah : " + c);
        } else {
            c = a + b;
            d = 2 * c + b;
            System.out.println("Jumlah Bilangan Adalah : " + c + d);
        }
    }
}
