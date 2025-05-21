package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void test_addition() {
        assertEquals(17, Calculatrice.addition(12, 5));
        assertEquals(12.0f, Calculatrice.addition(5.f, 7.f));
        assertEquals(-5, Calculatrice.addition(-10, 5));
    }

    @Test
    void test_soustraction() {
        assertEquals(7, Calculatrice.soustraction(12, 5));
        assertEquals(-2.0f, Calculatrice.soustraction(5.f, 7.f));
    }

    @Test
    void test_multiplication() {
        assertEquals(60, Calculatrice.multiplication(12, 5));
        assertEquals(35.0f, Calculatrice.multiplication(5.f, 7.f));
        assertEquals(0, Calculatrice.multiplication(5, 0));
    }

    @Test
    void test_division() {
        assertEquals(3, Calculatrice.division(15, 5));
        assertEquals(2.f, Calculatrice.division(10.f, 5.f));
        assertThrows(ArithmeticException.class, () -> Calculatrice.division(5, 0));
    }
}