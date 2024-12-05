
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        String kalimat []=  {"saya angkatan 33","saya anak moklet","saya anak wikusama"};

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan 2x jumlah perulangan yang di inginkan");
        int angka = input.nextInt();
        int jumlahperulangan = input.nextInt();
        for (int i = angka; i >= jumlahperulangan; i--) {
        if (i == angka) {
            System.out.println(i + ". saya senang sekali");
        } else {
            System.out.println(i + ". " + kalimat[i % 3]);
        }

    }
}
}
