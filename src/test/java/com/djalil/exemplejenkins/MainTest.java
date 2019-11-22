/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djalil.exemplejenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
//    @org.junit.Test
//    public void testMain() {
//        System.out.println("main");
//        int[] args = [5,8];
//        Main.main(args);
//        int a=5;
//        int b=8
//        int result = Main.main(args);
//        int expResult = a*b;
//    }

    /**
     * Test of produit method, of class Main.
     */
    @Test
    public void testProduit() {
        System.out.println("produit");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Main.produit(a, b);
        assertEquals(expResult, result);
    }
    
}
