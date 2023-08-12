/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10807;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
