/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WILL PC
 */
public class ICE4Test {
    
    public ICE4Test() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of method1 method, of class ICE4.
     */
    @Test
    public void testMethod1() {
        //Good test
        System.out.println("method1");
        String word = "telephone";
        char character = 'a';
        ICE4.method1(word, character);
        //Bad test
        /* System.out.println("method1");
        String word = "telephone";
        char character = 'b';
        ICE4.method1(word, character);
         fail("Bad test");
       */
    }

    /**
     * Test of method2 method, of class ICE4.
     */
    @Test
    public void testMethod2() {
        //Good test
        System.out.println("method2");
        char[] array = {'a','b','c'};
        ICE4.method2(array);
        //Bad Test
        /* System.out.println("method2");
        char[] array = {'a','b'};
        ICE4.method2(array);
          fail("Bad test");
        */
    }

    /**
     * Test of method3 method, of class ICE4.
     */
    @Test
    public void testMethod3() {
        //Good Test
        System.out.println("method3");
        String word = "telephone";
        boolean result = ICE4.method3(word);
        assertEquals(true, result);
         //Bad Test
         /*  System.out.println("method3");
        String word = "telephone";
         boolean expResult = false;
        boolean result = ICE4.method3(word);
        assertEquals(expResult, result);
         fail("Bad Test");
        */
    }

   
    }
    

