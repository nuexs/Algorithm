/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2754;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grade = sc.nextLine();

        switch (grade) {
            case ("A+"):
                System.out.println(4.3);
                break;

            case ("A0"):
                System.out.println(4.0);
                break;

            case ("A-"):
                System.out.println(3.7);
                break;

            case ("B+"):
                System.out.println(3.3);
                break;

            case ("B0"):
                System.out.println(3.0);
                break;

            case ("B-"):
                System.out.println(2.7);
                break;

            case ("C+"):
                System.out.println(2.3);
                break;

            case ("C0"):
                System.out.println(2.0);
                break;

            case ("C-"):
                System.out.println(1.7);
                break;

            case ("D+"):
                System.out.println(1.3);
                break;

            case ("D0"):
                System.out.println(1.0);
                break;

            case ("D-"):
                System.out.println(0.7);
                break;

            case ("F"):
                System.out.println(0.0);
                break;

        }

    }

}
