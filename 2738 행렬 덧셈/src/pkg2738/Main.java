/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2738;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
                if(j == m-1) {
                    System.out.println();
                }
            }
            
        }
        
    }
    
}
