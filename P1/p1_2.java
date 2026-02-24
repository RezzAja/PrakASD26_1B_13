import java.util.Scanner;

public class p1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input NIM: ");
        String nim = input.nextLine().trim();
        

        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            // Bilangan ganjil dicetak dengan simbol *
            else if (i % 2 == 1) {
                System.out.print("* ");
            }
            // Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
            else {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        input.close();
    }
}
