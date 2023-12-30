
import main.*;
import org.junit.jupiter.api.*;
public class AgeRestrictionValidatorTest {
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
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertFalse(new AgeRestrictionValidator().isEligible(17), "Check whether the age is restricted or not");
        testCaseCounter++;
    }
    @Test
    void testCase02() {
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertTrue(new AgeRestrictionValidator().isEligible(18), "Check whether the age is restricted or not");
        testCaseCounter++;
    } @Test
    void testCase03() {
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertTrue(new AgeRestrictionValidator().isEligible(19), "Check whether the age is restricted or not");
        testCaseCounter++;
    } @Test
    void testCase04() {
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertTrue(new AgeRestrictionValidator().isEligible(64), "Check whether the age is restricted or not");
        testCaseCounter++;
    } @Test
    void testCase05() {
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertTrue(new AgeRestrictionValidator().isEligible(65), "Check whether the age is restricted or not");
        testCaseCounter++;
    } @Test
    void testCase06() {
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertFalse(new AgeRestrictionValidator().isEligible(66), "Check whether the age is restricted or not");
        testCaseCounter++;
    } @Test
    void testCase07() {
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertFalse(new AgeRestrictionValidator().isEligible(0), "Check whether the age is restricted or not");
        testCaseCounter++;
    }
    @Test
    void testCase08() {
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertFalse(new AgeRestrictionValidator().isEligible(100), "Check whether the age is restricted or not");
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

