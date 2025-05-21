package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart cart;
    private Product livre;
    private Product stylo;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        livre = new Product("Livre", 15.0);
        stylo = new Product("Stylo", 2.5);
    }

    @Test
    void test_creation_panier_vide() {
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

    @Test
    void test_ajout_de_produits() {
        cart.addProduct(livre);
        cart.addProduct(stylo);

        assertEquals(2, cart.getItemCount());
        assertEquals(17.5, cart.getTotalPrice());
    }

    @Test
    void test_total_correct_apres_ajout() {
        cart.addProduct(new Product("Ordinateur", 1000.0));
        cart.addProduct(new Product("Souris", 25.0));
        assertEquals(1025.0, cart.getTotalPrice());
    }

    @Test
    void test_add_product_null() {
        assertThrows(IllegalArgumentException.class, () -> cart.addProduct(null));
    }

    @Test
    void test_product_prix_negatif() {
        assertThrows(IllegalArgumentException.class, () -> new Product("Produit invalide", -10.0));
    }

    @Test
    void test_vider_panier() {
        cart.addProduct(new Product("Chaussures", 60.0));
        cart.addProduct(new Product("Chaussettes", 5.0));

        assertEquals(2, cart.getItemCount());

        cart.clearCart();

        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

    @Test
    void test_remove_produit() {
        cart.addProduct(livre);
        cart.addProduct(stylo);
        cart.removeProduct(livre);

        assertEquals(1, cart.getItemCount());
        assertEquals(2.5, cart.getTotalPrice());
    }

    @Test
    void test_remove_produit_non_existant() {
        cart.addProduct(stylo);
        Product gomme = new Product("Gomme", 1.0);
        cart.removeProduct(gomme);

        assertEquals(1, cart.getItemCount());
        assertEquals(2.5, cart.getTotalPrice());
    }

    @Test
    void test_remove_exeption() {
        assertThrows(IllegalArgumentException.class, () -> cart.removeProduct(null));
    }

    @Test
    void test_remove_panier_vide() {
        Product clavier = new Product("Clavier", 30.0);
        cart.removeProduct(clavier);

        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

}
