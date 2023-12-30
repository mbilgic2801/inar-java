package week7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question_07_01Test {
    private static int testCaseNumber = 1;

    @AfterEach
      void herTestOncesi() {
        System.out.println("Test Numarası: " + testCaseNumber);
        testCaseNumber++;

    }

    @Test
    public void testSomething1() {
        assertFalse(Question_07_01.isValid('A'));
        assertTrue(Question_07_01.isValid('a'));
    }
    @Test
    public void testSomething2() {
        assertFalse(Question_07_01.isValid('A'));
        assertTrue(Question_07_01.isValid('a'));
    }
    @Test
    public void testSomething3() {
        assertFalse(Question_07_01.isValid('A'));
        assertTrue(Question_07_01.isValid('a'));
    }
}