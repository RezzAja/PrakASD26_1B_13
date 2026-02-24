public class p1_Tugas {
    public static void main(String[] args) {
        // Data Algoritma 2D - 2025-2026
        char[][] grid = {
            {'A', 'B', 'A', 'N', 'T', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'D', 'T', 'A', 'X', 'X', 'N', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'C', 'M', 'K', 'D', 'L', 'D', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'B', 'B', 'N', 'R', 'U', 'N', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'E', 'A', 'S', 'X', 'O', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'B', 'S', 'O', 'D', 'D', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'X', 'O', 'T', 'D', 'K', 'D', 'O', 'A', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
            {'E', 'R', 'I', 'A', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'L', 'S', 'U', 'N', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' ', ' ', ' '},
            {'S', 'M', 'E', 'A', 'O', 'R', 'A', 'N', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'T', 'E', 'D', 'A', 'I', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
        
        System.out.println("========================================");
        System.out.println("Algoritma Dataset 2025-2026");
        System.out.println("========================================");
        System.out.println();
        
        // Tampilkan grid dengan format kolom
        System.out.print("   ");
        for (int j = 0; j < grid[0].length; j++) {
            System.out.print((j < 10 ? j : (char)('A' + j - 10)) + " ");
        }
        System.out.println();
        
        // Tampilkan setiap baris dengan nomor/label
        char[] rowLabels = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
        for (int i = 0; i < grid.length; i++) {
            System.out.print(rowLabels[i] + "  ");
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ' ') {
                    System.out.print("- ");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("========================================");
        
        // Hitung jumlah elemen total dan yang terisi
        int totalElements = 0;
        int filledElements = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                totalElements++;
                if (grid[i][j] != ' ') {
                    filledElements++;
                }
            }
        }
        
        System.out.println("Total Elements: " + totalElements);
        System.out.println("Filled Elements: " + filledElements);
        System.out.println("Empty Elements: " + (totalElements - filledElements));
        System.out.println("Percentage Filled: " + String.format("%.2f%%", (filledElements * 100.0 / totalElements)));
        System.out.println("========================================");
    }
}
