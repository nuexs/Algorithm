/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3003;

import java.util.*;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 킹, 퀸, 룩, 비숍, 나이트, 폰 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는
     * 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};

        int[] piece = new int[6];

        for (int i = 0; i < piece.length; i++) {
            piece[i] = sc.nextInt();
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - piece[i] + " ");
        }
        
        System.out.println();
    }

}
