/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1271;

import java.util.*;
import java.math.BigInteger;

/**
 *
 * @author 시은
 */
public class Main {

    /**
     * 엄청난 부자2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));      
    }
    
}
