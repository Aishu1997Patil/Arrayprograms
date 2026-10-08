public class Secondsmallestarray {
    public static void main (String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int s1= a[0];
        int s2 = a[1];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < s1) {
                s2 = s1;
                s1 = a[i];
            }
            else if (a[i] < s2 && a[i] != s1) {
                s2 = a[i];
            }
        }

        System.out.println("Second smallest number in the array is: " + s2);
    }
}
