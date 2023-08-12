/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2475;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 검증수
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            sum += temp * temp;
        }

        System.out.println(sum % 10);

    }

}
