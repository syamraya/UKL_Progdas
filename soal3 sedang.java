import java.util.Random;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] operator = {"*", "/", "%", "-","+"};

        System.out.println("Kuis Matematika (Ketik 'exit' untuk berhenti)");

        while (true) { 
            int bilangan1 = random.nextInt(10) + 1;
            int bilangan2 = random.nextInt(10) + 1;
            String operators = operator[random.nextInt(5)];
            int jawaban = 0;

            
            switch (operators) {
                case "*":
                    jawaban = bilangan1 * bilangan2;
                    break;
                case "/":
                    if (bilangan2 != 0) {
                        jawaban =  bilangan1 / bilangan2;
                    }
                    break;
                case "%":
                    jawaban = bilangan1 % bilangan2;
                    break;
                case "-":
                    jawaban = bilangan1 - bilangan2;
                    break;
                case "+":
                    jawaban = bilangan1 + bilangan2;
                    break;
                default:
                    break;
            }

            System.out.printf("Berapa hasil dari: %d %s %d = ?%n", bilangan1, operators, bilangan2);
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            
            try {
                int jawabanUser = Integer.parseInt(input);
                if (jawabanUser == jawaban) {
                    System.out.println("Benar!");
                } else {
                    System.out.println("Salah! Jawaban yang benar: " + jawaban);
                }
                System.out.println("------------");
                System.out.println();
                
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, silakan masukkan angka!");
            }
        }

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}
