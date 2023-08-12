/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2739;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n * i);

        }
    }
}
