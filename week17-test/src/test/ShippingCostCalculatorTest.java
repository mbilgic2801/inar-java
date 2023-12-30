package test;

import main.ShippingCostCalculator;
import org.junit.jupiter.api.*;

public class ShippingCostCalculatorTest {
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
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(5, "local", "standart") == 5);
        testCaseCounter++;
    }
    @Test
    void testCase02() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(5, "local", "express") == 12.5);
        testCaseCounter++;
    }
    @Test
    void testCase03() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(5, "international", "standart") == 25);
        testCaseCounter++;
    }
    @Test
    void testCase04() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(5, "international", "express") == 62.5);
        testCaseCounter++;
    }
    @Test
    void testCase05() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(0, "local", "standart") == 0);
        testCaseCounter++;
    }
    @Test
    void testCase06() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(0, "local", "express") == 0);
        testCaseCounter++;
    }
    @Test
    void testCase07() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(0, "international", "standart") == 0);
        testCaseCounter++;
    }
    @Test
    void testCase08() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(0, "international", "express") == 0);
        testCaseCounter++;
    }
    @Test
    void testCase09() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(-9, "local", "standart") < 0);
        testCaseCounter++;
    }
    @Test
    void testCase10() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(-9, "local", "express") < 0);
        testCaseCounter++;
    }
    @Test
    void testCase11() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(-9, "international", "standart") < 0);
        testCaseCounter++;
    }
    @Test
    void testCase12() {
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertTrue(new ShippingCostCalculator().calculateCost(-9, "international", "express") < 0);
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
