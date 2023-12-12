import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        size = scanner.nextInt();

        if (size > 20) {
            System.out.println("The size is bigger 20");
        }else {
            array = new int[size];
            for (int i = 0; i<array.length ; i++) {
                System.out.print("enter the element" + (i+1) + ":");
                array[i] = scanner.nextInt();
            }
            System.out.println("element in array");
            for (int i = 0 ; i<array.length ; i++) {
                System.out.print(array[i]);
            }
            for (int i = 0 ; i < array.length / 2 ; i++) {
                int temp = array[i];
                array[i] = array[size - 1 - i];
                array[size - 1 - i] = temp;
            }
            System.out.println("\nReverse array");
            for (int i = 0 ; i<array.length ; i++){
                System.out.print(array[i]);
            }
        }
    }
}