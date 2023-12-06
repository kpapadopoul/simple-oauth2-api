package com.example.simpleoauth2api.model;

public final class OrderBuilder {
    private Long id;
    private String description;
    private OrderStatus status;

    private OrderBuilder() {
    }

    public static OrderBuilder anOrder() {
        return new OrderBuilder();
    }

    public OrderBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public OrderBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public OrderBuilder withStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    public Order build() {
        Order order = new Order();
        order.setId(id);
        order.setDescription(description);
        order.setStatus(status);
        return order;
    }
}
