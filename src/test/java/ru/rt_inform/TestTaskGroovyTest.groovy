package ru.rt_inform

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestTaskGroovyTest {

    @Test
    void thisWillFail() {
        def list = [1, 3, 4, 5, 1, 5, 4]
        def actual = TestTaskGroovy.associativeArray(list)
        def expected = [1: 2, 3: 1, 4: 2, 5: 2]
        assert expected == actual
    }

    @Test
    void testAssociativeArrayException() {
        def list = []
        Assertions.assertThrows(Exception.class, () -> {
            TestTaskJava.associativeArray(list)
        })
    }
}
