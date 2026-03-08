package com.bootcamp.service;

import com.bootcamp.model.*;
import com.bootcamp.repository.*;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepo;
    private final ProductRepository productRepo;
    private final CustomerRepository customerRepo;

    /*
     * Crear pedido
     */
    public Order createOrder(Long customerId, List<OrderItem> items) {

        Customer customer = customerRepo.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        Order order = new Order();
        order.setCustomer(customer);

        double total = 0;

        for (OrderItem item : items) {

            Product product = productRepo.findById(item.getProduct().getId())
                    .orElseThrow(() -> new RuntimeException("Product not found"));

            /*
             * Validar stock
             */
            if (product.getStock() < item.getQuantity()) {
                throw new RuntimeException("Not enough stock");
            }

            /*
             * Reducir stock
             */
            product.setStock(product.getStock() - item.getQuantity());

            item.setPrice(product.getPrice());
            item.setOrder(order);

            total += product.getPrice() * item.getQuantity();
        }

        order.setItems(items);
        order.setTotal(total);

        return orderRepo.save(order);
    }

    /*
     * Obtener pedido por ID
     */
    public Order getOrder(Long id) {
        return orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
}