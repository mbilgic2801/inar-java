package test;
import main.BankAccount;
import org.junit.jupiter.api.*;
public class BankAccountTest {

    public static int testCaseCounter = 1;
    public BankAccount mehmet;

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
        mehmet=new BankAccount();
        System.out.println("Running Test Case "+testCaseCounter);
        mehmet.deposit(50);

        Assertions.assertTrue(mehmet.getBalance()==50);
        testCaseCounter++;
    }
    @Test
    void testCase02() {
        mehmet=new BankAccount();
        System.out.println("Running Test Case "+testCaseCounter);
        mehmet.deposit(50);
        mehmet.withdraw(25);
        Assertions.assertTrue(mehmet.getBalance()==25);
        testCaseCounter++;
    }
    @Test
    void testCase03() {
        mehmet=new BankAccount();
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertThrows(IllegalArgumentException.class, () -> mehmet.withdraw(75));
        testCaseCounter++;
    }
    @Test
    void testCase04() {
        mehmet=new BankAccount();
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertThrows(IllegalArgumentException.class, () -> mehmet.deposit(-75));
        testCaseCounter++;
    }
    @Test
    void testCase05() {
        mehmet=new BankAccount();
        System.out.println("Running Test Case "+testCaseCounter);
        Assertions.assertThrows(IllegalArgumentException.class, () -> mehmet.withdraw(-75));
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
