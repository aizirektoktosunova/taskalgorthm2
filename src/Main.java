
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char direction = scanner.next().charAt(0);
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        List<String> operations = rotateMatrix(matrix, n, direction);

        System.out.println(operations.size());
        for (String operation : operations) {
            System.out.println(operation);
        }
    }

    public static List<String> rotateMatrix(int[][] matrix, int n, char direction) {
        List<String> operations = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                if (direction == 'R') {
                    operations.add((i) + " " + (j) + " " + (j) + " " + (n - i - 1));
                    operations.add((i) + " " + (j) + " " + (n - i - 1) + " " + (n - j - 1));
                    operations.add((i) + " " + (j) + " " + (n - j - 1) + " " + (i));
                    k += 3;
                } else if (direction == 'L') {
                    operations.add((i) + " " + (j) + " " + (n - j - 1) + " " + (i));
                    operations.add((i) + " " + (j) + " " + (i) + " " + (n - j - 1));
                    operations.add((i) + " " + (j) + " " + (j) + " " + (n - i - 1));
                    k += 3;
                }
            }
        }

        return operations;
    }
}













