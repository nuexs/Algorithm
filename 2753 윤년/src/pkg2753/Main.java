/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2753;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }

}
