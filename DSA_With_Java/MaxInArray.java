package DSA_With_Java;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 2, 8, -1, 4 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }

}
