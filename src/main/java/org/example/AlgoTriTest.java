package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class AlgoTriTest {

    @Test
    void test_tri_selection_cas_normal() {
        int[] input = {29, 10, 14, 37, 13};
        int[] expected = {10, 13, 14, 29, 37};
        assertArrayEquals(expected, AlgoTri.tri_selection(input));
    }

    @Test
    void test_tri_selection_deja_trie() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, AlgoTri.tri_selection(input));
    }

    @Test
    void test_tri_selection_inversé() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, AlgoTri.tri_selection(input));
    }

    @Test
    void test_tri_selection_elements_égaux() {
        int[] input = {7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7};
        assertArrayEquals(expected, AlgoTri.tri_selection(input));
    }

    @Test
    void test_tri_selection_tableau_vide() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, AlgoTri.tri_selection(input));
    }

    @Test
    void test_tri_selection_un_element() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, AlgoTri.tri_selection(input));
    }

    @Test
    void test_tri_selection_nombres_negatifs() {
        int[] input = {-3, -1, -7, 4, 0};
        int[] expected = {-7, -3, -1, 0, 4};
        assertArrayEquals(expected, AlgoTri.tri_selection(input));
    }
}