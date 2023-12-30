package test;

import main.SubscriptionManager;
import org.junit.jupiter.api.*;

public class SubscriptionManagerTest {
    public static int testCaseCounter = 1;
    SubscriptionManager mehmet;

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
        mehmet=new SubscriptionManager();
        String result=mehmet.configureSubscription(SubscriptionManager.SubscriptionTier.FREE, SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED",result);
        testCaseCounter++;
    }
    @Test
    void testCase02() {
        mehmet=new SubscriptionManager();
        String result=mehmet.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED",result);
        testCaseCounter++;
    }
    @Test
    void testCase03() {
        mehmet=new SubscriptionManager();
        String result=mehmet.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM, SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED",result);
        testCaseCounter++;
    }
    @Test
    void testCase04() {
        mehmet=new SubscriptionManager();
        String result=mehmet.configureSubscription(SubscriptionManager.SubscriptionTier.FREE, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED",result);
        testCaseCounter++;
    }
    @Test
    void testCase05() {
        mehmet=new SubscriptionManager();
        String result=mehmet.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD, SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED",result);
        testCaseCounter++;
    }
    @Test
    void testCase06() {
        mehmet=new SubscriptionManager();
        String result=mehmet.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        System.out.println("Running Test Case " + testCaseCounter);
        Assertions.assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED",result);
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
