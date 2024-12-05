import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan jumlah elemen array");
        int a = scanner.nextInt();
        
        int array[] = new int[a];
        System.out.print("masukkan " + a + " elemen array");
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }
        boolean duplikat= false;
        boolean adaDuplikat = false;
        System.out.print("Array memiliki elemen duplikat: ");
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + ", ");  // Menampilkan elemen duplikat
                    adaDuplikat = true;
                }
    }
}
        if (!adaDuplikat) {
            System.out.println("Tidak ada item duplikat");
        }
    }
}
