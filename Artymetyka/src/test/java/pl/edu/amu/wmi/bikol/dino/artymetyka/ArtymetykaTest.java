/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.artymetyka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class ArtymetykaTest {
    
    public ArtymetykaTest() {
    }

    @Test
    public void testMnozenie() {
        System.out.println("mnozenie");
        String a = "1";
        String b = "1";
        String expResult = "1";
        String result = Artymetyka.mnozenie(a, b);
        assertEquals(expResult, result);
    }
    
}
