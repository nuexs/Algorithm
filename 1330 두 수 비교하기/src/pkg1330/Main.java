/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1330;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b) {
            System.out.println(">");
        }
        else if(a < b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }      
                
    }
    
}
