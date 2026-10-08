import java.util.Scanner;
public class Multidimensionalarray {
    public static void main(String[] args) {
//    int [] [] a={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//    for(int i=0;i<a.length;i++){
//        for(int j=0;j<a.length;j++){
//            System.out.print(a[i][j]+" ");
//        }
//        System.out.println();
//    }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix :");
        int size = sc.nextInt();

        int[][] a = new int[size][size];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}