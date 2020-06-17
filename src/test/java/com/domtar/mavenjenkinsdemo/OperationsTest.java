/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domtar.mavenjenkinsdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luffy
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Operations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 4;
        int expResult = 9;
        int result = Operations.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of mult method, of class Operations.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        int a = 5;
        int b = 4;
        int expResult = 20;
        int result = Operations.mult(a, b);
        assertEquals(expResult, result);
    }
    
}
