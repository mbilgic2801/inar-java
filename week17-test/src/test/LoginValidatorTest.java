package test;

import main.LoginValidator;
import org.junit.jupiter.api.*;

public class LoginValidatorTest {
    public static int testCaseCounter = 1;

    @BeforeAll
    static void setup() {
        System.out.println("Setting up shared resources...");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting a new test...");
    }

    @Test
    void testCase01() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new LoginValidator().validateUsername("mbilgic2801@icloud.com"), "Check whether e-mail is valid or not");
        testCaseCounter++;
    }

    @Test
    void testCase02() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validateUsername("mbilgic2801icloud.com"), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase03() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validateUsername("mbilgic2801@"), "Check whether e-mail is valid or not");
        testCaseCounter++;
    }

    @Test
    void testCase04() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validateUsername("mbilgic2801@-_icloud.com"), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase05() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validateUsername(""), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase06() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validateUsername(null), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase07() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new LoginValidator().validatePassword("mbilgic5%"), "Check whether e-mail is valid or not");
        testCaseCounter++;
    }

    @Test
    void testCase08() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validatePassword("mbilgic2801"), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase09() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validatePassword("mbilgicmbilgic"), "Check whether e-mail is valid or not");
        testCaseCounter++;
    }

    @Test
    void testCase10() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validatePassword("mbil%c2"), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase11() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validatePassword("mbilgic2801%mbilgic2801%"), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase12() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validatePassword(""), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @Test
    void testCase13() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertFalse(new LoginValidator().validatePassword(null), "Check whether e-mail is valid or not");
        testCaseCounter++;

    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after a test...");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Cleaning up shared resources...");
    }
}
