
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hrdamole
 */
public class selectionsort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter size of the array:");
        int n = scan.nextInt();
        System.out.println("enter n numbers:");
        int[] array = new int[n];

        for (n = 0; n < array.length; n++) {
            array[n] = scan.nextInt();
        }
        // System.out.print(array[n]);

        System.out.println("Arranged:");
        for (int i = 0; i < array.length; i++) {
            int x = 1;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[x]) {
                    x = j;
                }
            }

            if (x != 1) {
                int temp = array[i];
                array[i] = array[x];
                array[x] = temp;

            }

            System.out.print(array[i] + ",");

        }

    }

;

}
