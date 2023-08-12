/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10757;

import java.util.*;
import java.math.BigInteger;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println(a.add(b));
    }
    
}
