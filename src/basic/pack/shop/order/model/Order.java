package basic.pack.shop.order.model;

import basic.pack.shop.member.model.Member;
import basic.pack.shop.product.model.Product;

public class Order {

    long id;

    Member member;
    Product product;

    public Order(Member member, Product product) {
        this.member = member;
        this.product = product;
    }
}
