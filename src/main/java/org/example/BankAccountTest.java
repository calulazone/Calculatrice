package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Alexandre", 100);
    }

    @Test
    void creation_compte_valide() {
        assertEquals("Alexandre", account.getOwner());
        assertEquals(100, account.getBalance());
    }

    @Test
    void creation_compte_invalide() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("Alexandre", -100));
    }

    @Test
    void depot_valide() {
        account.deposit(200);
        assertEquals(300, account.getBalance());
    }

    @Test
    void depot_invalide() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-5));
    }

    @Test
    void retrait_valide() {
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void retrait_invalide() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150));
    }

    @Test
    void retrait_invalide_negatif() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5));
    }
}
