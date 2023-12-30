package test;

import main.OrderStatusManager;
import org.junit.jupiter.api.*;

public class OrderStatusManagerTest {
    public static int testCaseCounter = 1;
    OrderStatusManager orderStatusManager;

    @BeforeAll
    static void setup() {
        System.out.println("Setting up shared resources...");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting a new test...");
        orderStatusManager = new OrderStatusManager();
    }

    @Test
    void testTransitionFromNewToPending() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.NEW);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.PENDING,"State should transit from NEW to PENDING");
        testCaseCounter++;
    }

    @Test
    void testTransitionFromPendingToShipped() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.PENDING);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.SHIPPED,"State should transit from PENDING to SHIPPED");
        testCaseCounter++;
    }

    @Test
    void testTransitionFromShippedToDelivered() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.SHIPPED);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.DELIVERED,"State should transit from SHIPPED to DELIVERED");
        testCaseCounter++;
    }

    @Test
    void testNoTransitionFromDelivered() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.DELIVERED);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.DELIVERED,"State shouldn't transit from DELIVERED");
        testCaseCounter++;
    }

    @Test
    void testNoTransitionFromCancelled() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.CANCELLED);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.CANCELLED,"State shouldn't transit from CANCELLED");
        testCaseCounter++;
    }

    @Test
    void testCancelFromNew() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = OrderStatusManager.OrderState.NEW;
        actual = orderStatusManager.cancelOrder(actual);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.CANCELLED,"State should transit from NEW to CANCELLED due to cancellation");
        testCaseCounter++;
    }

    @Test
    void testCancelFromPending() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = OrderStatusManager.OrderState.PENDING;
        actual = orderStatusManager.cancelOrder(actual);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.CANCELLED,"State should transit from PENDING to CANCELLED due to cancellation");
        testCaseCounter++;
    }

    @Test
    void testNoCancellationFromAlreadyShipped() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = OrderStatusManager.OrderState.SHIPPED;
        actual = orderStatusManager.cancelOrder(actual);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.SHIPPED,"No cancellation from SHIPPED state");
        testCaseCounter++;
    }

    @Test
    void testNoCancellationFromDelivered() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.DELIVERED);
        orderStatusManager.cancelOrder(actual);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.DELIVERED,"No cancellation from DELIVERED state");
        testCaseCounter++;
    }

    @Test
    void testNoCancellationFromAlreadyCancelled() {
        System.out.println("Running Test Case " + testCaseCounter);
        OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.CANCELLED);
        orderStatusManager.cancelOrder(actual);
        Assertions.assertEquals(actual, OrderStatusManager.OrderState.CANCELLED,"No cancellation from CANCELLED state");
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
