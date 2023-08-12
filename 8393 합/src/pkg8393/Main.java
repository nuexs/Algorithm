/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8393;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= n; i++) {
            sum += i;       
        }
        
        System.out.println(sum);
    }
    
}
