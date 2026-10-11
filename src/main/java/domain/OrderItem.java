package domain;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderItem {
    private final UUID productid;
    private final String productNameAtPurchase;
    private final BigDecimal unitPriceAtPurchase;
    private final int quantity;

    public OrderItem(UUID productid, String productNameAtPurchase, BigDecimal unitPriceAtPurchase, int quantity) {
        this.productid = productid;
        this.productNameAtPurchase = productNameAtPurchase;
        this.unitPriceAtPurchase = unitPriceAtPurchase;
        this.quantity = quantity;
    }

    public UUID getProductid() {
        return productid;
    }

    public String getProductNameAtPurchase() {
        return productNameAtPurchase;
    }

    public BigDecimal getUnitPriceAtPurchase() {
        return unitPriceAtPurchase;
    }

    public int getQuantity() {
        return quantity;
    }
}
