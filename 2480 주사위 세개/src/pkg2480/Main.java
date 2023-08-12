/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2480;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 주사위 세 개
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = 0;

        if (num1 == num2 && num2 == num3) {
            result = 1000 + num1 * 100;
        } else if (num1 == num2 || num2 == num3) {
            result = 1000 + num2 * 100; 
        } else if (num1 == num3) {
            result = 1000 + num1 * 100;
        } else {
            result = Math.max(num1, Math.max(num2, num3));
        }
        
        System.out.println(result);
            

    }

}
