package basic.pack.shop.order.service;

import basic.pack.shop.member.model.Member;
import basic.pack.shop.order.model.Order;
import basic.pack.shop.product.model.Product;

public class OrderService {

    public void order(){
        Member member = new Member();
        Product product = new Product();
        Order order = new Order(member, product);
    }
}
