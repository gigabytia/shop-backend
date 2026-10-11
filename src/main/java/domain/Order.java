package domain;

import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID orderId;
    private final List<OrderItem> orderItems;
    private final UUID userId;

    public Order(List<OrderItem> orderItems, UUID userId) {
        this.orderId = UUID.randomUUID();
        this.orderItems = orderItems;
        this.userId = userId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public UUID getUserId() {
        return userId;
    }
}
