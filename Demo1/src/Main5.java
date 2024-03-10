import java.util.Scanner;

public class Main5 {


    public static void main(String[] args) {
        System.out.println("Please input 10 numbers:");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            array[i] = n;
        }
        System.out.println("Your numbers are:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        int length = array.length;
        System.out.println("Please input m:");
        int m = sc.nextInt();

        swap(array, 0, length - m - 1);
        swap(array, length - m, length - 1);
        swap(array, 0, length - 1);
        System.out.println("The new numbers are:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }


    public static void swap(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;
            left++;
            right--;
        }

    }
}
