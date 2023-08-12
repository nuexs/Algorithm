/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2338;

import java.util.*;
import java.math.BigInteger;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        
    }
    
}
