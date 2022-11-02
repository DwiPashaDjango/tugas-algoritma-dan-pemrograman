import java.util.Scanner;

public class soal_1 {
    public static void main(String[] args) {
        int jam, a = 5000, b = 5, c;
        Scanner cek = new Scanner(System.in);

        System.out.println("Masukan Jam Yang Di Pake : ");
        jam = cek.nextInt();

        if (jam == 50) {
            System.out.print("Tarif Anda Di Kenai Biaya : " + a);
        } else {
            c = jam * b + a;
            System.out.print("Tarif Anda Di Kenai Biaya : " + c);
        }
    }
}