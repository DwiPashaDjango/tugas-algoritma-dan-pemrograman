import java.util.Scanner;

public class soal_4 {
    public static void main(String[] args) {
        int a;
        Scanner cek = new Scanner(System.in);

        System.out.print("Masukan Bilangan : ");
        a = cek.nextInt();

        if (a > 0) {
            System.out.print(a + " Adalah Bilangan Positif");
        } else {
            System.out.print(a + " Adalah Bilangan Negatif");   
        }
    }
}
