/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joses
 */
class FactorialTest {

    @Test
    void testFactorialDeCero() {
        assertEquals(1, Factorial.calcular(0));
    }

    @Test
    void testFactorialDeCinco() {
        assertEquals(120, Factorial.calcular(5));
    }

    @Test
    void testFactorialNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calcular(-1));
    }
}
