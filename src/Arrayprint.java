import java.util.Scanner;
public class Arrayprint {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//       for (int i = 0; i < a.length; i++) {
//           System.out.println(a[i] + " ");
//      }
//        for(int i:a){
//            System.out.println(i + " ");
//        }


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++) {
            a[i] = sc.nextInt();
        }
        for(int i:a){
            System.out.println(i + " ");
        }

}
}
