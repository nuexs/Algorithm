/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4999;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String j = sc.nextLine();
        String doctor = sc.nextLine();

        if (j.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }

}
