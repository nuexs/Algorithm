/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2083;

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

        while (true) {
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();

            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }

        }

    }
}
