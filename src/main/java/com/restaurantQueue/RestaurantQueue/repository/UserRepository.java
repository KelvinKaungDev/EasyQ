package com.restaurantQueue.RestaurantQueue.repository;

import com.restaurantQueue.RestaurantQueue.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);


    boolean existsByEmail(String email);

}
