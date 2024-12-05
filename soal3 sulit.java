import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan jumlah elemen array");
        int a = scanner.nextInt();
        
        int array[] = new int[a];
        System.out.print("masukkan " + a + " elemen array");
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        for (int num : array) {
            if (num > max) {
             max = num;
         }
     }

        int[] frequency = new int[max + 1];

         for (int num : array) {
         frequency[num]++;
     }

         for (int i = 0; i < frequency.length; i++) {
         if (frequency[i] > 0) {
             System.out.println(i + " muncul " + frequency[i] + " kali");
            }

    }
}
}