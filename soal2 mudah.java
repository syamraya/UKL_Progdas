
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan minimum");
        int bilanganmin = scanner.nextInt();
        System.out.println("Masukkan bilangan maximum");
        int bilanganmax = scanner.nextInt();

        System.out.println("bilangan minimum: " + bilanganmin);
        System.out.println("bilangan max: " + bilanganmax);

        for (int i = bilanganmin; i <= bilanganmax; i++) {
            if (i %2 ==0) {
                System.out.println(i +" genap");
            } else {
                System.out.println(i + " ganjil");
            }
        }
}
}