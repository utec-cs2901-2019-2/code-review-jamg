import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Sudoku sudoku = new Sudoku();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sudoku");
        sudoku.printBoard();
        while(true) {
            System.out.println("Enter x: ");
            int x = scanner.nextInt();
            System.out.println("Enter y: ");
            int y = scanner.nextInt();
            System.out.println("Enter value: ");
            int value = scanner.nextInt();

            final boolean successfulMove = sudoku.makeMove(x, y, value);
            if (!successfulMove) {
                System.out.println("Invalid move");
            } else {
                sudoku.printBoard();
                if (sudoku.isEnd()) {
                    System.out.println("Win");
                    return;
                }
            }
        }
    }
}
