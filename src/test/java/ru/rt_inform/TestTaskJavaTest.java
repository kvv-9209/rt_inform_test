package ru.rt_inform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TestTaskJavaTest {

    @Test
    void testAssociativeArray() throws Exception {
        List<Integer> listNumbers = List.of(1, 3, 4, 5, 1, 5, 4);

        Map<Integer, Integer> integerMapExpected = new HashMap<>();
        integerMapExpected.put(1, 2);
        integerMapExpected.put(3, 1);
        integerMapExpected.put(4, 2);
        integerMapExpected.put(5, 2);

        Map<Integer, Integer> integerMapActual = TestTaskJava.associativeArray(listNumbers);

        assertEquals(integerMapExpected, integerMapActual);
    }


    @Test
    void testAssociativeArrayException() {
        List<Integer> listNumbers = List.of();
        Assertions.assertThrows(Exception.class, () -> TestTaskJava.associativeArray(listNumbers));
    }
}