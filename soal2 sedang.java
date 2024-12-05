
import java.util.Scanner;


public class soal2 {
    static void hitung(int r, int t) {
        double phi = 3.14;
        double result =phi * r * r * t;
        
        System.out.println("volume tabung: " + result);
    }
        
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("masukkan jari jari");
            int jari= scanner.nextInt();
            System.out.println("masukkan tinggi");
            int tinggi= scanner.nextInt();
            hitung(jari, tinggi);
        } 
}
