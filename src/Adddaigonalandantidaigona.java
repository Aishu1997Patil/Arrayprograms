public class Adddaigonalandantidaigona {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int diagonalSum = 0;
        int antiDiagonalSum = 0;
        for (int i = 0; i < a.length; i++) {
            diagonalSum += a[i][i];
            antiDiagonalSum += a[i][a.length - 1 - i];
        }
        System.out.println("Sum of the diagonal elements: " + diagonalSum);
        System.out.println("Sum of the anti-diagonal elements: " + antiDiagonalSum);
    }
}
