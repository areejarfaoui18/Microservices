package com.example.subscriptionpms.repository;

import com.example.subscriptionpms.entity.subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<subscription, Long> {
    List<subscription> findByUserId(String userId);
}
