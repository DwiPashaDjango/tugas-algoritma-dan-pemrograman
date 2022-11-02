import java.util.Scanner;

public class soal_5 {
    public static void main(String[] args) {
        char gol;
        int kwh, total;
        Scanner cek = new Scanner(System.in);

        System.out.println("Masukan Golongan : ");
        gol = cek.next().charAt(0);
        System.out.println("Masukan Kwh : ");
        kwh = cek.nextInt();

        if (gol == 'A') {
            total = 20 * kwh + 5000;
            System.out.print("Total Pembayaran Listrik Anda Adalah : " + total);
        } else {
            total = 30 * kwh + 7500;
            System.out.print("Total Pembayaran Listrik Anda Adalah : " + total);
        }
    }
}
