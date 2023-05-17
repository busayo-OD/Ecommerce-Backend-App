package com.busayo.ecommercebackend.repository;

import com.busayo.ecommercebackend.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Page<Order> findByStatus(String status, Pageable pageable);
    List<Order> findByUserId(Long userId);
}
