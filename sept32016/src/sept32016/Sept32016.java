/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sept32016;

import java.util.Scanner;

/**
 *
 * @author hrdamole
 */
public class Sept32016 {

    static int sumn(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumn(num - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = scan.nextInt();
        sumn(n);
        System.out.println(sumn(n));

    }
}
